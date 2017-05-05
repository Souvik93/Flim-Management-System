package com.flp.fms.view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;



import com.flp.fms.domain.Actor;

import com.flp.fms.domain.Film;
import com.flp.fms.domain.Rating;

import com.flp.fms.service.FilmServiceImpl;

public class TestMain {

	
	public static void main(String[] args) throws ParseException {

		String std="1955-05-08";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		java.util.Date startDate = df.parse(std);


		FilmServiceImpl fsi=new FilmServiceImpl();

		System.out.println(startDate);




		Film f=new Film();

		f.setRating(Rating.A);


		f.setRelease_year(2015);




		Actor a=new Actor();
		a.setFirstName("Salman");
		a.setLastName("Khan");
		System.out.println(fsi.searchByActorFilm(a));
	}

}
