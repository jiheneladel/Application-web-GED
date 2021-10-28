package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.SousTraitantsDAO;
import com.pfe.Models.SousTraitants;

/**
 * Servlet implementation class AddSousTraitants
 */
@WebServlet("/AddSousTraitants")
public class AddSousTraitants extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSousTraitants() {
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
		String nomETP = request.getParameter("nomETP");
		String nomRessponsable = request.getParameter("nomRessponsable");
		String contactRessEtp = request.getParameter("contactRessEtp");
		String ResponsableDeTraveaux = request.getParameter("ResponsableDeTraveaux");
		String contactResspTraveaux = request.getParameter("contactResspTraveaux");
		SousTraitants st = new SousTraitants(nomETP, nomRessponsable, contactRessEtp, ResponsableDeTraveaux,
				contactResspTraveaux);
		if (SousTraitantsDAO.ajouterSousTraitants(st)) {
			request.getSession().setAttribute("reponse", "success");
		} else {
			request.getSession().setAttribute("reponse", "error");
		}
		response.sendRedirect("Admin/afficherSousTraitants.jsp");

	}

}
