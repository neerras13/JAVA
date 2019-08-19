package comm.example;

public class Tester {

	public static void main(String[] args) {
		MapDemo map = new MapDemo();
		map.createMap();
		System.out.println(map.getKeys());        //can be set to variable of type Set
		System.out.println(map.getValues());      //return type is collection
		//VectorDemo v = new VectorDemo();
	}
	
}
