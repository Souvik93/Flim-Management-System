package com.flp.fms.service;

import java.util.ArrayList;
import java.util.Date;

import com.flp.fms.domain.Actor;


public interface IActorService {
	public String addActor(Actor a);
	public String modifyActor(Actor a, String firstName,Date dob);
	public String removeActor(Actor a);
	public ArrayList<Actor> searchActor(String firstName);
	public ArrayList<Actor> getAllActor();
	
}
