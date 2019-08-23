package country.assignment;

import java.util.Set;
import java.util.TreeSet;

public class Country {
	
	private String name;
	private Set<State> stateList = new TreeSet<State>();

	
	public Country(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<State> getStateList() {
		return stateList;
	}
	public void setStateList(State s) {
		stateList.add(s);
	}
	public int compareTo(Object o) {
		Country s = (Country) o;
		if (this.getName() == s.getName()) {
			return 0;
		} else if (this.getName().compareToIgnoreCase(s.getName()) > 0 ) {
			return 1;
		} else {
			return -1;
		}
	}}
