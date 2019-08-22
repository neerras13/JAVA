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
	public int compareTo(Object ob1) {
		// TODO Auto-generated method stub
		State s=(State)ob1;
		if(this.getName().equals(s.getName()))
			return 0;
		else if(this.getName().compareTo(s.getName())>0)
			return 1;
		else
			return -1;
	}

}
