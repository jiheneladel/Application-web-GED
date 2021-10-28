package com.pfe.Models;

public class FicheDeDistributionEPI {
	int id;
	String nomUtilisateur;
	String fonction;
	String dateAprendre;
	String EPIaPrendre;
	boolean acquitter;

	public boolean isAcquitter() {
		return acquitter;
	}

	public void setAcquitter(boolean acquitter) {
		this.acquitter = acquitter;
	}

	public FicheDeDistributionEPI(int id, String nomUtilisateur, String fonction, String dateAprendre,
			String ePIaPrendre, boolean acquitter) {
		super();
		this.id = id;
		this.nomUtilisateur = nomUtilisateur;
		this.fonction = fonction;
		this.dateAprendre = dateAprendre;
		this.EPIaPrendre = ePIaPrendre;
		this.acquitter = acquitter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getDateAprendre() {
		return dateAprendre;
	}

	public void setDateAprendre(String dateAprendre) {
		this.dateAprendre = dateAprendre;
	}

	public String getEPIaPrendre() {
		return EPIaPrendre;
	}

	public void setEPIaPrendre(String ePIaPrendre) {
		EPIaPrendre = ePIaPrendre;
	}

	@Override
	public String toString() {
		return "FicheDeDistributionEPI [id=" + id + ", nomUtilisateur=" + nomUtilisateur + ", fonction=" + fonction
				+ ", dateAprendre=" + dateAprendre + ", EPIaPrendre=" + EPIaPrendre + ", acquitter=" + acquitter + "]";
	}

}
