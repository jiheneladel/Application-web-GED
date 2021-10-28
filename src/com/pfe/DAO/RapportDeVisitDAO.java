package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.RapportDeVisit;
import com.pfe.Utils.Connector;

public class RapportDeVisitDAO {
	public static boolean ajouterRapportDeVisite(RapportDeVisit RV) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `RapportDeVisite` (`Zone`, `Activite`, `tache`, `date`, `Description`, `ID_Action`) VALUES (?,?,?,?,?,?);";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, RV.getZone());
			st.setString(2, RV.getActivite());
			st.setString(3, RV.getTache());
			st.setString(4, RV.getDate());
			st.setString(5, RV.getDescription());
			st.setInt(6, RV.getID_Action());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static boolean modifierRapportDeVisite(RapportDeVisit RV) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `RapportDeVisite` SET `Zone` = ?, `Activite` = ?, `tache` = ?, `date` =?, `Description` =?, `ID_Action`=? WHERE `RapportDeVisite`.`id` = ?; ";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, RV.getZone());
			st.setString(2, RV.getActivite());
			st.setString(3, RV.getTache());
			st.setString(4, RV.getDate());
			st.setString(5, RV.getDescription());
			st.setInt(6, RV.getID_Action());
			st.setInt(7, RV.getId());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static boolean supprimerRapportDeVisite(RapportDeVisit RV) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `RapportDeVisite` WHERE `RapportDeVisite`.`id` = ?; ";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, RV.getId());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static ArrayList<RapportDeVisit> getAll() {
		ArrayList<RapportDeVisit> list = new ArrayList<RapportDeVisit>();
		ResultSet rs = null;
		RapportDeVisit ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `RapportDeVisite`;";
		try {
			st = c.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				ex = new RapportDeVisit(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
				ex.setId(rs.getInt(1));
				list.add(ex);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * RapportDeVisit[] ext = new RapportDeVisit[list.size()];
		 * 
		 * for (int i = 0; i < ext.length; i++) { ext[i] = list.get(i); }
		 */
		return list;
	}

	public static RapportDeVisit getRapportDeVisitByCode(int id) {
		ResultSet rs = null;
		RapportDeVisit rv = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `RapportDeVisite` WHERE `id` = ?;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				rv = new RapportDeVisit(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
				rv.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rv;
	}

}
