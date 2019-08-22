package contact.assignment;

public class Contact implements Comparable<Object> {

	private String name;
	private String email;
	private long mobile;
	private String address;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getMobile() {
		return mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Contact(String name, String email, long mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	@Override
	public int compareTo(Object o) {
		Contact c=(Contact)o;
		if(this.getMobile() == c.getMobile())
			return 0;
		else if(this.getMobile() > c.getMobile())
			return -1;
		else
			return 1;
	}
	
	
}
