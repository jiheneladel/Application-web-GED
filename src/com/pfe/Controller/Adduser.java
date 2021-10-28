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
 * Servlet implementation class Adduser
 */
@WebServlet("/Adduser")
public class Adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adduser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String cin=request.getParameter("cin");
		String cnss=request.getParameter("cnss");
		String affectation=request.getParameter("affectation");
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		String type=request.getParameter("type");
		EmployerDAO.ajouterEmployer(new Employer(nom, prenom, cin, cnss, affectation));
		Employer emp=EmployerDAO.getUserByCIN(cin);
		UserDAO.addUser(new User(login, password, emp.getId(), type));
		response.sendRedirect("login.jsp");
	}

}
