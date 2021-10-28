package com.pfe.Models;

public class ControleExtincteur {

	int id;
	String date;
	String observation;
	String responsable;
	String codeEXT;

	@Override
	public String toString() {
		return "ControleExtincteur [id=" + id + ", date=" + date + ", observation=" + observation + ", responsable="
				+ responsable + ", codeEXT=" + codeEXT + "]";
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

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getCodeEXT() {
		return codeEXT;
	}

	public void setCodeEXT(String codeEXT) {
		this.codeEXT = codeEXT;
	}

	public ControleExtincteur(int id, String date, String observation, String responsable, String codeEXT) {
		super();
		this.id = id;
		this.date = date;
		this.observation = observation;
		this.responsable = responsable;
		this.codeEXT = codeEXT;
	}
}
