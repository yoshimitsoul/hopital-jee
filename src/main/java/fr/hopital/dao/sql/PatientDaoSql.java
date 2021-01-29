package fr.hopital.dao.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.hopital.daoInt.IPatientDao;
import fr.hopital.model.Patient;

public class PatientDaoSql extends DaoSql implements IPatientDao {

	public List<Patient> findAll() {
		List<Patient> mesPatients = new ArrayList<>();

		try {
			this.openConnection();

			// REQUETE DE SELECT DES PATIENTS
			Statement monStatement = this.connexionSql.createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT * FROM patient");

			// PARCOURS DES RESULTATS DE LA REQUETE DE SELECTION DES PATIENTS
			while (monResultat.next()) {
				Patient monPatient = new Patient();

				monPatient.setNumSS(monResultat.getString("numSS"));
				monPatient.setNomPat(monResultat.getString("nomPat"));
				monPatient.setPrenomPat(monResultat.getString("prenomPat"));
				monPatient.setSexe(monResultat.getString("sexe"));
				monPatient.setDateNaiss(monResultat.getString("dateNaiss"));
				monPatient.setNumRPPS(monResultat.getString("numRPPS"));
				mesPatients.add(monPatient);
			}
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return mesPatients;
	}

	public Patient findById(String numSS) {
		try {
			this.openConnection();

			PreparedStatement monStatement = this.connexionSql
					.prepareStatement("SELECT * FROM patient WHERE numSS = ?");

			monStatement.setString(1, numSS);

			ResultSet monResultat = monStatement.executeQuery();

			if (monResultat.next()) {
				Patient patient = new Patient();

				patient.setNumSS(monResultat.getString("numSS"));

				return patient;
			}
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return null;
	}

	public Patient add(Patient entity) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.connexionSql.prepareStatement(
					"INSERT INTO patient (numSS, nomPat, prenomPat, sexe, dateNaiss, numRPPS) VALUES (?, ?, ?, ?, ?, ?)");

			monStatementInsert.setString(1, entity.getNumSS());
			monStatementInsert.setString(2, entity.getNomPat());
			monStatementInsert.setString(3, entity.getPrenomPat());
			monStatementInsert.setString(4, entity.getSexe());
			monStatementInsert.setString(5, entity.getDateNaiss());
			monStatementInsert.setString(6, entity.getNumRPPS());

			monStatementInsert.execute();
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return entity;
	}

	public Patient save(Patient entity) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.connexionSql.prepareStatement(
					"UPDATE patient SET numSS= ?, nomPat= ?, prenomPat= ?, sexe= ?, dateNaiss= ?, numRPPS= ? WHERE numSS = ?");

			monStatementInsert.setString(1, entity.getNumSS());
			monStatementInsert.setString(2, entity.getNomPat());
			monStatementInsert.setString(3, entity.getPrenomPat());
			monStatementInsert.setString(4, entity.getSexe());
			monStatementInsert.setString(5, entity.getDateNaiss());
			monStatementInsert.setString(6, entity.getNumRPPS());
			monStatementInsert.setString(7, entity.getNumSS());

			monStatementInsert.execute();
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return entity;
	}

	public boolean deleteById(String numSS) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.connexionSql
					.prepareStatement("DELETE FROM patient WHERE numSS = ?");

			monStatementInsert.setString(1, numSS);

			monStatementInsert.execute();

			return true;
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
			return false;
		}

		finally {
			this.closeConnection();
		}
	}

}
