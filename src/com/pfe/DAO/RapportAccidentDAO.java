package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.RapportAccident;
import com.pfe.Utils.Connector;

public class RapportAccidentDAO {
	public static boolean ajouterRapportAccident(RapportAccident RA) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `RapportAccident` (`date`, `description`, `causeAccident`, `ID_Action`, `idEmployer`) VALUES (?,?,?,?,?);";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, RA.getDate());
			st.setString(2, RA.getDescription());
			st.setString(3, RA.getCauseAccident());
			st.setInt(4, RA.getID_Action());
			st.setInt(5, RA.getIdEmployer());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}

	}

	public static boolean modifierRapportAccident(RapportAccident RA) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `RapportAccident` SET `date` =?, `description` = ?, `causeAccident`=?, `ID_Action`=?,`IdEmployer`=? WHERE `RapportAccident`.`id` =?;";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, RA.getDate());
			st.setString(2, RA.getDescription());
			st.setString(3, RA.getCauseAccident());
			st.setInt(4, RA.getID_Action());
			st.setInt(5, RA.getIdEmployer());
			st.setInt(6, RA.getId());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static boolean supprimerRapportAccident(RapportAccident RA) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `RapportAccident` WHERE `RapportAccident`.`id` =?;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(6, RA.getId());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static RapportAccident getRapportAccidentByCode(int id) {
		ResultSet rs = null;
		RapportAccident ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `RapportAccident` where `id`=?;";
		try {
			st = c.prepareStatement(sql);

			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				ex = new RapportAccident(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
				ex.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ex;
	}

	public static ArrayList<RapportAccident> getAll() {
		ArrayList<RapportAccident> list = new ArrayList<RapportAccident>();
		ResultSet rs = null;
		RapportAccident ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `RapportAccident`;";
		try {
			st = c.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				ex = new RapportAccident(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
				ex.setId(rs.getInt(1));
				list.add(ex);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}