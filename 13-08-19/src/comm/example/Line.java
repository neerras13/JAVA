package comm.example;

public class Line extends Model {

	private int startPoint, endPoint;
	
	public Line(int startPoint, int endPoint)
	{
		super();
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	
	public int calculateLength() {
		return endPoint - startPoint; 
	}
	
	@Override
	public boolean isGreater(Object obj1, Object obj2) {
		
		Line l1 = (Line)obj1;
		Line l2 = (Line)obj2;
		
		return l1.calculateLength() > l2.calculateLength();
	}

	@Override
	public boolean isLesser(Object obj1) {
		Line l1 = (Line)obj1;
		System.out.println(this.calculateLength());
		return l1.calculateLength() < this.calculateLength();  //this takes properties of calling object
	}

	@Override
	public boolean isEqual(Object obj1, Object obj2) {
		return false;
	}
	

}
