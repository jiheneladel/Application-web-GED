package com.pfe.Models;

public class RegistreDeVerificationDesEngins {
	int id;
	int id_Engin;
	int numero;
	String matricule;
	String marque;
	String Model;
	String nomChauffeur;
	String lieuIntervention;
	String dateEntree;
	String dateSortie;
	String entreprisePropritaire;
	String verification;

	public RegistreDeVerificationDesEngins(int id_Engin, int numero, String matricule, String marque, String model,
			String nomChauffeur, String lieuIntervention, String dateEntree, String dateSortie,
			String entreprisePropritaire, String verification) {
		super();
		this.id_Engin = id_Engin;
		this.numero = numero;
		this.matricule = matricule;
		this.marque = marque;
		Model = model;
		this.nomChauffeur = nomChauffeur;
		this.lieuIntervention = lieuIntervention;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.entreprisePropritaire = entreprisePropritaire;
		this.verification = verification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_Engin() {
		return id_Engin;
	}

	public void setId_Engin(int id_Engin) {
		this.id_Engin = id_Engin;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getNomChauffeur() {
		return nomChauffeur;
	}

	public void setNomChauffeur(String nomChauffeur) {
		this.nomChauffeur = nomChauffeur;
	}

	public String getLieuIntervention() {
		return lieuIntervention;
	}

	public void setLieuIntervention(String lieuIntervention) {
		this.lieuIntervention = lieuIntervention;
	}

	public String getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getEntreprisePropritaire() {
		return entreprisePropritaire;
	}

	public void setEntreprisePropritaire(String entreprisePropritaire) {
		this.entreprisePropritaire = entreprisePropritaire;
	}

	public String getVerification() {
		return verification;
	}

	public void setVerification(String verification) {
		this.verification = verification;
	}

	@Override
	public String toString() {
		return "RegistreDeVerificationDesEngins [id=" + id + ", id_Engin=" + id_Engin + ", numero=" + numero
				+ ", matricule=" + matricule + ", marque=" + marque + ", Model=" + Model + ", nomChauffeur="
				+ nomChauffeur + ", lieuIntervention=" + lieuIntervention + ", dateEntree=" + dateEntree
				+ ", dateSortie=" + dateSortie + ", entreprisePropritaire=" + entreprisePropritaire + ", verification="
				+ verification + "]";
	}

}
