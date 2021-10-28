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
 * Servlet implementation class updateRapportAccident
 */
@WebServlet("/updateRapportAccident")
public class updateRapportAccident extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public updateRapportAccident() {
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
		String id = request.getParameter("id");
		String id_action = request.getParameter("id_action");
		int idaction = Integer.parseInt(id_action);
		int Id = Integer.parseInt(id);
		String cin = request.getParameter("cin");
		String CauseAccident = request.getParameter("causeAccident");
		String date = request.getParameter("date");
		String Description = request.getParameter("Description");
		Employer emp = EmployerDAO.getUserByCIN(cin);
		if (emp != null) {
			RapportAccident RA = new RapportAccident(date, Description, CauseAccident, idaction, emp.getId());
			RA.setId(Id);
			RapportAccidentDAO.modifierRapportAccident(RA);
			response.sendRedirect("Admin/afficherRapportAccident.jsp");
		} else {
			response.sendRedirect("Admin/ondex.jsp");
		}
	}
}