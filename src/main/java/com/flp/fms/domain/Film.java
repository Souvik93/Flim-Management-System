package com.flp.fms.domain;

import java.util.ArrayList;
import java.util.Date;

public class Film {
	private long filmId;
	private String tittle;
	private String description;
	private int length;
	private Language language;
	//private int rating;
	
	private Rating rating;
	private ArrayList<Actor> al=new ArrayList<Actor>();
	private ArrayList<Category> ac=new ArrayList<Category>();
	private Date createDate;
	private Date deleteDate;
	private int release_year;
	
	
	
	
	public Film() {
		super();
	}
	public Film(int release_year) {
		super();
		this.release_year = release_year;
	}
	public long getFilmId() {
		return filmId;
	}
	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public ArrayList<Actor> getAl() {
		return al;
	}
	public void setAl(ArrayList<Actor> al) {
		this.al = al;
	}
	public ArrayList<Category> getAc() {
		return ac;
	}
	public void setAc(ArrayList<Category> ac) {
		this.ac = ac;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	@Override
	public String toString() {
		return "Film [tittle=" + tittle + ", description=" + description
				+ ", length=" + length + ", language=" + language + ", rating="
				+ rating + ", al=" + al + ", ac=" + ac + ", release_year="
				+ release_year + "]";
	}
	
	
	
	
}
