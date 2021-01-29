package fr.hopital.dao.sql;

import fr.hopital.daoInt.IPatientDao;

public class DaoManager {
	private static IPatientDao daoPatient;

	public static IPatientDao getPatientDao() {
		if (daoPatient == null) {
			daoPatient = new PatientDaoSql();
		}

		return daoPatient;
	}
}
