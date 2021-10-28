package com.pfe.Models;

public class RapportAccident {
	int id;

	String date;
	String description;
	String causeAccident;
	int ID_Action;
	int idEmployer;

	public RapportAccident(String date, String description, String causeAccident, int iD_Action, int idEmployer) {
		super();
		this.date = date;
		this.description = description;
		this.causeAccident = causeAccident;
		ID_Action = iD_Action;
		this.idEmployer = idEmployer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCauseAccident() {
		return causeAccident;
	}

	public void setCauseAccident(String causeAccident) {
		this.causeAccident = causeAccident;
	}

	public int getID_Action() {
		return ID_Action;
	}

	public void setID_Action(int iD_Action) {
		ID_Action = iD_Action;
	}

	public int getIdEmployer() {
		return idEmployer;
	}

	public void setIdEmployer(int idEmployer) {
		this.idEmployer = idEmployer;
	}

	@Override
	public String toString() {
		return "RapportAccident [id=" + id + ", date=" + date + ", description=" + description + ", causeAccident="
				+ causeAccident + ", ID_Action=" + ID_Action + ", idEmployer=" + idEmployer + "]";
	}

}
