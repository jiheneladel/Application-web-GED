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
 * Servlet implementation class UpdateEXT
 */
@WebServlet("/UpdateEXT")
public class UpdateEXT extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateEXT() {
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
		String codeEXT = request.getParameter("codeEXT");
		String type = request.getParameter("type");
		String localisation = request.getParameter("localisation");
		double poid = Double.parseDouble(request.getParameter("poid"));
		Extincteur ex = new Extincteur(codeEXT, type, localisation, poid);
		System.out.print(ex.toString());
		ExtincteurDAO.modifierExtincteur(ex);
		response.sendRedirect("Admin/afficherExtincteur.jsp");
	}
}