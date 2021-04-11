package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.beans.Article;
import model.dao.ArticlesDao;


@WebServlet("/Article")
public class FourthPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
     {  
		 ArticlesDao p = new ArticlesDao();
	        ArrayList<Article> article = p.getArticles();
	        request.setAttribute("list2",article);
			String action = request.getParameter("action");
	        request.setAttribute("action", action);
	        request.getRequestDispatcher("FourthPage.jsp").forward(request,  response);  
    } 

}
