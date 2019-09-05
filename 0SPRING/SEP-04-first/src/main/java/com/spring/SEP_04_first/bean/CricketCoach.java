package com.spring.SEP_04_first.bean;

public class CricketCoach implements Coach{
	private String name;
	private String nickName;
	BasketballCoach basket;
	
	public CricketCoach() {
		super();
	}
	public CricketCoach(BasketballCoach bc) {
		super();
		this.basket=bc;
	}
public String getWorkout() {
	
	return 	"Run 5k as sprint "+basket.getWorkout();
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNickName() {
	return nickName;
}
public void setNickName(String nickName) {
	this.nickName = nickName;
}
@Override
public String toString() {
	return "CricketCoach [name=" + name + ", nickName=" + nickName + "]";
}

}
