package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.beans.Article;

public class ArticlesDao {
	DBConnection mt = new DBConnection();
    Connection myConn = mt.myConn;

    private class DBConnection {
        public Connection myConn;

        public DBConnection() {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                myConn = 
          DriverManager.getConnection("jdbc:mysql://localhost:3306/Project?useSSL=false", "root", "exosaranghae");
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
    }

    public ArrayList<Article> getArticles() {
        ArrayList<Article> articles = new ArrayList<>();
         try {
               PreparedStatement pst = 
                       myConn.prepareStatement("select * from Article");
               ResultSet r = pst.executeQuery();
               while(r.next()) {
            	   Article art = new Article();
            	   art.setCateg(r.getString("Categorie"));
            	   art.setCodeArt(r.getInt("CodeArticle"));
            	   art.setDesig(r.getString("Designation"));
            	   art.setPrix(r.getInt("Prix"));
            	   art.setPhoto(r.getByte("Photo"));
            	   art.setStock(r.getInt("Stock"));
                
                   
            	   articles.add(art);
                }
              }
               catch (SQLException exc) {
                    System.out.println("An error occured. Error: " + exc.getMessage());
           }
         return articles;
    }

}
