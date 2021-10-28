package com.pfe.Models;

public class SousTraitants {
	private int idST;
	private String nomETP;
	private String nomRessponsable;
	private String contactRessEtp;
	private String ResponsableDeTraveaux;
	private String contactResspTraveaux;

	public SousTraitants() {
		super();
	}

	public SousTraitants(String nomETP, String nomRessponsable, String contactRessEtp, String responsableDeTraveaux,
			String contactResspTraveaux) {
		super();
		this.nomETP = nomETP;
		this.nomRessponsable = nomRessponsable;
		this.contactRessEtp = contactRessEtp;
		ResponsableDeTraveaux = responsableDeTraveaux;
		this.contactResspTraveaux = contactResspTraveaux;
	}

	@Override
	public String toString() {
		return "SousTraitants [idST=" + idST + ", nomETP=" + nomETP + ", nomRessponsable=" + nomRessponsable
				+ ", contactRessEtp=" + contactRessEtp + ", ResponsableDeTraveaux=" + ResponsableDeTraveaux
				+ ", contactResspTraveaux=" + contactResspTraveaux + "]";
	}

	public int getIdST() {
		return idST;
	}

	public void setIdST(int idST) {
		this.idST = idST;
	}

	public String getNomETP() {
		return nomETP;
	}

	public void setNomETP(String nomETP) {
		this.nomETP = nomETP;
	}

	public String getNomRessponsable() {
		return nomRessponsable;
	}

	public void setNomRessponsable(String nomRessponsable) {
		this.nomRessponsable = nomRessponsable;
	}

	public String getContactRessEtp() {
		return contactRessEtp;
	}

	public void setContactRessEtp(String contactRessEtp) {
		this.contactRessEtp = contactRessEtp;
	}

	public String getResponsableDeTraveaux() {
		return ResponsableDeTraveaux;
	}

	public void setResponsableDeTraveaux(String responsableDeTraveaux) {
		ResponsableDeTraveaux = responsableDeTraveaux;
	}

	public String getContactResspTraveaux() {
		return contactResspTraveaux;
	}

	public void setContactResspTraveaux(String contactResspTraveaux) {
		this.contactResspTraveaux = contactResspTraveaux;
	}

}
