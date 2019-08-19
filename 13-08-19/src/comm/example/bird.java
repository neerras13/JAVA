package comm.example;

public class bird extends flier {

	//methods inherited from abstract class are mandaory in child class
	
	@Override
	public void takeOff() {
		System.out.println("Bird is taking off");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird is flying");

		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Bird is landing");

	}

}
