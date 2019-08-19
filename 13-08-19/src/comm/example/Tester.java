package comm.example;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*flier fl = new bird();
		fl.takeOff();
        fl = new Superman();
        fl.land();
		Model m =new Line(0,40);
		Model m1 = new Line(0,20);
		
		System.out.println(m1.isLesser(m));*/
		
//		LivingThings l1 = new Dog("jimmy","labrador");
//		l1.walk();
//		Dog d = new Dog("sdf","dfg");
//		d.createLivingThings();
		
		/* Messaging m = Messaging.createMessagingObject();
		Messaging m1=Messaging.createMessagingObject("test");
        String name = m.toString();
        System.out.println(name);
        System.out.println(m == m1);  //similar variable holding class variables 
        */
		
		ArrayDemo a =new ArrayDemo();
		
		char [] alphabets=a.createArray(10);
		System.out.println(alphabets);
		for(char c:alphabets) {
			System.out.println(c);
		}
		

	}

}
