/**
 * WrappedDouble.java - convenience class.
 *
 * @author Matt Labarge
 * @version 11/29/2015
 */

public class WrappedDouble {

	private double internalDouble;

	public WrappedDouble(double doubleValue) {
		internalDouble = doubleValue;
	}

	public double getDouble() {
		return internalDouble;
	}

	public void setDouble(double doubleValue) {
		internalDouble = doubleValue;
	}

}