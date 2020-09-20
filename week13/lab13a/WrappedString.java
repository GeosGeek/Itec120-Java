/**
 * WrappedString.java - convenience class.
 *
 * @author Matt Labarge
 * @version 11/29/2015
 */

public class WrappedString {

	private String internalString;

	public WrappedString(String stringValue) {
		internalString = stringValue;
	}

	public String getString() {
		return internalString;
	}

	public void setString(String stringValue) {
		internalString = stringValue;
	}

}