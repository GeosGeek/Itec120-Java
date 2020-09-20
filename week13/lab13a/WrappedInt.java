/**
 * WrappedInt.java - convenience class.
 *
 * @author Matt Labarge
 * @version 11/29/2015
 */

public class WrappedInt {

	private int internalInt;

	public WrappedInt(int intValue) {
		internalInt = intValue;
	}

	public int getInt() {
		return internalInt;
	}

	public void setInt(int intValue) {
		internalInt = intValue;
	}

}