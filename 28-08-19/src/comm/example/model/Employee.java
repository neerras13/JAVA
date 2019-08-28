package comm.example.model;

public class Employee {
private String name;
private String password;
private String email;
private String country;
private int id;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getPassword() {
	return password;
}
public String getEmail() {
	return email;
}
public String getCountry() {
	return country;
}
public void setName(String name) {
	this.name = name;
}
public void setPassword(String password) {
	this.password = password;
}
public void setEmail(String email) {
	this.email = email;
}
public void setCountry(String country) {
	this.country = country;
}
public Employee() {
	super();
}
public Employee(int id,String name, String password, String email, String country) {
	super();
	this.id =id;
	this.name = name;
	this.password = password;
	this.email = email;
	this.country = country;
}
}
