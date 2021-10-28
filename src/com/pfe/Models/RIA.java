package com.pfe.Models;

public class RIA {
	String codeRIA;
	String type;
	String localisation;
	double longuer;

	public RIA(String codeRIA, String type, String localisation, double longuer) {
		super();
		this.codeRIA = codeRIA;
		this.type = type;
		this.localisation = localisation;
		this.longuer = longuer;
	}

	public String getCodeRIA() {
		return codeRIA;
	}

	public void setCodeRIA(String codeRIA) {
		this.codeRIA = codeRIA;
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

	public double getLonguer() {
		return longuer;
	}

	public void setLonguer(double longuer) {
		this.longuer = longuer;
	}

	@Override
	public String toString() {
		return "RIA [codeRIA=" + codeRIA + ", type=" + type + ", localisation=" + localisation + ", longuer=" + longuer
				+ "]";
	}

}
