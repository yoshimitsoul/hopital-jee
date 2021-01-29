package fr.hopital.model;

;

public class Patient {

	private String numSS;
	private String nomPat;
	private String prenomPat;
	private String sexe;
	private String dateNaiss;
	private String numRPPS;

	public Patient() {

	}

	public Patient(String numSS, String nomPat, String prenomPat, String sexe, String dateNaiss, String numRPPS) {
		this.numSS = numSS;
		this.nomPat = nomPat;
		this.prenomPat = prenomPat;
		this.sexe = sexe;
		this.dateNaiss = dateNaiss;
		this.numRPPS = numRPPS;
	}

	public String getNumSS() {
		return numSS;
	}

	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}

	public String getNomPat() {
		return nomPat;
	}

	public void setNomPat(String nomPat) {
		this.nomPat = nomPat;
	}

	public String getPrenomPat() {
		return prenomPat;
	}

	public void setPrenomPat(String prenomPat) {
		this.prenomPat = prenomPat;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(String string) {
		this.dateNaiss = string;
	}

	public String getNumRPPS() {
		return numRPPS;
	}

	public void setNumRPPS(String numRPPS) {
		this.numRPPS = numRPPS;
	}

}