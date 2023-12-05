package exception.userexception.exception;

public class MoneyNegativeException extends NegativeException {

	public MoneyNegativeException() {}
	
	public MoneyNegativeException(String message) {
		
		super(message);
	}
}
