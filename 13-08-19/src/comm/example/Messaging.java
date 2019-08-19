package comm.example;

public class Messaging {
	
	private String message= "toString method";
	private static Messaging messaging;

	private Messaging() {
		
	}

	private Messaging(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Messaging [message=" + message + "]";
	}
	
	public static Messaging createMessagingObject() {
	if(messaging == null) {
		messaging = new Messaging();  //single instantiation in the singleton class inside a function
	}
      System.out.println("This is without name");

	return messaging;
	}
    
	public static Messaging createMessagingObject(String name) {
		if(messaging == null) {
			messaging = new Messaging(name);   //single instantiation in the singleton class inside a function
		}
		System.out.println("This is "+name);
		return messaging;
		}
	    
}
