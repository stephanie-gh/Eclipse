package exceptions;

public class InvalidPropertyException {

	public InvalidPropertyException() {
		super("Input data tidak valid");
	}
	
	public InvalidPropertyException(String message) {
		super(message);
	}
}
