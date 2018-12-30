package ua.lviv.lgs.task2;

/**
 * @since java 1.8
 * @author Mykola Pavliv
 *  @version 1.0
 */

public class WrongInputConsoleParametersException extends Exception {
	private String message;

	/** 
	 * @param String message 
	 * @return null
	 */
	
	/**Initializes a new object */
	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
	}

}
