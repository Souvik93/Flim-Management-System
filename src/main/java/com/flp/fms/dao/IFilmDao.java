package com.flp.fms.dao;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;

import com.flp.fms.domain.Film;


import java.util.*;

public interface IFilmDao {
	public boolean addFilm(Film f);

	public boolean updateFilm(String title,int release_year,Film f);

	public boolean removeFilm(Film f);

	public  ArrayList<Film> searchFilm(Film f);

	public ArrayList<Film> searchByReleaseYear(Film f);


	public ArrayList<Film> searchByRating(Film f);

	public ArrayList<Film> searchBylanguage(String lang);
	public ArrayList<Film> searchFilmByActor(Actor a);

	public ArrayList<Film> searchByCategory(Category c);

	public  ArrayList<Film> getAllFilm();

	public ArrayList<Film> searchByTitle(Film f);

}
