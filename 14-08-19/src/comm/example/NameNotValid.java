package comm.example;

public class NameNotValid extends Throwable {
/**
	 * 
	 */
	private static final long serialVersionUID = -4733105742752640236L;
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
 public NameNotValid(String message) {
	 this.message = message;
 }
}
