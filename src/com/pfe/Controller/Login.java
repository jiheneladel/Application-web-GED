package com.pfe.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.pfe.DAO.UserDAO;
import com.pfe.Models.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("login");
		String passwd = request.getParameter("password");
		User u = UserDAO.getUserByLoginAndPassword(login, passwd);	
		if (u == null) {
			String msg="Nom de l'utilisateur ou Mot de passe non correcte!";
			request.getSession().setAttribute("erreur",msg);
			response.sendRedirect("login.jsp");
		}else {
			request.getSession().setAttribute("user", u);
			if (u.getType().equalsIgnoreCase("Manager")) {
				response.sendRedirect("Manager/index.jsp");
			}else {
				response.sendRedirect("Admin/index.jsp");
			}
		}
	}

}
