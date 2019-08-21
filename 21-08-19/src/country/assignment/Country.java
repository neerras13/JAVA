package country.assignment;

import java.util.List;

public class Country {

	private String cname;
	private String sname;
	public Country(String cname) {
		super();
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}
	public String getSname() {
		return sname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
    public void addState() {
    	
    }
    public List<Country> getStateList(){
		return null;
    	
    }
}
