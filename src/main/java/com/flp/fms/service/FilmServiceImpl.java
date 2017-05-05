package com.flp.fms.service;

import java.util.ArrayList;

import com.flp.fms.dao.FilmDaoImpl;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;


public class FilmServiceImpl implements IFilmService {
	
	FilmDaoImpl fdi=new FilmDaoImpl();

	public String addFilm(Film f) {
		
		
		
		if(f.getLength()<10 || f.getLength()>200)
		{
			return "Please Provide An Valid Length Of The Movie";
		}
		
		
		if(fdi.searchFilm(f)!=null)
		{
			return "Duplicate Film!! This Film Already Exists In The Database!";
		}
		
		if(fdi.addFilm(f))
		{
			return "Done";
		}
		
		return "Failed";
		
		
	}
	
	
	
	
	
	
	

	public String modifyFilm(String title,int rYear,Film f) {
		
		if(title==null)
		{
			return "Null Value In Title Field";
		}
		if(f.getTittle()==null || f.getDescription()==null||f.getLength()==0||f.getRating()==null)
		{
			return "Do Not Provide Any Null Values" ;
		}
		
		if(fdi.updateFilm(title, rYear, f))
		{
			return "Updation Done In The Table";
		}
		return "Failed";
	}

	public String removeFilm(Film f) {
		
		if(f.getTittle()==null || f.getRelease_year()==0)
		{
			return "Null values In Mandatory Fields";
		}
		
		if(fdi.removeFilm(f))
		{
			return "Done";
		}
		return "Failed";
	}

	public ArrayList<Film> searchFilmByTitleAndReleaseYear(Film f) {
		
		if(f.getTittle()==null)
		{
			return null;
		}
		
		ArrayList<Film> af=fdi.searchFilm(f);
		if(fdi.searchFilm(f)==null)
		{
			return null;
		}
		return af;
	}

	public ArrayList<Film> searchByReleaseYear(Film f)
	{
		
		if(f.getRelease_year()==0)
		{
			return null;
		}
		
		ArrayList<Film> af=fdi.searchByReleaseYear(f);
		if(fdi.searchByReleaseYear(f)==null)
		{
			return null;
		}
		return af;
		
	}
	
	public ArrayList<Film> searchByRating(Film f)
	{
		if(f.getRating()==null)
		{
			return null;
		}
		
		ArrayList<Film> af=fdi.searchByRating(f);
		
		//System.out.println(af.size());
		if(fdi.searchByRating(f)==null)
		{
			return null;
		}
		return af;
		
	}
	
	public  ArrayList<Film> getAllFilm() {
		
		ArrayList<Film> alf=fdi.getAllFilm();
		if(fdi.getAllFilm()==null)
		{
			return null;
		}
	
		return alf;
	}
	
	
	public ArrayList<Film> searchBylanguage(String lang)
	{
		
		if(lang==null)
		{
			return null;
		}
		
	 ArrayList<Film> al=fdi.searchBylanguage(lang);
	 if(fdi.searchBylanguage(lang)==null)
	 {
		 return null;
	 }
		
		return al;
	}
	public ArrayList<Film> searchByActorFilm(Actor a)
	
	{
			if(a.getFirstName()==null||a.getLastName()==null)
			{
				return null;
			}
		
		
		
		return fdi.searchFilmByActor(a);
	}
	
	public ArrayList<Film> searchFilmByCategory(Category c)
	{
		if(c.getName()==null)
		{
			return null;
		}
		return fdi.searchByCategory(c);
	}








	@Override
	public ArrayList<Film> searchByTitleService(Film f) {
		
		if(f.getTittle()==null || f.getTittle()=="")
		{
			return null;
		}
		
		
		return fdi.searchByTitle(f);
	}

}
