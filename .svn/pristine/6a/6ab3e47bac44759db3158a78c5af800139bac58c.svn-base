package com.servlet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Film;
import com.flp.fms.service.ActorServiceImpl;
import com.flp.fms.service.FilmServiceImpl;

public class SearchByReleaseYearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchByReleaseYearServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		FilmServiceImpl fsi=new FilmServiceImpl();
		Film f=new Film();
		
		
		String rYear= request.getParameter("sbr");
		int rY=Integer.parseInt(rYear);
		f.setRelease_year(rY);
		ArrayList<Film> al = fsi.searchByReleaseYear(f);
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StringBuffer sb = new StringBuffer();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Actor actor=new Actor();

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

			String firstName = (String) joActor.get("fname");

			String lastName=  (String) joActor.get("lname");

			String dob=  (String) joActor.get("dob");

			java.util.Date dateOfBirth;
			dateOfBirth = formatter.parse(dob);
			String img=  (String) joActor.get("imgUrl");


			actor.setFirstName(firstName);
			actor.setLastName(lastName);
			actor.setDob(dateOfBirth);
			actor.setImageURL(img);
			ActorServiceImpl asi=new ActorServiceImpl();

			String output=asi.addActor(actor);



			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.write(output);
			out.flush();
			out.close();
		} 

		catch (ParseException e) {
			
			System.out.println("Exception Occured");
		}
		catch (Exception e) { System.out.println("Exception Occured"); }


	}
		
	}


