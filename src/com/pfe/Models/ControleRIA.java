package com.pfe.Models;

public class ControleRIA {

	int id;
	String date;
	String observation;
	String responsable;
	String codeRIA;

	public ControleRIA(int id, String string, String observation, String responsable, String codeRIA) {
		super();
		this.id = id;
		this.date = string;
		this.observation = observation;
		this.responsable = responsable;
		this.codeRIA = codeRIA;
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

	public String getCodeRIA() {
		return codeRIA;
	}

	public void setCodeRIA(String codeRIA) {
		this.codeRIA = codeRIA;
	}

	@Override
	public String toString() {
		return "ControleRIA [id=" + id + ", date=" + date + ", observation=" + observation + ", responsable="
				+ responsable + ", codeRIA=" + codeRIA + "]";
	}

}
