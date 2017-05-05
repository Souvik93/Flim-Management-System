package com.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;
import com.flp.fms.domain.Rating;

import com.flp.fms.service.FilmServiceImpl;

public class AddFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFilmServlet() {
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
	

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	





		FilmServiceImpl fsi=new FilmServiceImpl();


		StringBuffer sb = new StringBuffer();
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		

		try 
		{
			BufferedReader reader = request.getReader();
			String line = null;
			while ((line = reader.readLine()) != null)
			{
				sb.append(line);
			}

			JSONParser parser = new JSONParser();
			JSONObject joActor = null;
			joActor = (JSONObject) parser.parse(sb.toString());

			
			

		


			String newTitle = (String) joActor.get("title");

			String newDescription = (String) joActor.get("description");

			String newRYear = (String) joActor.get("ry");

			int newYear=Integer.parseInt(newRYear);

			String newLength = (String) joActor.get("length");

			int newLen=Integer.parseInt(newLength);


			String ratings = (String) joActor.get("rating");
			
			String languageName = (String) joActor.get("language");
			
			
			String noac= (String) joActor.get("noac");
			
			Film f=new Film();
			
			if(noac=="1")
			{
				Actor actor=new Actor();
				String fn1= (String) joActor.get("a1fn");
				String ln1= (String) joActor.get("a1ln");
				String dob1= (String) joActor.get("dob1");
				java.util.Date date1;
				date1 = formatter.parse(dob1);
				actor.setDob(date1);
				actor.setFirstName(fn1);
				actor.setLastName(ln1);
				
				f.getAl().add(actor);
				
				
				
			}
			
			

			if(noac=="2")
			{
				Actor actor1=new Actor();
				String fn1= (String) joActor.get("a2fn");
				String ln1= (String) joActor.get("a2ln");
				String dob2= (String) joActor.get("dob2");
				java.util.Date date2;
				date2 = formatter.parse(dob2);
				actor1.setDob(date2);
				actor1.setFirstName(fn1);
				actor1.setLastName(ln1);
				
				f.getAl().add(actor1);
				
				
				
			}
			
			String noCategory= (String) joActor.get("noca");
			
			if(noCategory=="1")
			{
				Category c1=new Category();
				c1.setName((String) joActor.get("cat1"));
				f.getAc().add(c1);
				
			}
			
			if(noCategory=="2")
			{
				Category c2=new Category();
				c2.setName((String) joActor.get("cat2"));
				f.getAc().add(c2);
				
			}


			

			f.setTittle(newTitle);
			f.setDescription(newDescription);

			f.setRelease_year(newYear);

			f.setLength(newLen);


			Rating filmRatings=null;


			if(ratings.equals("A"))
				filmRatings=Rating.A;

			if(ratings.equals("UA"))
				filmRatings=Rating.UA;

			if(ratings.equals("PG"))
				filmRatings=Rating.PG;


			f.setRating(filmRatings);
			
			Language l=new Language();
			l.setLangugaeName(languageName);
			f.setLanguage(l);
		

			String output=fsi.addFilm(f);

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.write(output);
			out.flush();
			out.close();
		} 





		catch (Exception e) { System.out.println("Exception Occured"); }


		
	}

}

