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
import com.flp.fms.service.ActorServiceImpl;

/**
 * Servlet implementation class ServletForRemoveActor
 */
public class ServletForRemoveActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForRemoveActor() {
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
		StringBuffer sb = new StringBuffer();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Actor a=new Actor();
		ActorServiceImpl asi=new ActorServiceImpl();
	
		
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
			String fName = (String) joActor.get("fname");
			
			String dob = (String) joActor.get("dob");

		
			
		
			
	
			
			java.util.Date dateOfBirth;
			dateOfBirth = formatter.parse(dob);
			
			a.setFirstName(fName);
			a.setDob(dateOfBirth);

			String output=asi.removeActor(a);

		

			



			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.write(output);
			out.flush();
			out.close();
		} 





		catch (Exception e) {System.out.println("Exception Occured");}


	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*try {
			date = formatter.parse(udob);
			a.setDob(date);
			String result=asi.removeActor(a);
			if(result=="Done")
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
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}


