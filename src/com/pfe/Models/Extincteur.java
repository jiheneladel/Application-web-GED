package com.pfe.Models;

public class Extincteur {
	public String codeEXT;
	public String type;
	public String localisation;
	public double poid;

	public Extincteur(String codeEXT, String type, String localisation, double poid) {
		super();
		this.codeEXT = codeEXT;
		this.type = type;
		this.localisation = localisation;
		this.poid = poid;
	}

	public String getCodeEXT() {
		return codeEXT;
	}

	public void setCodeEXT(String codeEXT) {
		this.codeEXT = codeEXT;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public double getPoid() {
		return poid;
	}

	public void setPoid(double poid) {
		this.poid = poid;
	}

	@Override
	public String toString() {
		return "Extincteur [codeEXT=" + codeEXT + ", type=" + type + ", localisation=" + localisation + ", poid=" + poid
				+ "]";
	}

}
