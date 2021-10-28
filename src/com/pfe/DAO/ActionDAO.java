package com.pfe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pfe.Models.Action;
import com.pfe.Utils.Connector;

public class ActionDAO {
	public static boolean ajouterAction(Action Ac) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "INSERT INTO `Action` (`nomAction`, `source`, `Description`, `Ressponsable`, `Delai`, `DateRealisation`) VALUES (?,?,?,?,?,?);";

		try {
			st = c.prepareStatement(sql);
			st.setString(1, Ac.getNomAction());
			st.setString(2, Ac.getSource());
			st.setString(3, Ac.getDescription());
			st.setString(4, Ac.getRessponsable());
			st.setString(5, Ac.getDelai());
			st.setString(6, Ac.getDateRealisation());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;

		}

	}

	public static boolean modifierAction(Action Ac) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "UPDATE `Action` SET `nomAction` = ?, `source` =?, `Description` =?, `Ressponsable` = ?, `Delai` = ?, `DateRealisation` = ? WHERE `Action`.`ID_Action` =?; ";

		try {
			st = c.prepareStatement(sql);
			st.setString(1, Ac.getNomAction());
			st.setString(2, Ac.getSource());
			st.setString(3, Ac.getDescription());
			st.setString(4, Ac.getRessponsable());
			st.setString(5, Ac.getDelai());
			st.setString(6, Ac.getDateRealisation());
			st.setInt(7, Ac.getID_Action());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;

		}

	}

	public static boolean supprimerAction(Action Ac) {
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "DELETE FROM `Action` WHERE `Action`.`ID_Action` = ?; ";

		try {
			st = c.prepareStatement(sql);
			st.setInt(1, Ac.getID_Action());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;

		}
	}

	public static ArrayList<Action> getAll() {
		ArrayList<Action> list = new ArrayList<Action>();
		ResultSet rs = null;
		Action ex = null;
		Connection c = Connector.getConnection();
		PreparedStatement st;
		String sql = "SELECT * FROM `RapportDeVisite`;";
		try {
			st = c.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				ex = new Action(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getString(7));

				ex.setID_Action(rs.getInt(1));
				list.add(ex);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
