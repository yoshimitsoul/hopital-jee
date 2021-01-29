package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hopital.dao.sql.DaoManager;
import fr.hopital.daoInt.IPatientDao;
import fr.hopital.model.Patient;

@WebServlet("/patient-modifier")
public class PatientModifierServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private IPatientDao daoPatient = DaoManager.getPatientDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/views/patient-modifier.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numSS = req.getParameter("numSS");
		String nomPat = req.getParameter("nomPat");
		String prenomPat = req.getParameter("prenomPat");
		String sexe = req.getParameter("sexe");
		String dateNaiss = req.getParameter("dateNaiss");
		String numRPPS = req.getParameter("numRPPS");

		Patient monPatient = this.daoPatient.findById(numSS);
		System.out.println(monPatient.getNomPat());

		monPatient.setNumSS(numSS);
		monPatient.setNomPat(nomPat);
		monPatient.setPrenomPat(prenomPat);
		monPatient.setSexe(sexe);
		monPatient.setDateNaiss(dateNaiss);
		monPatient.setNumRPPS(numRPPS);

		daoPatient.save(monPatient);

		resp.sendRedirect("patient");
	}

}
