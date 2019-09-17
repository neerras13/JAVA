package com.example.league.shared;

public class LeagueDto {

	private String name;
	private String year;
	private String season;
	
	
	public LeagueDto() {
		super();
	}

	public LeagueDto(String name, String year, String season) {
		super();
		this.name = name;
		this.year = year;
		this.season = season;
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
