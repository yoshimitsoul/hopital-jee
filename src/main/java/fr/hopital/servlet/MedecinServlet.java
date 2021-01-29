package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hopital.dao.sql.MedecinDaoSql;
import fr.hopital.daoInt.IMedecinDao;

@WebServlet("/medecin")
public class MedecinServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IMedecinDao daoMedecin = new MedecinDaoSql();

		req.setAttribute("medecins", daoMedecin.findAll());

		this.getServletContext().getRequestDispatcher("/WEB-INF/views/medecin.jsp").forward(req, resp);
	}

}
