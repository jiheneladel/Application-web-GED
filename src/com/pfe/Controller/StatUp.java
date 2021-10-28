package com.pfe.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.EmployerDAO;
import com.pfe.DAO.UserDAO;
import com.pfe.Models.Employer;
import com.pfe.Models.User;

/**
 * Servlet implementation class StatUp
 */
@WebServlet("/StatUp")
public class StatUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployerDAO.ajouterEmployer(new Employer("Jihen", "ElAdel", "00000001", "0000001", "Manager Securité"));
		Employer emp=EmployerDAO.getUserByCIN("00000001");
		UserDAO.addUser(new User("jihen", "jihen", emp.getId(), "Manager"));
		response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
