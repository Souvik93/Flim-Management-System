package com.flp.fms.util;

import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


import org.junit.Test;

import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;
import com.flp.fms.domain.Rating;

import com.flp.fms.service.FilmServiceImpl;

public class TestFilmService {

	FilmServiceImpl fsi=new FilmServiceImpl();
	
	
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	
	//addFilm() Method

	/*@Test
	public void addFilmSuccesful() throws ParseException {



		Film f=new Film();
		
		Language l=new Language();
		l.setLangugaeName("Hindi");

		f.setDescription("Action");

		f.setTittle("Jungle Book2");

		f.setLength(175);

		f.setRating(Rating.PG);
		

		f.setLanguage(l);

		f.setRelease_year(2014);
		
		Actor a=new Actor();
		
		a.setFirstName("Johnny");
		a.setLastName("Depp");
		

		String udob = "1963-06-09";
		java.util.Date date = formatter.parse(udob);
		a.setDob(date);

        Actor a1=new Actor();
		
		a1.setFirstName("Ajay");
		a1.setLastName("Devgn");
		

		String udob1 = "1969-04-02";
		java.util.Date date1 = formatter.parse(udob1);
		
		a1.setDob(date1);
		
		f.getAl().add(a);
		
		f.getAl().add(a1);
		
		Category c=new Category();
		c.setName("Action");
		
		Category c1=new Category();
		c1.setName("Comedy");
		
		f.getAc().add(c);
		f.getAc().add(c1);
		
		
		assertEquals(fsi.addFilm(f),"Done");

	} 
*/

/*	@Test
	public void addFilmWhenFilmIsNull() {

		Film f=new Film();
		ArrayList<Actor> aa=new ArrayList<Actor>();
		ArrayList<Category> ac=new ArrayList<Category>();
		Language l=new Language();

		assertEquals(fsi.addFilm(f),"Please Enter Value in valid Fields");
	} 


	@Test
	public void addFilmWhenFilmLengthIsNotValid() {

		Film f=new Film();
		ArrayList<Actor> aa=new ArrayList<Actor>();
		ArrayList<Category> ac=new ArrayList<Category>();
		Language l=new Language();
		l.setLamguageId(1);

		f.setDescription("Family Drama");

		f.setTittle("Piku");

		f.setLength(5);

		f.setRating(5);

		f.setLanguage(l);

		f.setRelease_year(2015);

		assertEquals(fsi.addFilm(f),"Please Provide An Valid Length Of The Movie");
	} 
*/


	@Test
	public void addFilmWhenDuplicateFlimPresent() {

		Film f=new Film();
		
		Language l=new Language();
		l.setLamguageId(1);

		f.setDescription("Family Drama");

		f.setTittle("Black Mass");

		f.setLength(156);

		f.setRating(Rating.A);

		f.setLanguage(l);

		f.setRelease_year(2015);

		assertEquals(fsi.addFilm(f),"Duplicate Film!! This Film Already Exists In The Database!");
	} 

	//SearchFilm By Release Year And Title
	@Test
	public void searchFilmUsingTitleNullValues() {

		Film f=new Film();
		assertEquals(fsi.searchFilmByTitleAndReleaseYear(f),null);
	} 




	@Test
	public void searchFilmUsingTitleNotFound() {
		Film f=new Film();
		f.setDescription("Family Drama");
		f.setTittle("Pikuu");
		f.setRelease_year(2015);
		assertEquals(fsi.searchFilmByTitleAndReleaseYear(f),null);
	} 


	/*@Test
	public void searchFilmUsingTitleSuccesful() {
		Film f=new Film();
		f.setTittle("Piku");
		f.setRelease_year(2015);
		ArrayList<Film> af=fsi.searchFilmByTitleAndReleaseYear(f);
		
		
		String test;
		if(af.size()>0)
		{
			test="Done";
		}
		else
		{
			test="Failed";
		}
		
		assertEquals(test,"Done");

	} */


	//Search By Release Year

	@Test
	public void searchFilmUsingReleaseYearForNull() {

		Film f=new Film();
		assertEquals(fsi.searchByReleaseYear(f),null);
	} 


	/*@Test
	public void searchFilmUsingReleaseYearForNotFound() {

		Film f=new Film();

		f.setRelease_year(2090);




		assertEquals(fsi.searchByReleaseYear(f),null);
	} */

	@Test
	public void searchFilmUsingReleaseYearSuccssful() {

		Film f=new Film();

		f.setRelease_year(2015);

		ArrayList<Film> af=fsi.searchByReleaseYear(f);
		String test;
		if(af.size()>0)
		{
			test="Done";
		}
		else
		{
			test="Failed";
		}
		
		assertEquals(test,"Done");
	} 


	//SearchByRating


	@Test
	public void searchFilmUsingRatingSuccusful() {

		Film f=new Film();

		f.setRating(Rating.UA);

		ArrayList<Film> af=fsi.searchByRating(f);

		String test;
		if(af.size()>0)
		{
			test="Done";
		}
		else
		{
			test="Failed";
		}

		assertEquals(test,"Done");


	} 



	@Test
	public void searchFilmUsingRatingNotFound() {

		Film f=new Film();

		f.setRating(Rating.UA);




		assertEquals(fsi.searchByReleaseYear(f),null);
	} 

	@Test
	public void searchFilmUsingRatingNullValue() {

		Film f=new Film();

		//f.setRating(1);




		assertEquals(fsi.searchByReleaseYear(f),null);
	} 
	//GetAllFilm
	@Test
	public void getAllFilmSuccesful() {



		ArrayList<Film> af=fsi.getAllFilm();
		String test;
		if(af.size()>0)
		{
			test="Done";
		}
		else
		{
			test="Failed";
		}

		assertEquals(test,"Done");
	} 

	/*@Test
	public void getAllFilmFailed() {

		assertEquals(fsi.getAllFilm(),null);
	} 
*/

	/*@Test
	public void updateFilmSuccesfu() {

		Film f=new Film();
		ArrayList<Actor> aa=new ArrayList<Actor>();
		ArrayList<Category> ac=new ArrayList<Category>();
		Language l=new Language();
		l.setLamguageId(1);

		f.setDescription("Romance");

		f.setTittle("Dilwale11112223");

		f.setLength(156);

		f.setRating(5);

		f.setLanguage(l);

		f.setRelease_year(2016);

		assertEquals(fsi.modifyFilm("Dilwale11112223",2016, f),"Updation Done In The Table");
	} */


	@Test
	public void updateFilmNullValue() {

		Film f=new Film();
	
		

		assertEquals(fsi.modifyFilm("Dilwale", 2006, f),"Do Not Provide Any Null Values");
	} 


	@Test
	public void updateFilmNullValueInTitle() {

		Film f=new Film();
		
		/*Language l=new Language();
			l.setLamguageId(1);

			f.setDescription("Romance");

			f.setTittle("Dilwale");

			f.setLength(156);

			f.setRating(5);

			f.setLanguage(l);

			f.setRelease_year(2006);*/

		assertEquals(fsi.modifyFilm(null, 2016, f),"Null Value In Title Field");
	} 

	//Remove Film
/*
	@Test
	public void removeFilmDone() {

		Film f=new Film();
		ArrayList<Actor> aa=new ArrayList<Actor>();
		ArrayList<Category> ac=new ArrayList<Category>();
		f.setTittle("Drisham1");
		f.setRelease_year(2016);
		assertEquals(fsi.removeFilm(f),"Done");
	} 
*/

	@Test
	public void removeFilmFailed() {

		Film f=new Film();
		
		f.setTittle("Pikuuuu");
		f.setRelease_year(2015);

		assertEquals(fsi.removeFilm(f),"Failed");


	}



	@Test
	public void removeFilmNullValuesInMandatoryField() {

		Film f=new Film();
		assertEquals(fsi.removeFilm(f),"Null values In Mandatory Fields");


	} 

	//Search By Language_Name
	@Test
	public void searchByLanguageSuccesful() {

		ArrayList<Film> al=fsi.searchBylanguage("Hindi");
		String test;

		if(al.size()>0)
		{
			test="Done";
		}
		else
		{
			test="Failed";
		}

		assertEquals(test,"Done");

		//assertEquals(al.size(),8);


	}

	@Test
	public void searchByLanguageNullValue() {

		// ArrayList<Film> al=fsi.searchBylanguage("Hindi");

		assertEquals(fsi.searchBylanguage(null),null);


	}

	@Test
	public void searchByLanguageFailed() {

		// ArrayList<Film> al=fsi.searchBylanguage("Hindi");

		assertEquals(fsi.searchBylanguage("Marathi1"),null);


	}
	
	@Test
	public void searchByActorSuccesful() throws ParseException {

		// ArrayList<Film> al=fsi.searchBylanguage("Hindi");
		
		Actor a=new Actor();
        a.setFirstName("Salman");
        a.setLastName("Khan");
        
        String udob1 = "1993-02-02";
		java.util.Date oldDob = formatter.parse(udob1);
		//java.util.Date date1 = formatter.parse(udob1);
		a.setDob(oldDob);
		
		
		String demo;
		
		if(fsi.searchByActorFilm(a).size()>0)
		{
			demo="Done";
		}
		else
		{
			demo="Failed";
		}
		

		assertEquals(demo,"Done");


	}
	
	
	@Test
	public void searchByActorFailed() throws ParseException {

		// ArrayList<Film> al=fsi.searchBylanguage("Hindi");
		
		Actor a=new Actor();
        a.setFirstName("Salman");
        a.setLastName("Khannnn");
        
        String udob1 = "1993-01-01";
		java.util.Date oldDob = formatter.parse(udob1);
		//java.util.Date date1 = formatter.parse(udob1);
		a.setDob(oldDob);
		assertEquals(fsi.searchByActorFilm(a),null);


	}
	
	@Test
	public void searchByActorNullValueInActorFields()
	{
		Actor a=new Actor();
		assertEquals(fsi.searchByActorFilm(a),null);
	}
	
	
	//Search By Category
	
	@Test
	public void searchByCategoryFailed()
	{
		Category c=new Category();
		c.setName("UAA");
		assertEquals(fsi.searchFilmByCategory(c),null);
	}
	
	
	@Test
	public void searchByCategorySuccessful()
	{
		Category c=new Category();
		c.setName("Action");

		String demo;
		
		if(fsi.searchFilmByCategory(c).size()>0)
		{
			demo="Done";
		}
		else
		{
			demo="Failed";
		}
		

		assertEquals(demo,"Done");
	}
	

	@Test
	public void searchByCategoryNullValueInCategorFields()
	{
		Category c=new Category();
		assertEquals(fsi.searchFilmByCategory(c),null);
	}
	
	
	

}
