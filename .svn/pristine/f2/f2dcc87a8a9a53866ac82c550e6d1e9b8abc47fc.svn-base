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
 * Servlet implementation class ServletForSearchByFilmTitle
 */
public class ServletForSearchByFilmTitle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForSearchByFilmTitle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		FilmServiceImpl fsi=new FilmServiceImpl();
		
		Film f=new Film();
		f.setTittle("Piku");
		f.setRelease_year(2015);
		
		ArrayList<Film> al=fsi.searchFilmByTitleAndReleaseYear(f);
		
ObjectMapper objectMapper = new ObjectMapper();
		
		try
		{
			
		
		if(fsi.searchFilmByTitleAndReleaseYear(f)!=null){

			for(int i=0;i<al.size();i++)
			{
				 String writingJson=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(al.get(i));
	 			  
				   response.setContentType("application/json");
			        PrintWriter out = response.getWriter();
			        out.print(writingJson);
			}
			}
		
		else
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("<b>");
			
			out.print("Sorry Film Details Not Found!!! Check That You Have Entered Correct Details Or Not");
			
			out.print("</b>");
			
			out.print("</body>");
			
			
			out.print("</html>");
		}
		
	}
	catch(Exception e)
	{
		

		System.out.println("Exception Occured");
		
		
	}
		
		
		
		
	}

}
