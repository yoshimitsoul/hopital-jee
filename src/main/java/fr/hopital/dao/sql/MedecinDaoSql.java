package fr.hopital.dao.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.hopital.daoInt.IMedecinDao;
import fr.hopital.model.Medecin;

public class MedecinDaoSql extends DaoSql implements IMedecinDao {

	public List<Medecin> findAll() {
		List<Medecin> mesMedecins = new ArrayList<>();

		try {
			this.openConnection();

			// REQUETE DE SELECT DES PATIENTS
			Statement monStatement = this.connexionSql.createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT * FROM medecin");

			// PARCOURS DES RESULTATS DE LA REQUETE DE SELECTION DES PATIENTS
			while (monResultat.next()) {
				Medecin monMedecin = new Medecin();

				monMedecin.setNumRPPS(monResultat.getString("numRPPS"));
				monMedecin.setNomMED(monResultat.getString("nomMED"));
				monMedecin.setPrenomMED(monResultat.getString("prenomMED"));
				monMedecin.setSpecialite(monResultat.getString("specialite"));
				monMedecin.setVille(monResultat.getString("ville"));
				monMedecin.setAdresse(monResultat.getString("adresse"));
				mesMedecins.add(monMedecin);
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return mesMedecins;
	}

	public Medecin findById(String numRPPS) {
		try {
			this.openConnection();

			PreparedStatement monStatement = this.connexionSql
					.prepareStatement("SELECT * FROM medecin WHERE numRPPS = ?");

			monStatement.setString(1, numRPPS);

			ResultSet monResultat = monStatement.executeQuery();

			if (monResultat.next()) {
				Medecin medecin = new Medecin();

				medecin.setNumRPPS(monResultat.getString("numRPPS"));

				return medecin;
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return null;

	}

	public Medecin add(Medecin entity) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.connexionSql.prepareStatement(
					"INSERT INTO medecin (numRPPS, nomMED, prenomMED, specialite, ville, adresse) VALUES (?, ?, ?, ?, ?, ?)");

			monStatementInsert.setString(1, entity.getNumRPPS());
			monStatementInsert.setString(2, entity.getNomMED());
			monStatementInsert.setString(3, entity.getPrenomMED());
			monStatementInsert.setString(4, entity.getSpecialite());
			monStatementInsert.setString(5, entity.getVille());
			monStatementInsert.setString(6, entity.getAdresse());

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

	public Medecin save(Medecin entity) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.connexionSql.prepareStatement(
					"UPDATE medecin SET numRPPS= ?, nomMED= ?, prenomMED= ?, specialite= ?, ville= ?, adresse= ? WHERE numRPPS = ?");

			monStatementInsert.setString(1, entity.getNumRPPS());
			monStatementInsert.setString(2, entity.getNomMED());
			monStatementInsert.setString(3, entity.getPrenomMED());
			monStatementInsert.setString(4, entity.getSpecialite());
			monStatementInsert.setString(5, entity.getVille());
			monStatementInsert.setString(6, entity.getAdresse());
			monStatementInsert.setString(7, entity.getNumRPPS());

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

	public boolean deleteById(String numRPPS) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.connexionSql
					.prepareStatement("DELETE FROM medecin WHERE numRPPS = ?");

			monStatementInsert.setString(1, numRPPS);

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
