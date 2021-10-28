package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.ActionDAO;
import com.pfe.Models.Action;

/**
 * Servlet implementation class AddAction
 */
@WebServlet("/AddAction")
public class AddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddAction() {
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
		String nomAction = request.getParameter("nomAction");

		String source = request.getParameter("source");
		String Description = request.getParameter("Description");
		String Ressponsable = request.getParameter("Ressponsable");
		String Delai = request.getParameter("Delai");
		String DateRealisation = request.getParameter("DateRealisation");
		Action ac = new Action(nomAction, source, Description, Ressponsable, Delai, DateRealisation);

		System.out.print(ac.toString());
		if (ActionDAO.ajouterAction(ac)) {
			request.getSession().setAttribute("reponse", "success");
		} else {
			request.getSession().setAttribute("reponse", "error");
		}
		response.sendRedirect("Admin/afficherRapportAction.jsp");

	}

}
