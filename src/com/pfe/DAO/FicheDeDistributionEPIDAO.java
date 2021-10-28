package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.FicheDeDistributionEPI;
import com.pfe.Utils.Connector;

public class FicheDeDistributionEPIDAO {
	public static boolean ajouterFicheDeDistributionEPI(FicheDeDistributionEPI FD) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `FicheDeDistributionEPI` (`nomUtilisateur`, `fonction`, `dateAprendre`, `EPIaPrendre`, `acquitter`) VALUES (?,?,?,?,?);";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, FD.getNomUtilisateur());
			st.setString(2, FD.getFonction());
			st.setString(3, FD.getDateAprendre());
			st.setString(4, FD.getEPIaPrendre());
			st.setBoolean(5, FD.isAcquitter());
			return st.execute();
		} catch (SQLException e) {
			return false;
		}
	}

	public static boolean modifierFicheDeDistributionEPI(FicheDeDistributionEPI FD) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `FicheDeDistributionEPI` SET `nomUtilisateur` =?, `fonction` = ?, `EPIaPrendre` =?, `acquitter` =? WHERE `FicheDeDistributionEPI`.`id` = ?;";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, FD.getNomUtilisateur());
			st.setString(2, FD.getFonction());
			st.setString(3, FD.getDateAprendre());
			st.setString(4, FD.getEPIaPrendre());
			st.setBoolean(5, FD.isAcquitter());
			st.setInt(6, FD.getId());
			return st.execute();
		} catch (SQLException e) {
			return false;
		}
	}

	public static boolean supprimerFicheDeDistributionEPI(FicheDeDistributionEPI FD) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `FicheDeDistributionEPI` WHERE `FicheDeDistributionEPI`.`id` =?;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, FD.getId());
			return st.execute();
		} catch (SQLException e) {
			return false;
		}
	}

	public static FicheDeDistributionEPI getFicheDeDistributionEPIByCode(String code) {
		FicheDeDistributionEPI F = null;
		ResultSet fh;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `FicheDeDistributionEPI` WHERE `id` = ? ;";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, code);
			fh = st.executeQuery();
			if (fh.next())
				F = new FicheDeDistributionEPI(fh.getInt(1), fh.getString(2), fh.getString(3), fh.getString(4),
						fh.getString(5), fh.getBoolean(6));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return F;
	}

	public static boolean acquitterFicheDeDistributionEPI(FicheDeDistributionEPI FD) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `FicheDeDistributionEPI` SET `acquitter` =1 WHERE `FicheDeDistributionEPI`.`id` = ?;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, FD.getId());

			return st.execute();
		} catch (SQLException e) {
			return false;
		}
	}

	public static boolean acquitterFicheDeDistributionEPI(int id) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `FicheDeDistributionEPI` SET `acquitter` =1 WHERE `FicheDeDistributionEPI`.`id` = ?;";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, id);
			return st.executeUpdate() > 0;
		} catch (SQLException e) {
			return false;
		}
	}

	public static ArrayList<FicheDeDistributionEPI> getAll() {
		ArrayList<FicheDeDistributionEPI> list = new ArrayList<FicheDeDistributionEPI>();
		ResultSet FH = null;
		FicheDeDistributionEPI fh = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `FicheDeDistributionEPI`;";
		try {
			st = c.prepareStatement(sql);
			FH = st.executeQuery();
			while (FH.next()) {
				fh = new FicheDeDistributionEPI(FH.getInt(1), FH.getString(2), FH.getString(3), FH.getString(4),
						FH.getString(5), FH.getBoolean(6));
				list.add(fh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
