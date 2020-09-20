/**
 * ValueChangerTestDrv.java - exercises all the methods in ValueChanger.
 *
 * @author Matt Labarge
 * @version 11/29/2015
 */

public class ValueChangerTestDrv {

public static void main(String[] args) {

System.out.println("");

ValueChanger changer = new ValueChanger();

// ---------- ints -------------------------------------------------------------
WrappedInt intInsideAnObject = new WrappedInt(0);
int[] intInsideAnArray = new int[] { 0 };
int rawInt = 0;

changer.changeWrappedInt(intInsideAnObject, 7);
changer.changeWrappedInt(intInsideAnArray, 7);
changer.changeRawInt(rawInt, 7);

System.out.println("   intInsideAnObject: " + intInsideAnObject.getInt());
System.out.println("    intInsideAnArray: " + intInsideAnArray[0]);
System.out.println("              rawInt: " + rawInt);
System.out.println("");

// ---------- doubles ----------------------------------------------------------
WrappedDouble doubleInsideAnObject = new WrappedDouble(0.0);
double[] doubleInsideAnArray = new double[] { 0.0 };
double rawDouble = 0.0;

changer.changeWrappedDouble(doubleInsideAnObject, 7.0);
changer.changeWrappedDouble(doubleInsideAnArray, 7.0);
changer.changeRawDouble(rawDouble, 7.0);

System.out.println("doubleInsideAnObject: " + doubleInsideAnObject.getDouble());
System.out.println(" doubleInsideAnArray: " + doubleInsideAnArray[0]);
System.out.println("           rawDouble: " + rawDouble);
System.out.println("");

// ---------- string -----------------------------------------------------------
WrappedString stringInsideAnObject = new WrappedString("zero");
String[] stringInsideAnArray = new String[] { "zero" };
String rawString = "zero";

changer.changeWrappedString(stringInsideAnObject, "seven");
changer.changeWrappedString(stringInsideAnArray, "seven");
changer.changeRawString(rawString, "seven");

System.out.println("stringInsideAnObject: " + stringInsideAnObject.getString());
System.out.println(" stringInsideAnArray: " + stringInsideAnArray[0]);
System.out.println("           rawString: " + rawString);
System.out.println("");
}
}