/**
 *
 * @author Matt Crichton
 * @version 9/8/2018
 *
**/
import java.util.Scanner;
public class Museum
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		final int ADULT_COST = 20;
		final int SENIOR_COST = 18;
		final int STUDENT_COST = 14;
		final int CHILD_AGE = 12;
		final int SENIOR_AGE = 65;
		String newMember = "";
		String isStudent = "";
		String enjoy = "Enjoy the Radford museum of Fine Art!";
		System.out.println("Welcome to the Radford museum of Fine Art!");
		
		System.out.println("Are you a member? (Y or N)");
		String member = scan.nextLine();
		if (member.equalsIgnoreCase("Y")){
			System.out.println(enjoy);
		}
		else {
			System.out.println("What is your age?");
			int age = scan.nextInt();
			scan.nextLine();
			if (age <= CHILD_AGE)
				System.out.println("You require no admission fee. " + enjoy);
			if (member.equalsIgnoreCase("N") && age > CHILD_AGE){
				System.out.println("Would you like to become a member? (Y or N)");
				newMember = scan.nextLine();
			}
			if (newMember.equalsIgnoreCase("Y")){
				System.out.println("Are you a student with a valid ID (Y or N)");
				isStudent = scan.nextLine();
				if (isStudent.equalsIgnoreCase("Y")){
					System.out.println("Your membership cost is $40, valid for one year. " + enjoy);
				}
				else 
					System.out.println("Your membership cost is $75, valid for one year. " + enjoy);
			}			
			if (newMember.equalsIgnoreCase("N")){
				// if age is x, your admission cost is this
				if (age > CHILD_AGE && age < SENIOR_AGE && isStudent.equalsIgnoreCase("N"))
				System.out.println("Your admission fee is $20");
				if (age >= SENIOR_AGE && isStudent.equalsIgnoreCase("N")){
					System.out.println("Your admission fee is $18"); 
					System.out.println("Are you a student with a valid ID? (Y or N)");
					isStudent = scan.nextLine();
					if (isStudent.equalsIgnoreCase("Y"))
						System.out.print("Your admission fee is $14");
						//Above, the user is a student paying one day admission
					if (isStudent.equalsIgnoreCase("N") && age > CHILD_AGE && age < SENIOR_AGE)
						System.out.print("Your admission fee is $20");
				}
			}
		}
		}
}
