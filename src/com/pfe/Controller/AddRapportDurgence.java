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
 * Servlet implementation class AddRapportDurgence
 */
@WebServlet("/AddRapportDurgence")
public class AddRapportDurgence extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddRapportDurgence() {
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
		// response.sendRedirect("AddRapportDurgence.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type = request.getParameter("type");
		String date = request.getParameter("date");
		String local = request.getParameter("local");
		String ressponsable = request.getParameter("ressponsable");
		String acteurs = request.getParameter("Acteurs");
		String description = request.getParameter("description");
		String id_action = request.getParameter("id_action");
		int idaction = Integer.parseInt(id_action);
		RapportDurgence rdu = new RapportDurgence(type, date, local, ressponsable, acteurs, description, idaction);
		if (RapportDurgenceDAO.ajouterRapportDurgence(rdu)) {
			request.getSession().setAttribute("reponse", "success");
		} else {
			request.getSession().setAttribute("reponse", "error");
		}
		response.sendRedirect("Admin/afficherRapportUrgence.jsp");

		// boolean r = RapportDurgenceDAO.ajouterRapportDurgence(rdu);
		// System.out.println(rdu.toString());

		// if (r) { //
		// response.getWriter().append("Ajout effectuer avec success ");

		// request.setAttribute("reponse", "success");
		// } else { //
		// response.getWriter().append("Ajout non effectuer: ").append(rdu.toString());
		// request.setAttribute("reponse", "error");
	}
	// request.getRequestDispatcher("./Admin/AddRapportDurgence.jsp").forward(request,
	// response);

	// doGet(request, response);

}
