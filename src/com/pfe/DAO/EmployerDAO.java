package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pfe.Models.Employer;
import com.pfe.Utils.Connector;

public class EmployerDAO {
	public static boolean ajouterEmployer(Employer E) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `employer`(`nom`, `prenom`, `cin`, `cnss`, `affectation`) VALUES (?,?,?,?,?);";
		try {
			st = c.prepareStatement(sql);
			st.setString(1, E.getNom());
			st.setString(2, E.getPrenom());
			st.setString(3, E.getCin());
			st.setString(4, E.getCnss());
			st.setString(5, E.getAffectation());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static Employer getUserByCIN(String cin) {
		Employer emp = null;
		PreparedStatement pstmnt;
		ResultSet rs;
		Connection cnx = Connector.getConnection();
		String sql = "SELECT * FROM `employer` WHERE `cin` = ?;";
		try {
			pstmnt = cnx.prepareStatement(sql);
			pstmnt.setString(1, cin);
			rs = pstmnt.executeQuery();
			if (rs.next())
				emp = new Employer(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			emp.setId(rs.getInt(1));
		} catch (SQLException er) {
			er.printStackTrace();
		}
		return emp;
	}

	public static Employer getEmployerByID(int id) {
		Employer emp = null;
		PreparedStatement pstmnt;
		ResultSet rs;
		Connection cnx = Connector.getConnection();
		String sql = "SELECT * FROM `employer` WHERE `id` = ?;";
		try {
			pstmnt = cnx.prepareStatement(sql);
			pstmnt.setInt(1, id);
			rs = pstmnt.executeQuery();
			if (rs.next())
				emp = new Employer(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			emp.setId(rs.getInt(1));
		} catch (SQLException er) {
			er.printStackTrace();
		}
		return emp;
	}
}
