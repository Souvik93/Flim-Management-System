package com.flp.fms.dao;

import java.util.ArrayList;
import java.util.Date;

import com.flp.fms.domain.Actor;


public interface IActorDao {

	public boolean addActor(Actor a);

	public boolean updateActor(Actor a, String firstName,Date dob);

	public boolean removeActor(Actor a);

	public ArrayList<Actor> searchActor(String s);

	public ArrayList<Actor> getAllActor();
	public boolean duplicateActor(Actor a);

}
