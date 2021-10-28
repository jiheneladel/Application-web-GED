package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pfe.Models.RegistreDeVerificationDesEngins;
import com.pfe.Utils.Connector;

public class RegistreDeVerificationDesEnginsDAO {
	public static Boolean ajouterRegistreDeVerification(RegistreDeVerificationDesEngins RVE) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `RegistreDeVerificationDesEngins` (`id_Engin`, `numero`, `matricule`, `marque`, `Model`, `nomChauffeur`, `lieuIntervention`, `dateEntree`, `dateSortie`, `entreprisePropritaire`, `verification`) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
		try {
			st = c.prepareStatement(sql);
			st.setInt(1, RVE.getId_Engin());
			st.setInt(2, RVE.getNumero());
			st.setString(3, RVE.getMatricule());
			st.setString(4, RVE.getMarque());
			st.setString(5, RVE.getModel());
			st.setString(6, RVE.getNomChauffeur());
			st.setString(7, RVE.getLieuIntervention());
			st.setString(8, RVE.getDateEntree());
			st.setString(9, RVE.getDateSortie());
			st.setString(10, RVE.getEntreprisePropritaire());
			st.setString(11, RVE.getVerification());
			st.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

}
