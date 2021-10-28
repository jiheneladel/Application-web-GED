package com.pfe.Models;

public class RapportDurgence {
	int id;

	private String type;
	private String date;
	private String local;
	private String ressponsable;
	private String acteurs;
	private String description;
	private int ID_Action;

	public RapportDurgence(String type, String date, String local, String ressponsable, String acteurs,
			String description, int iD_Action) {
		super();
		this.type = type;
		this.date = date;
		this.local = local;
		this.ressponsable = ressponsable;
		this.acteurs = acteurs;
		this.description = description;
		ID_Action = iD_Action;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getRessponsable() {
		return ressponsable;
	}

	public void setRessponsable(String ressponsable) {
		this.ressponsable = ressponsable;
	}

	public String getActeurs() {
		return acteurs;
	}

	public void setActeurs(String acteurs) {
		this.acteurs = acteurs;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getID_Action() {
		return ID_Action;
	}

	public void setID_Action(int iD_Action) {
		ID_Action = iD_Action;
	}

	@Override
	public String toString() {
		return "RapportDurgence [id=" + id + ", type=" + type + ", date=" + date + ", local=" + local
				+ ", ressponsable=" + ressponsable + ", acteurs=" + acteurs + ", description=" + description
				+ ", ID_Action=" + ID_Action + "]";
	}

}
