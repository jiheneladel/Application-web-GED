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
 * Servlet implementation class AddRapportVisit
 */
@WebServlet("/AddRapportVisit")
public class AddRapportVisit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddRapportVisit() {
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

		String zone = request.getParameter("zone");
		String activite = request.getParameter("Activite");
		String tache = request.getParameter("tache");
		String date = request.getParameter("date");
		String description = request.getParameter("description");
		String id_action = request.getParameter("id_action");
		int idaction = Integer.parseInt(id_action);
		RapportDeVisit rdv = new RapportDeVisit(zone, activite, tache, date, description, idaction);

		if (RapportDeVisitDAO.ajouterRapportDeVisite(rdv)) {
			request.getSession().setAttribute("reponse", "success");
		} else {
			request.getSession().setAttribute("reponse", "error");
		}
		response.sendRedirect("Admin/afficherRapportvisite.jsp");
		/*
		 * if (state) { // response.getWriter().append("Ajout effectuer avec success ");
		 * 
		 * request.setAttribute("reponse", "success"); } else { //
		 * response.getWriter().append("Ajout non effectuer: ").append(rdv. toString());
		 * request.setAttribute("reponse", "error"); }
		 */
		// request.getRequestDispatcher("./Admin/AddRapportVisit.jsp").forward(request,
		// response);

	}

}
