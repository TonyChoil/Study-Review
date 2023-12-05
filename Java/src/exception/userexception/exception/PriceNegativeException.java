package exception.userexception.exception;

public class PriceNegativeException extends NegativeException {
	
	public PriceNegativeException() {}

	public PriceNegativeException(String message) {
		
		super(message);
	}
	
}
