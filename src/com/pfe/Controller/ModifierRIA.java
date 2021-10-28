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
 * Servlet implementation class ModifierRIA
 */
@WebServlet("/ModifierRIA")
public class ModifierRIA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierRIA() {
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
		String codeRIA = null;
		if (request.getParameter("code") != null) {
			codeRIA = request.getParameter("code");
			RIA ri = RIADAO.getRIAByCode(codeRIA);
			request.getSession().setAttribute("RIA", ri);
			response.sendRedirect("Admin/modifierRIA.jsp");
		} else if (request.getParameter("codeRIA") != null) {
			String CodeRIA = request.getParameter("codeRIA");
			String type = request.getParameter("type");
			String localistation = request.getParameter("localisation");
			String slongueur = request.getParameter("longueur");
			double longueur = Double.parseDouble(slongueur);
			RIA ri = new RIA(CodeRIA, type, localistation, longueur);
			RIADAO.modifierRIA(ri);
			if (RIADAO.modifierRIA(ri)) {
				request.getSession().setAttribute("reponse", "success");
			} else {
				request.getSession().setAttribute("reponse", "error");
			}
			response.sendRedirect("Admin/afficherRIA.jsp");
		}
	}

}
