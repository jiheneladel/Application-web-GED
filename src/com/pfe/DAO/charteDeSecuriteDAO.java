package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.charteDeSecurite;
import com.pfe.Utils.Connector;

public class charteDeSecuriteDAO {
	public static boolean ajoutercharteDeSecurite(charteDeSecurite ch) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `charteDeSecurité` (`description`, `Lieu_Intervention`, `dateEntrer`, `dateSortie`, `Responsable`) VALUES (?,?,?,?,?); ";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, ch.getDescription());
			st.setString(2, ch.getLieu_Intervention());
			st.setString(3, ch.getDateEnter());
			st.setString(4, ch.getDateSortie());
			st.setString(5, ch.getResponsable());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println();
			return false;

		}
	}

	public static boolean modifiecharteDeSecurite(charteDeSecurite ch) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `charteDeSecurité` SET `description` =?, `Lieu_Intervention` =?, `dateEntrer` =?, `dateSortie` = ?, `Responsable` =? WHERE `charteDeSecurité`.`id` =?;  ";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, ch.getDescription());
			st.setString(2, ch.getLieu_Intervention());
			st.setString(3, ch.getDateEnter());
			st.setString(4, ch.getDateSortie());
			st.setString(5, ch.getResponsable());
			st.setInt(6, ch.getId());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println();
			return false;

		}
	}

	public static boolean supprimercharteDeSecurite(charteDeSecurite ch) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `charteDeSecurité` WHERE `charteDeSecurité`.`id` = 1;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, ch.getId());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println();
			return false;

		}
	}

	public static ArrayList<charteDeSecurite> getAll() {
		ArrayList<charteDeSecurite> list = new ArrayList<charteDeSecurite>();
		ResultSet rs = null;
		charteDeSecurite ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `charteDeSecurité`;";
		try {
			st = c.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				ex = new charteDeSecurite(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
				ex.setId(rs.getInt(1));
				list.add(ex);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public static charteDeSecurite getcharteDeSecuriteByCode(int id) {
		ResultSet rs = null;
		charteDeSecurite rv = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `charteDeSecurité` WHERE `id` = ?;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {

				rv = new charteDeSecurite(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
				rv.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rv;
	}
}