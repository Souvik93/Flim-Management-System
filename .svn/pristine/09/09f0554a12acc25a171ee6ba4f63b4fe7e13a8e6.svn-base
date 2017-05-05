package com.flp.fms.service;

import java.util.ArrayList;
import java.util.Date;

import com.flp.fms.dao.ActorDaoImpl;
import com.flp.fms.domain.Actor;


public class ActorServiceImpl implements IActorService {
	
	Actor a=new Actor();
	ActorDaoImpl adi=new ActorDaoImpl();

	public String addActor(Actor a) {
		
		if(a.getFirstName()==null)
		{
			return "You Have Entered Null Value In First Name Field";
		}
		
		if(a.getLastName()==null)
		{
			return "You Have Entered Null Value In Last Name Field";
		}
		if(a.getDob()==null)
		{
			return "You Have Entered Null Value In Date Of Birth Field";
		}
		if(a.getImageURL()==null)
		{
			return "You Have Not Provide Any Image For The Actor";
		}
		if(adi.duplicateActor(a))
		{
			return "This Actor Already exists";
		}
		if(adi.addActor(a))
		{
			return "New Actor Details Added Succusfully";
		}
		
		return "Failed";
	}

	public String modifyActor(Actor a, String firstName,Date dob) {
		
		
		if(firstName==null)
		{
			return "Null Value in First Name Field";
		}
		if(dob==null)
		{
			return "Null Value in Dob";
			
		}
		if(a.getFirstName()==null)
		{
			return "Null Value in First Name Field";
		}
		if(adi.updateActor(a,firstName,dob))
		{
			return "Updation Done";
		}
		return "Failed";
		
	}

	public String removeActor(Actor a) {
		
		if(adi.removeActor(a))
		{
			return "Done";
		}
		
		return "Failed";
	}

	public ArrayList<Actor> searchActor(String firstName) {
		
		if(firstName==null)
		{
			return null;
		}
		ArrayList<Actor> al=adi.searchActor(firstName);
		if(al.size()==0)
		{
			return null;
		}
		return al;
	}

	public ArrayList<Actor> getAllActor() {
		
	ArrayList<Actor> al=adi.getAllActor();
	
	if(al.size()==0)
	{
		
		return null;
	}
	return al;
	}

	
	
}
