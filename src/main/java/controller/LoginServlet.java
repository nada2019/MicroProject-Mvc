package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.beans.Client;
import model.dao.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;
	private LoginDao loginDao= new LoginDao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Client client = new Client();
		client.setEmail(email);
		client.setPassword(password);
	

		try {
			if (loginDao.validate(client)) {
				
				
				response.sendRedirect("AfterLogin.jsp");
				
			} else {
				HttpSession session = request.getSession();
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
