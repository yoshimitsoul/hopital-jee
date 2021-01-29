package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hopital.dao.sql.ConsulteDaoSql;
import fr.hopital.daoInt.IConsulteDao;

@WebServlet("/consulte")
public class ConsulteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IConsulteDao daoConsulte = new ConsulteDaoSql();

		req.setAttribute("consulte", daoConsulte.findAll());

		this.getServletContext().getRequestDispatcher("/WEB-INF/views/consulte.jsp").forward(req, resp);
	}
}
