package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.beans.Client;
import model.dao.ClientDao;

/**
 * Servlet implementation class ClientData
 */
@WebServlet("/register")
public class ClientData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClientDao clientDao=new ClientDao();
	
       
    
    public ClientData() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:").append(request.getContextPath());
		RequestDispatcher dispatcher=request.getRequestDispatcher("Formulaire.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FirstName = request.getParameter("FirstName");
        String LastName = request.getParameter("LastName");
        String Email = request.getParameter("Email");
        String Adress = request.getParameter("Adress");
        String Ville = request.getParameter("Ville");
        int CodePostal = Integer.parseInt(request.getParameter("CodePostal"));
        int PhoneNumber = Integer.parseInt(request.getParameter("PhoneNumber"));
        String Password = request.getParameter("Password");
        
        Client client = new Client();
        client.setFirstName(FirstName);
        client.setLastName(LastName);
        client.setEmail(Email);
        client.setAdress(Adress);
        client.setVille(Ville);
        client.setCodePostal(CodePostal);
        client.setPhoneNumber(PhoneNumber);
        client.setPassword(Password);
        request.getRequestDispatcher("AfterLogin.jsp").forward(request, response);
        
        try {
            clientDao.registerClient(client);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
   
        }
       


	}

}
