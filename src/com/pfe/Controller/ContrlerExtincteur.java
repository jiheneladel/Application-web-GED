package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.ControleExtincteurDAO;
import com.pfe.Models.ControleExtincteur;

/**
 * Servlet implementation class ContrlerExtincteur
 */
@WebServlet("/ContrlerExtincteur")
public class ContrlerExtincteur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContrlerExtincteur() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = request.getParameter("codeEXT");
		String responsable = request.getParameter("responsable");
		String date = request.getParameter("date");
		String observation = request.getParameter("observation");
		ControleExtincteur ce = new ControleExtincteur(0, date, observation, responsable, code);
		ControleExtincteurDAO.ajouterControleExtincteur(ce);

		response.sendRedirect("Admin/afficherExtincteur.jsp");
	}

}
