package exceptions;

public class ExcessiveFailedLoginException {

	public ExcessiveFailedLoginException() {
		super("Anda telah mencapai jumlah batas login");
	}
	
	public ExcessiveFailedLoginException(String message) {
		super(message);
	}
}
