package com.pfe.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfe.DAO.RegistreDeVerificationDesEnginsDAO;
import com.pfe.Models.RegistreDeVerificationDesEngins;
import com.pfe.Utils.JsonUtils;

/**
 * Servlet implementation class AddRapportVerification
 */
@WebServlet("/AddRapportVerification")
public class AddRapportVerification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddRapportVerification() {
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
		String id_engine = request.getParameter("Id_Engin");
		int idEngine = Integer.parseInt(id_engine);
		String numero = request.getParameter("numero");
		int Numero = Integer.parseInt(numero);
		String matricule = request.getParameter("matricule");
		String marque = request.getParameter("marque");
		String model = request.getParameter("model");
		String chauffeur = request.getParameter("chauffeur");
		String lieuIntervention = request.getParameter("lieuInter");
		String dateEntre = request.getParameter("dateEntre");
		String dateSortie = request.getParameter("dateSortie");
		String EntrProp = request.getParameter("EntrProp");

		String verification = JsonUtils.toJson(request);
		RegistreDeVerificationDesEnginsDAO
				.ajouterRegistreDeVerification(new RegistreDeVerificationDesEngins(idEngine, Numero, matricule, marque,
						model, chauffeur, lieuIntervention, dateEntre, dateSortie, EntrProp, verification));
		/// hné bech na3mlou el rdeirection
		response.getWriter().append("el ajout mrigel!");
	}

}
