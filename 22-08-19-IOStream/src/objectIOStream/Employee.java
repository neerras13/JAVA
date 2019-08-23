package objectIOStream;

import java.io.Serializable;

public class Employee implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 5840793374097125109L;
private String id;
private String name;
private int salary;
private transient String city;
public Employee(String id, String name, int salary, String city) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.city = city;
}
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public int getSalary() {
	return salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
}
public String getCity() {
	return city;
}
public void setId(String id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void setCity(String city) {
	this.city = city;
}

}
