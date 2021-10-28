package com.pfe.Models;

public class RapportDeVisit {
	private int id;
	private String zone;
	private String Activite;
	private String tache;
	private String date;
	private String Description;
	private int ID_Action;

	public RapportDeVisit(String zone, String activite, String tache, String date, String description, int iD_Action) {
		super();
		this.zone = zone;
		Activite = activite;
		this.tache = tache;
		this.date = date;
		Description = description;
		ID_Action = iD_Action;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getActivite() {
		return Activite;
	}

	public void setActivite(String activite) {
		Activite = activite;
	}

	public String getTache() {
		return tache;
	}

	public void setTache(String tache) {
		this.tache = tache;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getID_Action() {
		return ID_Action;
	}

	public void setID_Action(int iD_Action) {
		ID_Action = iD_Action;
	}

	@Override
	public String toString() {
		return "RapportDeVisit [id=" + id + ", zone=" + zone + ", Activite=" + Activite + ", tache=" + tache + ", date="
				+ date + ", Description=" + Description + ", ID_Action=" + ID_Action + "]";
	}

}
