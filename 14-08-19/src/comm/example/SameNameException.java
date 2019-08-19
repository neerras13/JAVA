package comm.example;

public class SameNameException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6598311367461408450L;
    private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public SameNameException(String message) {
		this.message = message;
	}
}
