package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.AvisDeNonConformiteDAO;
import com.pfe.Models.AvisDeNonConformite;

/**
 * Servlet implementation class AddAvisDeNonConformite
 */
@WebServlet("/AddAvisDeNonConformite")
public class AddAvisDeNonConformite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddAvisDeNonConformite() {
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
		String Numero = request.getParameter("Numero");
		int numero = Integer.parseInt("Numero");
		String Travailleur = request.getParameter("Travailleur");
		String date = request.getParameter("date");
		String Entreprise = request.getParameter("Entreprise");
		String Service = request.getParameter("Service");
		String Discription = request.getParameter("Discription");
		String MesureAprendre = request.getParameter("MesureAprendre");
		String Ressponsable = request.getParameter("Ressponsable");
		AvisDeNonConformite av = new AvisDeNonConformite(numero, Travailleur, date, Entreprise, Service, Discription,
				MesureAprendre, Ressponsable);

		if (AvisDeNonConformiteDAO.ajouterAvisDeNonConformite(av)) {
			request.getSession().setAttribute("reponse", "success");
		} else {
			request.getSession().setAttribute("reponse", "error");
		}
		response.sendRedirect("Admin/afficherAvisDeNonConformite.jsp");
	}

}
