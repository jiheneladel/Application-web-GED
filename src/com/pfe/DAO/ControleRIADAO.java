package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pfe.Models.ControleRIA;
import com.pfe.Models.RIA;
import com.pfe.Utils.Connector;

public class ControleRIADAO {

	public static boolean ajouterControleRIA(ControleRIA Ct) {

		RIA R = RIADAO.getRIAByCode(Ct.getCodeRIA());
		if (R != null) {
			Connection c = Connector.getConnection();
			PreparedStatement st;
			String sql = "INSERT INTO `ControleRIA` (`id`, `date`, `observation`, `responsable`, `codeRIA`) VALUES (NULL, ?, ?, ?, ?);";
			try {
				st = c.prepareStatement(sql);
				st.setString(1, Ct.getDate());
				st.setString(2, Ct.getObservation());
				st.setString(3, Ct.getResponsable());
				st.setString(4, Ct.getCodeRIA());
				st.executeUpdate();
				return true;
			} catch (SQLException e) {
				return false;
			}
		} else
			return false;

	}

	public static boolean modifierControleRIA(ControleRIA Ct) {

		RIA R = RIADAO.getRIAByCode(Ct.getCodeRIA());
		if (R != null) {
			Connection c = Connector.getConnection();
			PreparedStatement st;
			String sql = "UPDATE `ControleRIA` SET `id`=?,`date`=?,`observation`=?,`responsable`=?,`codeRIA`=? WHERE 'ControleRIA'.'id'=?";
			try {
				st = c.prepareStatement(sql);
				st.setString(1, Ct.getDate());
				st.setString(2, Ct.getObservation());
				st.setString(3, Ct.getResponsable());
				st.setString(4, Ct.getCodeRIA());
				st.setInt(5, Ct.getId());
				st.executeUpdate();
				return true;
			} catch (SQLException e) {
				return false;
			}
		} else
			return false;

	}

	public static boolean supprimerControleRIA(ControleRIA Ct) {

		RIA R = RIADAO.getRIAByCode(Ct.getCodeRIA());
		if (R != null) {
			Connection c = Connector.getConnection();
			PreparedStatement st;
			String sql = "DELETE FROM `ControleRIA` WHERE 'ControleRIA'.'id'=?";
			try {
				st = c.prepareStatement(sql);
				st.setInt(1, Ct.getId());
				st.executeUpdate();
				return true;
			} catch (SQLException e) {
				return false;
			}
		} else
			return false;

	}

	public static ControleRIA getControleRIAByCode(String code) {
		ControleRIA r = null;
		ResultSet rs;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `ControleRIA` WHERE `id` = ? ;";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, code);
			rs = st.executeQuery();
			if (rs.next())
				r = new ControleRIA(0, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return r;
	}
}
