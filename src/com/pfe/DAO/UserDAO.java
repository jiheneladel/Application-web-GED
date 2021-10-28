package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pfe.Models.User;
import com.pfe.Utils.Connector;



public class UserDAO {
	public static void addUser(User u) {
		PreparedStatement pstmnt;
		Connection cnx = Connector.getConnection();
		String sql = "INSERT INTO `user` (`login`, `password`, `id_employer`,`type`) VALUES (?, ?, ?, ?);";
		try {
			pstmnt = cnx.prepareStatement(sql);
			pstmnt.setString(1, u.getLogin());
			pstmnt.setString(2, u.getPassword());
			pstmnt.setInt(3, u.getId_employer());
			pstmnt.setString(4, u.getType());
			pstmnt.executeUpdate();
		} catch (SQLException er) {
			er.printStackTrace();
		}
	}
	public static User getUserByLoginAndPassword(String login, String password) {
		User u = null;
		PreparedStatement pstmnt;
		ResultSet rs;
		Connection cnx = Connector.getConnection();
		String sql = "SELECT * FROM `user` WHERE `login` = ? AND `password` = ? ;";
		try {
			pstmnt = cnx.prepareStatement(sql);
			pstmnt.setString(1, login);
			pstmnt.setString(2, password);
			rs = pstmnt.executeQuery();
			if (rs.next())
				u = new User(rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
				u.setId(rs.getInt(1));
		} catch (SQLException er) {
			er.printStackTrace();
		}
		return u;
	}
	
}
