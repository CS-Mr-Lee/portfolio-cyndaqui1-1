/**
 * Name: Franklin Zhang
 * Date: 20222-02-08
 * Description: A program to recieve data on two grocery items and lists their name and price
 */

import java.util.Scanner;

public class Franklin_Zhang_GroceriesShopping {

	static Scanner in = new Scanner(System.in); // create new scanner object

	/** 
	 * This function is for validating user input via datatypes
	 * @param msg fail message to print if input does not match criteria
	 * @return - returns accepted double input
	 */
	public static double validate(String msg) {
		while (true) {
			String input = in.nextLine();
			try { // tries to parse to double, fails if not double/int
				if (input > 100) {
					int x = 0/0;
				}
				return(Double.parseDouble(input));
			}
			catch (Exception e) { // continues to loop after printing error given message
				System.out.println(msg);
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Welcome to K-mart, please check out item 1: "); // prompts user to input name for item 1
		String item1 = in.nextLine(); 
		while (item1.length() > 20) {// while the item1 has more than 20 characters, keep prompting user to input different value
			System.out.print("Welcome to K-mart, please check out item 1: ");
			item1 = in.nextLine();
		}
		System.out.print("What is the cost of " + item1 + "?"); // prompts user for price of item 1
		double price1 = validate("We do not accept that currency");
		System.out.print("please check out item 2: "); // prompts user to inp'ut name for item 2
		String item2 = in.nextLine();
		while (item2.length() > 20) { // while the item2 has more than 20 characters, keep prompting user to input different value
			System.out.print("please check out item 2: ");
			item2 = in.nextLine();
		}
		System.out.print("What is the cost of " + item2 + "?"); // prompts user to input price for item 2
		double price2 = validate("we do not accept that currency");

		System.out.println("---------------------");
		System.out.printf("%-16s %.2f\n",item1,price1); // print item name and price of item 1
		System.out.printf("%-16s %.2f\n",item2,price2); // print item name and price of item 2
		System.out.println("---------------------");
	}
}