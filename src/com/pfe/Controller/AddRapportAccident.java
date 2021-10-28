package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.EmployerDAO;
import com.pfe.DAO.RapportAccidentDAO;
import com.pfe.Models.Employer;
import com.pfe.Models.RapportAccident;

/**
 * Servlet implementation class AddRapportAccident
 */
@WebServlet("/AddRapportAccident")
public class AddRapportAccident extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddRapportAccident() {
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
		String date = request.getParameter("date");
		String description = request.getParameter("description");
		String causeAccident = request.getParameter("causeAccident");
		String ID_Action = request.getParameter("id_action");
		int idaction = Integer.parseInt(ID_Action);
		String cinE = request.getParameter("idEmployer");
		Employer emp = EmployerDAO.getUserByCIN(cinE);
		if (emp != null) {
			RapportAccident rda = new RapportAccident(date, description, causeAccident, idaction, emp.getId());
			if (RapportAccidentDAO.ajouterRapportAccident(rda)) {
				request.getSession().setAttribute("reponse", "success");
			} else {
				request.getSession().setAttribute("reponse", "error");
			}
			response.sendRedirect("Admin/afficherRapportAccident.jsp");
			// doGet(request, response);
		} else {
			response.sendRedirect("Admin/index.jsp");
		}
	}

}
