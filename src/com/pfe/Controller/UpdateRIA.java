package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.RIADAO;
import com.pfe.Models.RIA;

/**
 * Servlet implementation class UpdateRIA
 */
@WebServlet("/UpdateRIA")
public class UpdateRIA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateRIA() {
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
		String CodeRIA = request.getParameter("codeRIA");
		String type = request.getParameter("type");
		String localistation = request.getParameter("localisation");
		String slongueur = request.getParameter("longueur");
		double longueur = Double.parseDouble(slongueur);
		RIA ri = new RIA(CodeRIA, type, localistation, longueur);
		System.out.print(ri.toString());
		RIADAO.modifierRIA(ri);
		response.sendRedirect("Admin/afficherRIA.jsp");
	}
}
