package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hopital.dao.sql.MedecinDaoSql;
import fr.hopital.daoInt.IMedecinDao;

@WebServlet("/medecin-supprimer")
public class MedecinSupprimerServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numRPPSString = req.getParameter("numRPPS");

		IMedecinDao daoMedecin = new MedecinDaoSql();

		daoMedecin.deleteById(numRPPSString);

		// redirection sur liste des medecins
		resp.sendRedirect("medecin");
	}
}
