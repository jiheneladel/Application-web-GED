package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.charteDeSecuriteDAO;
import com.pfe.Models.charteDeSecurite;

/**
 * Servlet implementation class AddcharteDeSecurite
 */
@WebServlet("/AddcharteDeSecurite")
public class AddcharteDeSecurite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddcharteDeSecurite() {
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

		String description = request.getParameter("description");
		String Lieu_Intervention = request.getParameter("Lieu_Intervention");
		String dateEnter = request.getParameter("dateEnter");
		String dateSortie = request.getParameter("dateSortie");
		String responsable = request.getParameter("responsable");
		charteDeSecurite ch = new charteDeSecurite(description, Lieu_Intervention, dateEnter, dateSortie, responsable);
		if (charteDeSecuriteDAO.ajoutercharteDeSecurite(ch)) {
			request.getSession().setAttribute("reponse", "success");
		} else {
			request.getSession().setAttribute("reponse", "error");
		}
		response.sendRedirect("Admin/affichercharteDeSecurite.jsp");

	}

}
