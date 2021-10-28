package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pfe.Models.ControleExtincteur;
import com.pfe.Models.Extincteur;
import com.pfe.Utils.Connector;

public class ControleExtincteurDAO {
	public static boolean ajouterControleExtincteur(ControleExtincteur CE) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `ControleExtincteur` (`id`, `date`, `observation`, `responsable`, `codeEXT`) VALUE (NULL,?,?,?,?);";

		try {
			st = c.prepareStatement(sql);
			st.setString(1, CE.getDate());
			st.setString(2, CE.getObservation());
			st.setString(3, CE.getResponsable());
			st.setString(4, CE.getCodeEXT());
			st.executeUpdate();
			return true;
		} catch (

		SQLException e) {
			return false;
		}
	}

	public static boolean modifierControleExtincteur(ControleExtincteur CE) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `ControleExtincteur` SET `id`=?,`date`=?,`observation`=?,`responsable`=?,`codeEXT`=? WHERE 'ControleExtincteur'.'id'=?";

		try {
			st = c.prepareStatement(sql);
			st.setString(1, CE.getDate());
			st.setString(2, CE.getObservation());
			st.setString(3, CE.getResponsable());
			st.setString(4, CE.getCodeEXT());
			st.setInt(5, CE.getId());
			st.executeUpdate();
			return true;
		} catch (

		SQLException e) {
			return false;
		}
	}

	public static boolean supprimerControleExtincteur(ControleExtincteur CE) {

		Extincteur E = ExtincteurDAO.getExtincteurByCode(CE.getCodeEXT());
		if (E != null) {
			Connection c = Connector.getConnection();
			PreparedStatement st;
			String sql = "DELETE FROM `ControleExtincteur` WHERE 'ControleExtincteur'.'id'=?";
			try {
				st = c.prepareStatement(sql);
				st.setInt(1, CE.getId());
				st.executeUpdate();
				return true;
			} catch (SQLException e) {
				return false;
			}
		} else
			return false;

	}
}
