package fr.hopital.model;

import java.sql.Date;

public class Consulte {

	private String numRPPS;
	private String numSS;
	private Date dateConsult;
	private String diagnostic;
	private String ordonnance;

	public Consulte() {
	}

	public Consulte(String numRPPS, String numSS, Date dateConsult, String diagnostic, String ordonnance) {
		this.numRPPS = numRPPS;
		this.numSS = numSS;
		this.dateConsult = dateConsult;
		this.diagnostic = diagnostic;
		this.ordonnance = ordonnance;
	}

	public String getNumRPPS() {
		return numRPPS;
	}

	public void setNumRPPS(String numRPPS) {
		this.numRPPS = numRPPS;
	}

	public String getNumSS() {
		return numSS;
	}

	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}

	public Date getDateConsult() {
		return dateConsult;
	}

	public void setDateConsult(Date dateConsult) {
		this.dateConsult = dateConsult;
	}

	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public String getOrdonnance() {
		return ordonnance;
	}

	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}

}
