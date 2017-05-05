package com.flp.fms.dao;
import com.flp.fms.domain.Actor;
import java.sql.*;
import java.text.DateFormat;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.sql.Date;
import java.util.Date;

public class ActorDaoImpl implements IActorDao {
	Connection con = null;
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public boolean addActor(Actor a) {


		String cd=dateFormat.format(new Date());
		String fn=a.getFirstName();
		String ln=a.getLastName();
		String iUrl=a.getImageURL();
		Date dob=a.getDob();
		try {
			java.util.Date date = dateFormat.parse(cd);

			java.sql.Date createDate = new java.sql.Date(date.getTime());

			java.sql.Date dob1 = new java.sql.Date(dob.getTime());

			con = DataSource.getInstance().getConnection();
			Statement st=(Statement) con.createStatement();

			int result= st.executeUpdate("INSERT INTO actor(first_name, last_name, img_url, create_date,dob) VALUES('"+fn+"','"+ln+"','"+iUrl+"','"+createDate+"','"+dob1+"')");
			if(result>0)
			{
				con.close();
				return true;
			}

			con.close();
		} 

		catch (Exception e1) {

			System.out.println("Exception Occured");
		}

		return false;
	}
	public boolean updateActor(Actor a, String oldfirstName,Date oldDob) {


		//DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//String cd=dateFormat.format(new Date());
		String fn=a.getFirstName();
		String ln=a.getLastName();
		String iUrl=a.getImageURL();
		Date dob=a.getDob();
		try {
			//java.util.Date date = dateFormat.parse(cd);

			//java.sql.Date createDate = new java.sql.Date(date.getTime());

			java.sql.Date newdob = new java.sql.Date(dob.getTime());

			java.sql.Date olddob = new java.sql.Date(oldDob.getTime());

			con = DataSource.getInstance().getConnection();
			Statement st=(Statement) con.createStatement();

			int result= st.executeUpdate("update actor set first_name='"+fn+"',last_name='"+ln+"',img_url='"+iUrl+"',dob='"+newdob+"' where first_name='"+oldfirstName+"' and dob='"+olddob+"'");
			if(result>0)
			{
				con.close();
				return true;
			}

			con.close();
		} 

		catch (Exception e1) {

			System.out.println("Exception Occured");
		}



		return false;
	}
	public boolean removeActor(Actor a) {

		try{

			String cd=dateFormat.format(new Date());
			java.util.Date date = dateFormat.parse(cd);

			Date dob=a.getDob();
			java.sql.Date deleteDate = new java.sql.Date(date.getTime());
			java.sql.Date parsedDob = new java.sql.Date(dob.getTime());
			con = DataSource.getInstance().getConnection();
			Statement st = con.createStatement(); 
			int rs= st.executeUpdate("update actor set delete_date='"+deleteDate+"'where first_name='"+a.getFirstName()+"'and dob='"+parsedDob+"'");
			if(rs>0)
			{
				return true;
			}
			return false;


		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}


		return false;
	}
	public ArrayList<Actor> searchActor(String s) {	
		ArrayList<Actor> actorl=new ArrayList<Actor>();

		try{
			con = DataSource.getInstance().getConnection();
			Statement st = con.createStatement(); 
			ResultSet rs= st.executeQuery("Select first_name,last_name,dob,img_url from actor where first_name='"+s+"' and delete_date is null");
			while(rs.next()){  

				Actor a=new Actor();
				a.setFirstName(rs.getString(1));
				a.setLastName(rs.getString(2));

				a.setDob(rs.getDate(3));

				a.setImageURL(rs.getString(4));

				actorl.add(a);

			}

			con.close();
			return actorl;
		} catch(Exception e) {
			System.out.println("Exception Occured");
		}  
		return actorl;
	}
	public ArrayList<Actor> getAllActor() {

		ArrayList<Actor> actorl=new ArrayList<Actor>();

		try{
			con = DataSource.getInstance().getConnection();
			Statement st = con.createStatement(); 
			ResultSet rs= st.executeQuery("Select first_name,last_name,dob,img_url from actor where delete_date is null");
			while(rs.next()){  

				Actor a=new Actor();
				a.setFirstName(rs.getString(1));
				a.setLastName(rs.getString(2));

				a.setDob(rs.getDate(3));

				a.setImageURL(rs.getString(4));

				actorl.add(a);

			}

			con.close();
			return actorl;
		} catch(Exception e) {
			System.out.println("Exception Occured");
		}  
		return actorl;

	}
	public boolean duplicateActor(Actor a)
	{

		//String date1 = a.getDob().toString();

		//Date date = new Date(0);

		try{

			con = DataSource.getInstance().getConnection();
			Date dob=a.getDob();
			java.sql.Date dob1 = new java.sql.Date(dob.getTime());



			PreparedStatement dupQuery = con.prepareStatement("select * from actor where first_name=? and last_name=? and dob=? and delete_date is null ");
			dupQuery.setString(1,a.getFirstName());
			dupQuery.setString(2,a.getLastName());

			dupQuery.setDate(3,dob1);

			ResultSet rs=dupQuery.executeQuery();
			if(rs.next())
			{
				con.close();
				return true;
			}

			//Statement st=(Statement) con.createStatement();
		}
		catch(Exception e){
			System.out.println("Exception Occured");

		}
		return false;
	}
}
