package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.FicheDeDistributionEPIDAO;
import com.pfe.Models.FicheDeDistributionEPI;

/**
 * Servlet implementation class AddFicheDeDistributionEPI
 */
@WebServlet("/AddFicheDeDistributionEPI")
public class AddFicheDeDistributionEPI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddFicheDeDistributionEPI() {
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
		if (request.getParameter("nomUtilisateur") != null) {
			FicheDeDistributionEPI cex = new FicheDeDistributionEPI(0, request.getParameter("nomUtilisateur"),
					request.getParameter("fonction"), request.getParameter("dateAprendre"),
					request.getParameter("EPIaPrendre"), false);
			// response.getWriter().append(cex.toString());
			if (FicheDeDistributionEPIDAO.ajouterFicheDeDistributionEPI(cex)) {

				request.getSession().setAttribute("reponse", "success");
			} else {
				request.getSession().setAttribute("reponse", "error");
			}
			response.sendRedirect("Admin/afficherFicheDeDistributionEPI.jsp");

		}
	}

}
