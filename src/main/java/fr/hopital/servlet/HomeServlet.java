package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/home", loadOnStartup = 1)
public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getSession().getAttribute("usrSession") == null) {
			resp.sendRedirect("login");
			return;
		}

		String monUsername = req.getParameter("username");

		req.setAttribute("utilisateur", monUsername);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String monUsername = req.getParameter("username");

		System.out.println(monUsername);

		resp.sendRedirect("home");
	}

}