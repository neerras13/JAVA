package comm.example;

public class CustomException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;    //default
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public CustomException() {
		super();
	}
	
	public CustomException(String message) {
		super();
		this.message = message;
	}

}