package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.ControleRIADAO;
import com.pfe.Models.ControleRIA;

/**
 * Servlet implementation class ControlerRIA
 */
@WebServlet("/ControlerRIA")
public class ControlerRIA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControlerRIA() {
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
		// doGet(request, response);
		String code = request.getParameter("codeRIA");
		String responsable = request.getParameter("responsable");
		String date = request.getParameter("date");
		String observation = request.getParameter("observation");
		ControleRIA ce = new ControleRIA(0, date, observation, responsable, code);
		ControleRIADAO.ajouterControleRIA(ce);

		response.sendRedirect("Admin/afficherRIA.jsp");
	}
}
