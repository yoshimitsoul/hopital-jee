package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hopital.dao.sql.MedecinDaoSql;
import fr.hopital.daoInt.IMedecinDao;
import fr.hopital.model.Medecin;

@WebServlet("/medecin-ajout")
public class MedecinAjoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/views/medecin-ajout.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numRPPS = req.getParameter("numRPPS");
		String nomMed = req.getParameter("nomMed");
		String prenomMed = req.getParameter("prenomMed");
		String specialite = req.getParameter("specialite");
		String ville = req.getParameter("ville");
		String adresse = req.getParameter("adresse");

		Medecin monMedecin = new Medecin();

		monMedecin.setNumRPPS(numRPPS);
		monMedecin.setNomMED(nomMed);
		monMedecin.setPrenomMED(prenomMed);
		monMedecin.setSpecialite(specialite);
		monMedecin.setVille(ville);
		monMedecin.setAdresse(adresse);

		IMedecinDao daoMedecin = new MedecinDaoSql();

		daoMedecin.add(monMedecin);

		resp.sendRedirect("medecin");
	}
}
