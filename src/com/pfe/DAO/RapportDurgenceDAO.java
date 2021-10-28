package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.RapportDurgence;
import com.pfe.Utils.Connector;

public class RapportDurgenceDAO {
	public static boolean ajouterRapportDurgence(RapportDurgence RU) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `RapportUrgence` (`type`, `date`, `local`, `ressponsable`, `Acteurs`, `description`, `ID_Action`) VALUES (?,?,?,?,?,?,?);";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, RU.getType());
			st.setString(2, RU.getDate());
			st.setString(3, RU.getLocal());
			st.setString(4, RU.getRessponsable());
			st.setString(5, RU.getActeurs());
			st.setString(6, RU.getDescription());
			st.setInt(7, RU.getID_Action());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static boolean modifierRapportDurgence(RapportDurgence RU) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `RapportUrgence` SET `type` =?, `date` =?, `local` = ?, `ressponsable` = ?, `Acteurs` = ?, `description` =? , `ID_Action` = ? WHERE `RapportUrgence`.`id` =?;";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, RU.getType());
			st.setString(2, RU.getDate());
			st.setString(3, RU.getLocal());
			st.setString(4, RU.getRessponsable());
			st.setString(5, RU.getActeurs());
			st.setString(6, RU.getDescription());
			st.setInt(7, RU.getID_Action());
			st.setInt(8, RU.getId());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static boolean supprimerRapportDurgence(RapportDurgence RU) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `RapportUrgence` WHERE `RapportUrgence`.`id` = 2;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, RU.getId());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}

	}

	public static ArrayList<RapportDurgence> getAll() {
		ArrayList<RapportDurgence> list = new ArrayList<RapportDurgence>();
		ResultSet rs = null;
		RapportDurgence ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `RapportUrgence`;";
		try {
			st = c.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				ex = new RapportDurgence(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));

				ex.setId(rs.getInt(1));
				list.add(ex);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public static RapportDurgence getRapportDeVisitByCode(int id) {
		ResultSet rs = null;
		RapportDurgence rv = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `RapportUrgence` WHERE `id` = ?;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {

				rv = new RapportDurgence(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));
				rv.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rv;
	}

}
