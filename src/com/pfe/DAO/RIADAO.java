package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.RIA;
import com.pfe.Utils.Connector;

public class RIADAO {
	public static boolean ajouterRIA(RIA R) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `RIA` (`codeRIA`, `type`, `localisation`, `longueur`) VALUES (?, ?, ?, ?);";

		try {
			st = c.prepareStatement(sql);
			st.setString(1, R.getCodeRIA());
			st.setString(2, R.getType());
			st.setString(3, R.getLocalisation());
			st.setDouble(4, R.getLonguer());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}

	}

	public static boolean modifierRIA(RIA R) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `RIA` SET `codeRIA` = ?, `type` = ?, `localisation` = ?, `longueur` = ? WHERE `RIA`.`codeRIA` = ?;";

		try {
			st = c.prepareStatement(sql);
			st.setString(1, R.getCodeRIA());
			st.setString(2, R.getType());
			st.setString(3, R.getLocalisation());
			st.setDouble(4, R.getLonguer());
			st.setString(5, R.getCodeRIA());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}

	}

	public static boolean supprimerRIA(RIA R) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `RIA` WHERE `RIA`.`codeRIA` = ? ;";

		try {
			st = c.prepareStatement(sql);
			st.setString(1, R.getCodeRIA());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}

	}

	public static RIA getRIAByCode(String code) {
		RIA r = null;
		ResultSet rs;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `RIA` WHERE `codeRIA` LIKE ? ;";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, code);
			rs = st.executeQuery();
			if (rs.next())
				r = new RIA(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return r;
	}

	public static RIA[] getAll() {
		ArrayList<RIA> list = new ArrayList<RIA>();
		ResultSet rs = null;
		RIA ri = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `RIA`;";
		try {
			st = c.prepareStatement(sql);
			rs = st.executeQuery();

			while (rs.next()) {
				ri = new RIA(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
				list.add(ri);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RIA[] ria = new RIA[list.size()];

		for (int i = 0; i < ria.length; i++) {
			ria[i] = list.get(i);
		}
		return ria;
	}
}
