package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hopital.dao.sql.PatientDaoSql;
import fr.hopital.daoInt.IPatientDao;
import fr.hopital.model.Medecin;
import fr.hopital.model.Patient;

@WebServlet("/patient-ajout")
public class PatientAjoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/views/patient-ajout.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numSS = req.getParameter("nnumSS");
		String nomPat = req.getParameter("nomPat");
		String prenomPat = req.getParameter("prenomPat");
		String sexe = req.getParameter("sexe");
		String dateNaiss = req.getParameter("dateNaiss");
		String numRPPS = req.getParameter("numRPPS");

		Medecin monMedecin = new Medecin();
		// monMedecin.setNumRPPS(1);

		Patient monPatient = new Patient();

		monPatient.setNumSS(numSS);
		monPatient.setNomPat(nomPat);
		monPatient.setPrenomPat(prenomPat);
		monPatient.setSexe(sexe);
		monPatient.setDateNaiss(dateNaiss);
		monPatient.setNumRPPS(numRPPS);

		IPatientDao daoPatient = new PatientDaoSql();

		daoPatient.add(monPatient);

		resp.sendRedirect("patient");
	}

}
