package com.example.dto.shared;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserDto {
		
		private String fname;
		private String lname;
		private String email;
		private String password;
		private String userid;
		private String bpassword;
		public UserDto(String userid, String bpassword, String fname, String lname, String email, String password) {
			super();
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.password = password;
			this.userid=userid;
			this.bpassword=bpassword;
		}
		public UserDto() {
			super();
		}
	
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getBpassword() {
			return bpassword;
		}
		public void setBpassword(String bpassword) {
			this.bpassword = bpassword;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}
