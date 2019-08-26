//Junit
package j_unitDemo;

public class Calculator {
	
	private int a;
	private int b;
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Calculator() {
		super();
	}
	
	public int add() {
		return a+b;
	}
	public int sub() {
		return a-b;
	}
	

}
