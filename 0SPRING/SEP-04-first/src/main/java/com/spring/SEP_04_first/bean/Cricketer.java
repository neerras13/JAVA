package com.spring.SEP_04_first.bean;

public class Cricketer {
	private int number;
	private String name;
	private String skill;
	private int wins;
	public Cricketer(int number, String name, String skill, int wins) {
		super();
		this.number = number;
		this.name = name;
		this.skill = skill;
		this.wins = wins;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	@Override
	public String toString() {
		return "Cricketer [number=" + number + ", name=" + name + ", skill=" + skill + ", wins=" + wins + "]";
	}
	

}
