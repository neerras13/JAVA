package j_unitDemo;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestCalculator extends TestCase{
	int a;
    int b;
    
	
	public TestCalculator(String name) {
		super(name);
	}

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
        System.out.println("add test");
		assertEquals(30,new Calculator(20,10).add());
	}

	@Test
	public void testSub() {
		System.out.println("sub test");
        boolean check = a>b;
		assertEquals(true,check);
		System.out.println(new Calculator(a,b).sub());
	}
	
	public static TestSuite createTestSuite() {
		TestSuite testSuite = new TestSuite("AllTest");
		testSuite.addTest(new TestCalculator("testAdd"));
		testSuite.addTest(new TestCalculator("testSub"));
		return testSuite;
	}
	

	public static void main(String args[]) {
		TestRunner.run(TestCalculator.class);
		junit.textui.TestRunner.run(createTestSuite());
	}
	

}
