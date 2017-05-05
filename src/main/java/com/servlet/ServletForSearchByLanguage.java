package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.flp.fms.domain.Film;
import com.flp.fms.service.FilmServiceImpl;

/**
 * Servlet implementation class ServletForSearchByLanguage
 */
public class ServletForSearchByLanguage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForSearchByLanguage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String langName=request.getParameter("sbl");
		FilmServiceImpl fsi=new FilmServiceImpl();
		
		ArrayList<Film> al = fsi.searchBylanguage(langName);
		
		if(al!=null)
		{
		ObjectMapper objectMapper = new ObjectMapper();
		 try
		 {
			 PrintWriter out = response.getWriter();
			  out.print("[");
			 for(int i=0;i<al.size();i++)
			 {
				 String writingJson=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(al.get(i));
				 response.setContentType("application/json");
			       if(i==al.size()-1)
			       {
			        out.print(writingJson);
			        break;
			       }
			       out.print(writingJson+",");
			 
			 }
			  out.print("]");
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception Occured");
		 }
		}
		else
		{
			response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    out.write("Sorry No Film Details Found in Our Database!");
		    
		    out.flush();
		    out.close();
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String langName=request.getParameter("sbl");
		FilmServiceImpl fsi=new FilmServiceImpl();
		/*Language l=new Language();
		l.setLangugaeName("Hindi");*/
		
		
ArrayList<Film> al= fsi.searchBylanguage(langName);
		
		ObjectMapper objectMapper = new ObjectMapper();
		for(int i=0;i<al.size();i++)
		{
			 String writingJson=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(al.get(i));
			   response.setContentType("application/json");
		        PrintWriter out = response.getWriter();
		        out.print(writingJson);
		}
		
		
	}

}
