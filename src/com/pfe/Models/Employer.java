package com.pfe.Models;

public class Employer {
	private int id;
	private String nom;
	private String prenom;
	private String cin;
	private String cnss;
	private String affectation;
	public Employer(String nom, String prenom, String cin, String cnss, String affectation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.cnss = cnss;
		this.affectation = affectation;
	}
	public Employer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getCnss() {
		return cnss;
	}
	public void setCnss(String cnss) {
		this.cnss = cnss;
	}
	public String getAffectation() {
		return affectation;
	}
	public void setAffectation(String affectation) {
		this.affectation = affectation;
	}
	@Override
	public String toString() {
		return "Employer [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", cnss=" + cnss
				+ ", affectation=" + affectation + "]";
	}
	
}
