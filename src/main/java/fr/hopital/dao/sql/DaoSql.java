package fr.hopital.dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DaoSql {
	protected Connection connexionSql;

	protected void openConnection() {
		try {
			this.connexionSql = DriverManager.getConnection("jdbc:mysql://localhost:8889/hopital?serverTimezone=UTC",
					"root", "root");
			System.out.println("Connexion OK !");
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	protected void closeConnection() {
		try {
			this.connexionSql.close();
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}