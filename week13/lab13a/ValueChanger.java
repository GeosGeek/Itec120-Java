/**
 * ValueChanger.java - changes some values, but not all of them!
 *
 * @author Matt Labarge
 * @version 11/29/2015
 */

public class ValueChanger {

	// ----------- ints ------------------------------------------------------------
	public void changeWrappedInt(WrappedInt theInt, int newValue) {
		theInt.setInt(newValue);
	}

	public void changeWrappedInt(int[] theInt, int newValue) {
		if (theInt.length > 0) {
			theInt[0] = newValue;
		}
	}

	public void changeRawInt(int theInt, int newValue) {
		theInt = newValue;
	}

	// --------- doubles -----------------------------------------------------------
	public void changeWrappedDouble(WrappedDouble theDouble, double newValue) {
		theDouble.setDouble(newValue);
	}

	public void changeWrappedDouble(double[] theDouble, double newValue) {
		if (theDouble.length > 0) {
			theDouble[0] = newValue;
		}
	}

	public void changeRawDouble(double theDouble, double newValue) {
		theDouble = newValue;
	}

	// --------- Strings -----------------------------------------------------------
	public void changeWrappedString(WrappedString theString, String newValue) {
		theString.setString(newValue);
	}

	public void changeWrappedString(String[] theString, String newValue) {
		if (theString.length > 0) {
			theString[0] = newValue;
		}
	}

	public void changeRawString(String theString, String newValue) {
		theString = newValue;
	}

}