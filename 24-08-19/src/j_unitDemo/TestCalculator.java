package j_unitDemo;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;

public class TestCalculator extends TestCase {
	int a;
    int b;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		a=10;
		b=5;
		System.out.println(a+""+b);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		a=0;
		b=0;
		System.out.println(a+""+b);
		
	}

	@Test
	public void testAdd() {
        
		assertEquals(30,new Calculator(20,10).add());
	}

	@Test
	public void testSub() {
        boolean check = a>b;
		//check if a>b for testcase????
		assertEquals(true,check);
		System.out.println(new Calculator(a,b).sub());
	}
	
	

	public static void main(String args[]) {
		TestRunner.run(TestCalculator.class);
	}
	

}
