package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hopital.dao.sql.PatientDaoSql;
import fr.hopital.daoInt.IPatientDao;

@WebServlet("/patient")
public class PatientServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IPatientDao daoPatient = new PatientDaoSql();

		req.setAttribute("patients", daoPatient.findAll());

		this.getServletContext().getRequestDispatcher("/WEB-INF/views/patient.jsp").forward(req, resp);

	}
}
