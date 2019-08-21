package country.assignment;

public class State extends Country 
implements Comparable<Object> {
	private String name;

	public State(String name) {
		super(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
