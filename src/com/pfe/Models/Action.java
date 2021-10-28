package com.pfe.Models;

public class Action {
	private int ID_Action;
	private String nomAction;
	private String source;
	private String Description;
	private String Ressponsable;
	private String Delai;
	private String DateRealisation;

	public int getID_Action() {
		return ID_Action;
	}

	public void setID_Action(int iD_Action) {
		ID_Action = iD_Action;
	}

	public String getNomAction() {
		return nomAction;
	}

	public void setNomAction(String nomAction) {
		this.nomAction = nomAction;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getRessponsable() {
		return Ressponsable;
	}

	public void setRessponsable(String ressponsable) {
		Ressponsable = ressponsable;
	}

	public String getDelai() {
		return Delai;
	}

	public void setDelai(String delai) {
		Delai = delai;
	}

	public String getDateRealisation() {
		return DateRealisation;
	}

	public void setDateRealisation(String dateRealisation) {
		DateRealisation = dateRealisation;
	}

	public Action() {
		super();
	}

	public Action(String nomAction, String source, String description, String ressponsable, String delai,
			String dateRealisation) {
		super();
		this.nomAction = nomAction;
		this.source = source;
		Description = description;
		Ressponsable = ressponsable;
		Delai = delai;
		DateRealisation = dateRealisation;
	}

	@Override
	public String toString() {
		return "Action [ID_Action=" + ID_Action + ", nomAction=" + nomAction + ", source=" + source + ", Description="
				+ Description + ", Ressponsable=" + Ressponsable + ", Delai=" + Delai + ", DateRealisation="
				+ DateRealisation + "]";
	}

}
