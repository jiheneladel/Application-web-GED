package com.pfe.Models;

public class AvisDeNonConformite {

	int id;
	int Numero;
	String Travailleur;
	String date;
	String Entreprise;
	String Service;
	String Discription;
	String MesureAprendre;
	String Ressponsable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getTravailleur() {
		return Travailleur;
	}

	public void setTravailleur(String travailleur) {
		Travailleur = travailleur;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEntreprise() {
		return Entreprise;
	}

	public void setEntreprise(String entreprise) {
		Entreprise = entreprise;
	}

	public String getService() {
		return Service;
	}

	public void setService(String service) {
		Service = service;
	}

	public String getDiscription() {
		return Discription;
	}

	public void setDiscription(String discription) {
		Discription = discription;
	}

	public String getMesureAprendre() {
		return MesureAprendre;
	}

	public void setMesureAprendre(String mesureAprendre) {
		MesureAprendre = mesureAprendre;
	}

	public String getRessponsable() {
		return Ressponsable;
	}

	public void setRessponsable(String ressponsable) {
		Ressponsable = ressponsable;
	}

	@Override
	public String toString() {
		return "AvisDeNonConformite [id=" + id + ", Numero=" + Numero + ", Travailleur=" + Travailleur + ", date="
				+ date + ", Entreprise=" + Entreprise + ", Service=" + Service + ", Discription=" + Discription
				+ ", MesureAprendre=" + MesureAprendre + ", Ressponsable=" + Ressponsable + "]";
	}

	public AvisDeNonConformite(int numero, String travailleur, String date, String entreprise, String service,
			String discription, String mesureAprendre, String ressponsable) {
		super();
		Numero = numero;
		Travailleur = travailleur;
		this.date = date;
		Entreprise = entreprise;
		Service = service;
		Discription = discription;
		MesureAprendre = mesureAprendre;
		Ressponsable = ressponsable;
	}

}
