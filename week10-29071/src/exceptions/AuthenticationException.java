package exceptions;

public class AuthenticationException {

	public AuthenticationException() {
		super("Anda telah mencapai jumlah batas login");
	}
	
	public AuthenticationException(String message) {
		super(message);
	}
}
