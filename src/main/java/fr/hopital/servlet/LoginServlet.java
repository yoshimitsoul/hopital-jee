package fr.hopital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("error") != null) {
			req.setAttribute("messageErreur", "Nom d'utilisateur ou mot de passe incorrect.");
		}

		this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String monUsername = req.getParameter("username");
		String monPassword = req.getParameter("password");

		if (monUsername.equals("admin") && monPassword.equals("admin")) {
			// Ajout dans le scope session de l'attribut usrSession
			req.getSession().setAttribute("usrSession", monUsername);

			// Redirection vers la page home
			resp.sendRedirect("home");
		}

		else {
			resp.sendRedirect("login?error=true");
		}
	}
}
