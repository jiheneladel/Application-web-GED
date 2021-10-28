package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.RapportDurgenceDAO;
import com.pfe.Models.RapportDurgence;

/**
 * Servlet implementation class UpdateRapportUrgence
 */
@WebServlet("/UpdateRapportUrgence")
public class UpdateRapportUrgence extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateRapportUrgence() {
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
		String id = request.getParameter("id");
		String type = request.getParameter("type");
		String date = request.getParameter("date");
		String local = request.getParameter("local");
		String responsable = request.getParameter("responsable");
		String Acteur = request.getParameter("Acteur");
		String Description = request.getParameter("Description");
		String id_action = request.getParameter("id_action");
		int idaction = Integer.parseInt(id_action);
		int Id = Integer.parseInt(id);
		RapportDurgence rd = new RapportDurgence(type, date, local, responsable, Acteur, Description, idaction);
		rd.setId(Id);
		RapportDurgenceDAO.modifierRapportDurgence(rd);
		response.sendRedirect("Admin/afficherRapportUrgence.jsp");
	}

}
