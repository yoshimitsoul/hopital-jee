package fr.hopital.dao.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.hopital.daoInt.IConsulteDao;
import fr.hopital.model.Consulte;

public class ConsulteDaoSql extends DaoSql implements IConsulteDao {

	public List<Consulte> findAll() {
		List<Consulte> mesConsultes = new ArrayList<>();

		try {
			this.openConnection();

			Statement monStatement = this.connexionSql.createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT * FROM consulte");

			while (monResultat.next()) {
				Consulte maConsulte = new Consulte();

				maConsulte.setNumRPPS(monResultat.getString("numRPPS"));
				maConsulte.setNumSS(monResultat.getString("numSS"));
				maConsulte.setDateConsult(monResultat.getDate("dateConsult"));
				maConsulte.setDiagnostic(monResultat.getString("diagnostic"));
				maConsulte.setOrdonnance(monResultat.getString("ordonnance"));
				mesConsultes.add(maConsulte);
			}
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return mesConsultes;
	}

	public Consulte findById(String numRPPS) {
		return null;
	}

	public Consulte add(Consulte entity) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.connexionSql.prepareStatement(
					"INSERT INTO patient (numRPPS, numSS, dateConsult, diagnostic, ordonnance) VALUES (?, ?, ?, ?, ?)");

			monStatementInsert.setString(1, entity.getNumRPPS());
			monStatementInsert.setString(2, entity.getNumSS());
			monStatementInsert.setDate(3, entity.getDateConsult());
			monStatementInsert.setString(4, entity.getDiagnostic());
			monStatementInsert.setString(5, entity.getOrdonnance());

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

	public Consulte save(Consulte entity) {
		return null;
	}

	public boolean deleteById(String numRPPS) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.connexionSql
					.prepareStatement("DELETE FROM consulte WHERE numRPPS = ?");

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
