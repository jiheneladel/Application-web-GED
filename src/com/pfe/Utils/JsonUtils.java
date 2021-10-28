package com.pfe.Utils;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

public class JsonUtils {

	public static String toJson(HttpServletRequest request) {

		String element = "{}";
		JSONObject elementJSON = new JSONObject(element);
		String[] vals = new String[2];
		/////////////
		vals[0] = request.getParameter("1E");
		vals[1] = request.getParameter("1O");
		elementJSON.put("Certificat de contrôle par organisme agréé par l’état tunisien", vals);
		////////////////
		vals = new String[2];
		vals[0] = request.getParameter("2E");
		vals[1] = request.getParameter("2O");
		elementJSON.put("Visite technique et registre d’entretien de l’engin", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("3E");
		vals[1] = request.getParameter("3O");
		elementJSON.put("Assurance", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("4E");
		vals[1] = request.getParameter("4O");
		elementJSON.put("Etat de la cabine et son accès", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("5E");
		vals[1] = request.getParameter("5O");
		elementJSON.put("Climatisation de la cabine", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("6E");
		vals[1] = request.getParameter("6O");
		elementJSON.put("Protection de la cabine Renforçage de la structure (FOPS)", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("7E");
		vals[1] = request.getParameter("7O");
		elementJSON.put("Protection de la cabine Protection avec des grillages (ROPS)", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("8E");
		vals[1] = request.getParameter("8O");
		elementJSON.put("Ceinture de sécurité pour chauffeur", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("9E");
		vals[1] = request.getParameter("9O");
		elementJSON.put("Pour les engins sans cabine présence des renforcements contre les renversements", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("10E");
		vals[1] = request.getParameter("10O");
		elementJSON.put("Avertisseur sonore audible pour marche arrière", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("11E");
		vals[1] = request.getParameter("11O");
		elementJSON.put("Gyrophares visible et en bon état de marche", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("12E");
		vals[1] = request.getParameter("12O");
		elementJSON.put("Les feux de route de l’engin en très bon état", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("13E");
		vals[1] = request.getParameter("13O");
		elementJSON.put("Etat des gente et des pneus", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("14E");
		vals[1] = request.getParameter("14O");
		elementJSON.put("Les boutons de tableau de bord sont visibles et lisible", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("15E");
		vals[1] = request.getParameter("15O");
		elementJSON.put("Présence des protections pour les pièces mobiles de l’engin", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("16E");
		vals[1] = request.getParameter("16O");
		elementJSON.put("Etat visuelle des éléments de levage (câble, chaîne, crochets de sécurité, etc.)", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("17E");
		vals[1] = request.getParameter("17O");
		elementJSON.put("Stabilisateurs en bon état de fonctionnement. (Information de chauffeur)", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("18E");
		vals[1] = request.getParameter("18O");
		elementJSON.put("Freins en bon état de fonctionnement. (Information de chauffeur)", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("19E");
		vals[1] = request.getParameter("19O");
		elementJSON.put("Présence des extincteurs", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("20E");
		vals[1] = request.getParameter("20O");
		elementJSON.put("Fuite des huiles", vals);
		///////////////
		vals = new String[2];
		vals[0] = request.getParameter("21E");
		vals[1] = request.getParameter("21O");
		elementJSON.put("Clackson en bon état de fonctionnement", vals);
		///////////////

		return elementJSON.toString();
	}
}
