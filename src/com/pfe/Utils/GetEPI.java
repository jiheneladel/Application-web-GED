package com.pfe.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.pfe.DAO.FicheDeDistributionEPIDAO;
import com.pfe.Models.FicheDeDistributionEPI;

public class GetEPI {
	public static ArrayList<FicheDeDistributionEPI> getByFilter(String dateDebut, String dateFin, int etat) {
		ArrayList<FicheDeDistributionEPI> listef = new ArrayList<FicheDeDistributionEPI>();
		ArrayList<FicheDeDistributionEPI> listeAll = FicheDeDistributionEPIDAO.getAll();

		for (FicheDeDistributionEPI f : listeAll) {

			if ((dateDebut != null) && (dateFin != null) && (dateDebut != "") && (dateFin != "")) {
				try {
					Date debut = new SimpleDateFormat("yyyy-MM-dd").parse(dateDebut);
					Date fin = new SimpleDateFormat("yyyy-MM-dd").parse(dateFin);
					Date dateapp = new SimpleDateFormat("yyyy-MM-dd").parse(f.getDateAprendre());
					System.out.println(debut.toString());
					System.out.println(fin.toString());
					System.out.println(dateapp.toString());
					if (etat == -1) {
						if ((dateapp.after(debut)) && (dateapp.before(fin))) {
							listef.add(f);
						}
					} else if (etat == 1) {
						if ((dateapp.after(debut)) && (dateapp.before(fin)) && f.isAcquitter()) {
							listef.add(f);
						}
					} else if (etat == 0) {
						if ((dateapp.after(debut)) && (dateapp.before(fin)) && !f.isAcquitter()) {
							listef.add(f);
						}
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					e.printStackTrace();
				}
			} else {
				if (etat == -1) {
					listef.add(f);
				} else if (etat == 1) {
					if (f.isAcquitter()) {
						listef.add(f);
					}
				} else if (etat == 0) {
					if (!f.isAcquitter()) {
						listef.add(f);
					}
				}
			}
		}
		return listef;
	}

}
