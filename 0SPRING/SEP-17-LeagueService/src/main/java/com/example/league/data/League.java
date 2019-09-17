package com.example.league.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leagues")
public class League {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer league_id;
	private String name;
	private String year;
	private String season;
	public League() {
		super();
	}
	public League(String name, String year, String season) {
		super();
		this.name = name;
		this.year = year;
		this.season = season;
	}
	public Integer getLeague_id() {
		return league_id;
	}
	public void setLeague_id(Integer league_id) {
		this.league_id = league_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	
	

}
