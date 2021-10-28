package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.Extincteur;
import com.pfe.Utils.Connector;

public class ExtincteurDAO {
	public static boolean ajouterExtincteur(Extincteur Ex) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `Extincteur` (`codeEXT`, `type`, `localisation`, `poid`) VALUES (?,?,?,?);";

		try {
			st = c.prepareStatement(sql);
			st.setString(1, Ex.getCodeEXT());
			st.setString(2, Ex.getType());
			st.setString(3, Ex.getLocalisation());
			st.setDouble(4, Ex.getPoid());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static boolean modifierExtincteur(Extincteur Ex) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `Extincteur` SET `type` = ?, `localisation` = ?, `poid` =? WHERE `codeEXT` = ?;";

		try {
			st = c.prepareStatement(sql);

			st.setString(1, Ex.getType());
			st.setString(2, Ex.getLocalisation());
			st.setDouble(3, Ex.getPoid());
			st.setString(4, Ex.getCodeEXT());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static boolean supprimerExtincteur(Extincteur Ex) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `Extincteur` WHERE `Extincteur`.`codeEXT` = ?;";

		try {
			st = c.prepareStatement(sql);

			st.setString(1, Ex.getCodeEXT());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static Extincteur getExtincteurByCode(String codeEXT) {
		ResultSet rs = null;
		Extincteur ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `Extincteur` WHERE `codeEXT` = ?;";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, codeEXT);
			rs = st.executeQuery();
			if (rs.next()) {
				ex = new Extincteur(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ex;
	}

	public static Extincteur[] getAll() {
		ArrayList<Extincteur> list = new ArrayList<Extincteur>();
		ResultSet rs = null;
		Extincteur ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `Extincteur`;";
		try {
			st = c.prepareStatement(sql);
			rs = st.executeQuery();

			while (rs.next()) {
				ex = new Extincteur(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
				list.add(ex);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Extincteur[] ext = new Extincteur[list.size()];

		for (int i = 0; i < ext.length; i++) {
			ext[i] = list.get(i);
		}
		return ext;
	}

}
