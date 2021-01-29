package fr.hopital.model;

public class Medecin {

	private String numRPPS;
	private String nomMED;
	private String prenomMED;
	private String specialite;
	private String ville;
	private String adresse;

	public Medecin() {

	}

	public Medecin(String numRPPS, String nomMED, String prenomMED, String specialite, String ville, String adresse) {
		this.numRPPS = numRPPS;
		this.nomMED = nomMED;
		this.prenomMED = prenomMED;
		this.specialite = specialite;
		this.ville = ville;
		this.adresse = adresse;
	}

	public String getNumRPPS() {
		return numRPPS;
	}

	public void setNumRPPS(String numRPPS) {
		this.numRPPS = numRPPS;
	}

	public String getNomMED() {
		return nomMED;
	}

	public void setNomMED(String nomMED) {
		this.nomMED = nomMED;
	}

	public String getPrenomMED() {
		return prenomMED;
	}

	public void setPrenomMED(String prenomMED) {
		this.prenomMED = prenomMED;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}