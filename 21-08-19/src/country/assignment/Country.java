package country.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Country {
	
	List<State> stateList=new ArrayList<State>();
	private String cname;
	private String sname;
	private int i =0;
	public Country(String cname) {
		super();
		this.cname = cname;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
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
	
    public void addState(String statename) {
    			stateList.add(new State(statename));
    		}
    		
 
    	
   
    public List<State> getStateList(){
    	ListIterator<State> i = stateList.listIterator();
    	while(i.hasNext()){
    		new State(i.next().toString());
    	}
		return stateList;
    	
    }
}
