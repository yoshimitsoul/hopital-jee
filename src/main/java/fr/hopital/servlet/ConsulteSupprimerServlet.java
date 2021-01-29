package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hopital.dao.sql.ConsulteDaoSql;
import fr.hopital.daoInt.IConsulteDao;

@WebServlet("/consulte-supprimer")
public class ConsulteSupprimerServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numRPPSString = req.getParameter("numRPPS");

		IConsulteDao daoConsulte = new ConsulteDaoSql();

		daoConsulte.deleteById(numRPPSString);

		resp.sendRedirect("consulte");

	}
}
