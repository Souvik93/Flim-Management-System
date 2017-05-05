package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.flp.fms.domain.Actor;

import com.flp.fms.service.ActorServiceImpl;



/**
 * Servlet implementation class GetAllActorServlet
 */
public class GetAllActorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetAllActorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		/res.sendRedirect("/redirect.html");

		ActorServiceImpl asi=new ActorServiceImpl();

		ArrayList<Actor> al = asi.getAllActor();
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

}
