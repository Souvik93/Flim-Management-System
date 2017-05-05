package com.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



import com.flp.fms.domain.Film;

import com.flp.fms.domain.Rating;

import com.flp.fms.service.FilmServiceImpl;

/**
 * Servlet implementation class ServletForUpdateFilm
 */
public class ServletForUpdateFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletForUpdateFilm() {
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


		StringBuffer sb = new StringBuffer();
		

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

			String oldTitle = (String) joActor.get("otitle");

			String orYear=  (String) joActor.get("orYear");


			int rY=Integer.parseInt(orYear);



			String newTitle = (String) joActor.get("newTitle");

			String newDescription = (String) joActor.get("newDescription");

			String newRYear = (String) joActor.get("newYear");

			int newYear=Integer.parseInt(newRYear);

			String newLength = (String) joActor.get("newLength");

			int newLen=Integer.parseInt(newLength);


			String ratings = (String) joActor.get("newRating");


			//String dob=  (String) joActor.get("dob");




			Film f=new Film();

			f.setTittle(newTitle);
			f.setDescription(newDescription);

			f.setRelease_year(newYear);

			f.setLength(newLen);


			Rating filmRatings=null;


			if(ratings.equals('A'))
				filmRatings=Rating.A;

			if(ratings.equals("UA"))
				filmRatings=Rating.UA;

			if(ratings.equals("PG"))
				filmRatings=Rating.PG;


			f.setRating(filmRatings);


			String output=fsi.modifyFilm(oldTitle, rY, f);



			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.write(output);
			out.flush();
			out.close();
		} 





		catch (Exception e) { System.out.println("Exception Occured"); }


	}




	/*	
		FilmServiceImpl fsi=new FilmServiceImpl();
		String udob = "2000-12-12";

		String title="Rayees";
		int rYear=2016;

		try {

			Film f=new Film();

			f.setTittle("Rayees");

			f.setDescription("Film by SRK");

			f.setRelease_year(2016);


			f.setLength(180);

			f.setRating(Rating.PG);


			String s=fsi.modifyFilm(title, rYear, f);

			if(s=="Updation Done In The Table")
			{
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("<html>");
				out.print("<body>");
				out.print("<b>");

				out.print("!Done");

				out.print("</b>");

				out.print("</body>");


				out.print("</html>");
			}

			else
			{

				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("<html>");
				out.print("<body>");
				out.print("<b>");

				out.print("Failed");

				out.print("</b>");

				out.print("</body>");


				out.print("</html>");
			}




		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 */

}


