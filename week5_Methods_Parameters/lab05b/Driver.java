/***********************
 *
 *   Driver - Test driver for methods in the Service class
 *
 *   Author:   Matt Crichton
 *   Date:     9/26/18
 *
 ***********************/
public class Driver {

    // A driver class contains the main method
    public static void main(String[] args) {

        // To call methods in the Service class, a Service obj must be created.
        // For now, put Service.java and Driver.java in the same directory.

        Service obj = new Service();

        // Calling mult with two ints
        System.out.println();
        System.out.println("mult(5,3)\t--> " + obj.mult(5,3));
        System.out.println("mult(-3,2)\t--> " + obj.mult(-3,2));
        System.out.println("mult(0,4)\t--> " + obj.mult(0,4));
        System.out.println("mult(0,0)\t--> " + obj.mult(0,0));
        System.out.println("mult(7,9)\t--> " + obj.mult(7,9));
        System.out.println();

        // Calling mult with a String and an int
        System.out.println();
        System.out.println("mult(\"Hey\",3)\t\t--> " + obj.mult("Hey",3));
        System.out.println("mult(\"RU\",1)\t\t--> " + obj.mult("RU",1));
        System.out.println("mult(\"\",5)\t\t--> " + obj.mult("",5));
        System.out.println("mult(\"anything\",5)\t--> " + obj.mult("anything",5));
        System.out.println("mult(\"*!\",7)\t\t--> " + obj.mult("*!",7));

        // Calling mult with an int and a String
        System.out.println();
		System.out.println("mult(3,\"Hi\" ----> " + obj.mult(3,"Hi"));

        System.out.println();
		
		// Calling mult method with 2 ints and returns a double
		System.out.println();
		System.out.println("mult(3,6) ---->" + obj.mult(3,6));
		
		// Calling mult method isLowerCase which returns a boolean
		System.out.println();
		System.out.println("isLowerCase(\"HELLO\") ---->" + obj.isLowerCase("HELLO"));
		System.out.println("isLowerCase(\"HeLLo\") ---->" + obj.isLowerCase("HeLLo"));
		
		// Calling the area method
		System.out.println();
		System.out.println("area(5,4) ---->" + obj.area(5,4));
    } //main
}