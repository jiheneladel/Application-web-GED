package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.RapportDeVisitDAO;
import com.pfe.Models.RapportDeVisit;

/**
 * Servlet implementation class UpdateDateVisite
 */
@WebServlet("/UpdateRapportVisite")
public class UpdateRapportVisite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateRapportVisite() {
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
		String zone = request.getParameter("zone");
		String activite = request.getParameter("Activite");
		String tache = request.getParameter("tache");
		String date = request.getParameter("date");
		String description = request.getParameter("Description");
		String id_action = request.getParameter("id_action");
		int idaction = Integer.parseInt(id_action);
		String id = request.getParameter("id");
		int Id = Integer.parseInt(id);
		RapportDeVisit rdv = new RapportDeVisit(zone, activite, tache, date, description, idaction);
		rdv.setId(Id);
		if (RapportDeVisitDAO.modifierRapportDeVisite(rdv)) {
			request.getSession().setAttribute("reponse", "success");
		} else {
			request.getSession().setAttribute("reponse", "error");
		}
		response.sendRedirect("Admin/afficherRapportvisite.jsp");
	}

}
