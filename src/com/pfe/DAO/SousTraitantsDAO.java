package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.SousTraitants;
import com.pfe.Utils.Connector;

public class SousTraitantsDAO {
	public static boolean ajouterSousTraitants(SousTraitants ST) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `Sous_Traitants` (`nomETP`, `nomRessponsable`, `contactRessEtp`, `ResponsableDeTraveaux`, `contactResspTraveaux`) VALUES (?,?,?,?,?);";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, ST.getNomETP());
			st.setString(2, ST.getNomRessponsable());
			st.setString(3, ST.getContactRessEtp());
			st.setString(4, ST.getResponsableDeTraveaux());
			st.setString(5, ST.getContactResspTraveaux());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static boolean modifierSousTraitants(SousTraitants ST) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `Sous_Traitants` SET `nomETP` = ?, `nomRessponsable` = ?, `contactRessEtp` = ?, `ResponsableDeTraveaux` = ?, `contactResspTraveaux` =? WHERE `Sous_Traitants`.`idST` =?; ";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, ST.getNomETP());
			st.setString(2, ST.getNomRessponsable());
			st.setString(3, ST.getContactRessEtp());
			st.setString(4, ST.getResponsableDeTraveaux());
			st.setString(5, ST.getContactResspTraveaux());
			st.setInt(6, ST.getIdST());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static boolean supprimerSousTraitants(SousTraitants ST) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `Sous_Traitants` WHERE `Sous_Traitants`.`idST` =?;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, ST.getIdST());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public static ArrayList<SousTraitants> getAll() {
		ArrayList<SousTraitants> list = new ArrayList<SousTraitants>();
		ResultSet rs = null;
		SousTraitants ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `Sous_Traitants`;";
		try {
			st = c.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				ex = new SousTraitants(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
				ex.setIdST(rs.getInt(1));
				list.add(ex);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public static SousTraitants getSousTraitantsByCode(int idST) {
		ResultSet rs = null;
		SousTraitants rv = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `Sous_Traitants` WHERE `idST` = ?;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, idST);
			rs = st.executeQuery();
			if (rs.next()) {
				rv = new SousTraitants(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));

				rv.setIdST(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rv;
	}

}
