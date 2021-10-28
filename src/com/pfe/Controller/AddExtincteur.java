package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.ExtincteurDAO;
import com.pfe.Models.Extincteur;

/**
 * Servlet implementation class AddExtincteur
 */
@WebServlet("/AddExtincteur")
public class AddExtincteur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddExtincteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("Admin/AddExtincteur.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String codeEXT = request.getParameter("codeEXT");
		String type = request.getParameter("type");
		String localisation = request.getParameter("localisation");
		String poid = request.getParameter("poid");
		double dpoid = Double.parseDouble(poid);
		Extincteur ex = new Extincteur(codeEXT, type, localisation, dpoid);
		if (ExtincteurDAO.ajouterExtincteur(ex)) {
			request.getSession().setAttribute("reponse", "success");
		} else {
			request.getSession().setAttribute("reponse", "error");
		}
		response.sendRedirect("Admin/afficherExtincteur.jsp");

	}

}
