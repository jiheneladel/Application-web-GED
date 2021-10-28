package com.pfe.Models;

public class charteDeSecurite {

	private int id;
	private String description;
	private String Lieu_Intervention;
	private String dateEnter;
	private String dateSortie;
	private String responsable;

	public charteDeSecurite(String description, String lieu_Intervention, String dateEnter, String dateSortie,
			String responsable) {
		super();
		this.description = description;
		Lieu_Intervention = lieu_Intervention;
		this.dateEnter = dateEnter;
		this.dateSortie = dateSortie;
		this.responsable = responsable;
	}

	public charteDeSecurite() {
		super();
	}

	@Override
	public String toString() {
		return "charteDeSecurite [id=" + id + ", description=" + description + ", Lieu_Intervention="
				+ Lieu_Intervention + ", dateEnter=" + dateEnter + ", dateSortie=" + dateSortie + ", responsable="
				+ responsable + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLieu_Intervention() {
		return Lieu_Intervention;
	}

	public void setLieu_Intervention(String lieu_Intervention) {
		Lieu_Intervention = lieu_Intervention;
	}

	public String getDateEnter() {
		return dateEnter;
	}

	public void setDateEnter(String dateEnter) {
		this.dateEnter = dateEnter;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

}
