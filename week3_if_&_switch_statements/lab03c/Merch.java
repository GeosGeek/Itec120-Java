import java.util.Scanner;
public class Merch
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// The following constants depict the price of the listed items. 
		final int SHORT_SLEEVE = 15;
		final int TANK = 12;
		final int LONG_SLEEVE = 20;
		final int HOODIE = 22;
		final int CHILDRENS_SOCKS = 6;
		final int ADULT_GYM_WHITE = 8;
		final int ANNIVERSARY_SOCKS = 10;
		// The following is an incrementing total cost of the order
		int total = 0;
		// The following variables are bieng intialized for use outside 
		//of the if statements they are used in.
		String size = "";
		String shirtStyle = "";
		String color = "";
		String socks = "";
		String sockType = "";
		System.out.println("Would you like a Sockrockers T-shirt today? (Y or N) ");
		String shirt = scan.nextLine();
		if (shirt.equalsIgnoreCase("Y"))
		{
			System.out.println("Small, Medium, or Large? (S, M, or L)");
			size = scan.nextLine();
			switch(size)
			{
				case "s":
					size = "Small";
					break;
				case "m":
					size = "Medium";
					break;
				case "l":
					size = "Large";
					break;
				default :
					System.out.println("Please enter valid lower case letters.");
			}
			System.out.println("There are 4 styles: " + "\n\t T : Tanks"
							+ "\n\t S : Short sleeve" + "\n\t L : Long sleeve"
							+ "\n\t H : Hoodie" + "\n Which style would you like? ");
			shirtStyle = scan.nextLine();
			switch(shirtStyle)
			{
				case "t":
					shirtStyle = "Tank";
					total += 12;
					break;
				case "s":
					shirtStyle = "Short-sleeve";
					total += 15;
					break;
				case "l":
					shirtStyle = "Long-sleeve";
					total += 20;
					break;
				case "h":
					shirtStyle = "Hoodie";
					total += 22;
					break;
				default: 
					System.out.println("Please enter a valid lower case letter");
			}
			System.out.println("There are 3 colors: " + "\n\t W : White" 
							+ "\n\t B : Black" + "\n\t O : Orange"
							+ "\n Which color would you like?");
			color = scan.nextLine();
			switch(color)
			{
				case "w":
					color = "White";
					break;
				case "b":
					color = "Black";
					break;
				case "o":
					color = "Orange";
					break;
				default: 
					System.out.println("Please enter a valid lower case letter");
			}
		}
		System.out.println("Would you like to purchase Sockrockers socks?"
						+ "(Y or N)");
		socks = scan.nextLine();
		if (socks.equalsIgnoreCase("Y"))
		{
			System.out.println("There are three types of socks: " 
							+ "\n\t C : Children's socks" 
							+ "\n\t W : Adult's white gym socks"
							+ "\n\t O : Adult's 10th anniversary orange socks"
							+ "\n Which kind would you like?");
			sockType = scan.nextLine();
			switch(sockType)
			{
				case "c":
					sockType = "Children's socks";
					total += 6;
					break;
				case "w":
					sockType = "Adult's white gym socks";
					total += 8;
					break;
				case "o":
					sockType = "Adult's 10th anniversary orange socks";
					total += 10;
					break;
				default:
					System.out.println("Please enter a valid lower case letter");
			}
		}	
		System.out.println("Your order includes : \n\n"
						+ sockType + "\n" + size + " " + color + " " + shirtStyle);
		System.out.println("\nTotal cost: $" + total);
	}
}