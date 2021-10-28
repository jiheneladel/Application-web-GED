package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.AvisDeNonConformite;
import com.pfe.Utils.Connector;

public class AvisDeNonConformiteDAO {
	public static boolean ajouterAvisDeNonConformite(AvisDeNonConformite AV) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `Avis_De_Non_Conformité` (`Numero`, `Travailleur`, `date`, `Entreprise`, `Service`, `Discription`, `MesureAprendre`, `Ressponsable`) VALUES (?,?,?,?,?,?,?,?);";

		try {
			st = c.prepareStatement(sql);
			st.setString(1, AV.getTravailleur());
			st.setString(2, AV.getDate());
			st.setString(3, AV.getEntreprise());
			st.setString(4, AV.getService());
			st.setString(5, AV.getDiscription());
			st.setString(6, AV.getMesureAprendre());
			st.setString(7, AV.getRessponsable());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	public static boolean modifierAvisDeNonConformite(AvisDeNonConformite AV) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `Avis_De_Non_Conformité` SET `Numero` =?, `Travailleur` = ?, `date` = ?, `Entreprise` = ?, `Service` = ?, `Discription` =?, `MesureAprendre` =?, `Ressponsable` =? WHERE `Avis_De_Non_Conformité`.`id` =?;";

		try {
			st = c.prepareStatement(sql);
			st.setInt(1, AV.getNumero());
			st.setString(2, AV.getTravailleur());
			st.setString(3, AV.getDate());
			st.setString(4, AV.getEntreprise());
			st.setString(5, AV.getService());
			st.setString(6, AV.getDiscription());
			st.setString(7, AV.getMesureAprendre());
			st.setString(8, AV.getRessponsable());
			st.setInt(9, AV.getId());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static boolean supprimerAvisDeNonConformite(AvisDeNonConformite AV) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `Avis_De_Non_Conformité` WHERE `Avis_De_Non_Conformité`.`id` = ?;";

		try {
			st = c.prepareStatement(sql);
			st.setInt(1, AV.getId());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static AvisDeNonConformite getAvisDeNonConformiteByCode(String code) {
		AvisDeNonConformite A = null;
		ResultSet rs;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `AvisDeNonConformite` WHERE `Numero` = ? ;";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, code);
			rs = st.executeQuery();
			if (rs.next())
				A = new AvisDeNonConformite(0, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return A;
	}

	public static ArrayList<AvisDeNonConformite> getAll() {
		ArrayList<AvisDeNonConformite> list = new ArrayList<AvisDeNonConformite>();
		ResultSet rs = null;
		AvisDeNonConformite ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `AvisDeNonConformite`;";
		try {
			st = c.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				ex = new AvisDeNonConformite(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));

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

}
