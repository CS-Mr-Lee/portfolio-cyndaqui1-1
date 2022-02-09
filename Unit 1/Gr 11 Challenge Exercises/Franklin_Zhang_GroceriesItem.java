/**
 * Name: Franklin Zhang
 * Date: 20222-02-08
 * Description: A grocery list calculator. Receives a quantity of items on list, and for each, asks the price, quantity and name, and will be output on a formatted receipt with the subtotal and total with tax
 */

import java.util.Scanner;

public class Franklin_Zhang_GroceriesShopping {

	static Scanner in = new Scanner(System.in); // create new scanner object

	//This function is for validating user input via datatypes
	public static double validation(String msg) {
		while (true) {
			String input = in.nextLine();
			try { // tries to parse to double, fails if not double/int
				return(Double.parseDouble(input));
			}
			catch (Exception e) { // continues to loop after printing error given message
				System.out.println(msg);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("|| $$$  ========== \"Frankln's Grocery\" ==========  $$$ ||");
		System.out.println("---------------------------------------------------------");
		System.out.println("How much bread do u require peasant?");
		int qty = (int) validation("Ha, I speak not of ur lowly language u lot of ungrateful swines"); // length of products bought on receipt
		String[] groceries= new String[qty];// name of products list
		int[] item_qty = new int[qty]; // quantity of each product bought
		double[] prices = new double[qty]; // prices of each product bought
		double subtotal=0; // subtotal of all products*quantity
		for (int i = 0; i < qty; i++) { // gets information on each product based on length
			System.out.print("What may your lowly presence seek in this esteemed refuge: ");
			groceries[i] = in.nextLine(); //fills groceries name list
			System.out.printf("Fool, state the price of %s: $", groceries[i]);
			double tmp = validation("Ha, forsake ur stupidity and yield shan't u leave empty handed");
			while (tmp < 0) { // ensures the user inputs correct data
				System.out.println("Feh, know your place! I am but so pitiful to accept your mud-stained coins");
				tmp=validation("Ha, forsake ur stupidity and yield shan't u leave empty handed");
			}
			prices[i] = tmp; // fills in prices of products
			System.out.printf("How many a %s can your pathetic wallet accomodate: ", groceries[i]);
			tmp = (int) validation("Oh, would you be so bold, it tickles my bones!");
			while (tmp<0) {
				System.out.println("Sometimes it's a wonder, pondering on your disability to function");
				tmp = (int) validation("Oh, would you be so bold, it tickles my bones!");
			}
			item_qty[i] = (int) tmp; //quantity of current product
			subtotal+=item_qty[i]*prices[i]; // increments given price*quantity to subtotal
			System.out.println();

		}
		System.out.println("Hmph, grace yourself with the presence of thy paper, of which possesses a hefty greater value than thee");
		System.out.println();
		System.out.println("Item      |  Price  | Quant. | Total Price");
		System.out.println("------------------------------------------");
		for (int i = 0;i < qty;i++) { // prints all information in list order by looping
			System.out.printf("%-10s| $ %6.2f|%8d| $ %9.2f\n", groceries[i], prices[i],item_qty[i], prices[i]*item_qty[i]);
		}
		System.out.println("------------------------------------------");
		System.out.printf("%20s", " ");
		System.out.printf("Subtotal : $%10.2f\n",subtotal);
		System.out.printf("%25s", " ");
		System.out.printf("Tax : $%10.2f\n", subtotal*0.13);
		System.out.printf("%23s", " ");
		double total = subtotal*1.13;
		System.out.printf("Total : $%10.2f\n", total);

		System.out.println();

		System.out.printf("Give me $%d you peasant\n", Math.round(total));
		System.out.printf("Hmph, I'm in a good mood, give me $%.1f instead. Be grateful, swine\n", Math.round(total*2)/2.0);
	}
}