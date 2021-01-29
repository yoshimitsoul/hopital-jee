package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hopital.dao.sql.PatientDaoSql;
import fr.hopital.daoInt.IPatientDao;

@WebServlet("/patient-supprimer")
public class PatientSupprimerServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String numSSString = req.getParameter("numSS");

		IPatientDao daoPatient = new PatientDaoSql();

		daoPatient.deleteById(numSSString);

		// redirection sur liste des produits
		resp.sendRedirect("patient");

	}

}
