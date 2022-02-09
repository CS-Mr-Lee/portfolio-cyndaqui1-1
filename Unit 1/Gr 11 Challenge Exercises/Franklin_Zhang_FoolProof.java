/**
 * Name: Franklin Zhang
 * Date: 20222-02-08
 * Description: Foolproof divide calculator, prompting to receive numerator and denominator and divide them, preventing zero division error by proccing a failure warning. Also quits when prompted "quit", and prevents math errors with words by ensuring the user inputs numbers
 */

import java.util.*;// imports all modules from library util in java
public class Franklin_Zhang_FoolProof {
	static Scanner scanner = new Scanner(System.in);
	public static double validate() { // used to prompt and validate input and return accepted values
		while (true) { // starts an endless loop
			try {
				String input = scanner.nextLine(); // collects user input
				if (input.equals("quit")) { // check if user inputs quit, hence if they want to exit program
					System.exit(0);// exit program
				}
				return Double.parseDouble(input); // returns double casted string, will fail if unable to and succeed if works
			}
			catch (Exception e) { // happens if above instruction fails
				System.out.println("You entered bad data."); // failure warning
				continue; // continues the endless loop till above return instruction works
			}
		}
	}
	public static void main(String[] args) {
		while (true) { // start an endless loop
			System.out.print("Enter the numerator: "); // prompts user to input numerator
			double numerator = validate(); // collects accepted input from validata method
			System.out.print("Enter the divisor: "); // prompts user to input divisor
			double divisor = validate(); // collects accepted input from validate method
			if (divisor == 0) { // checks if divisor is 0
				System.out.println("You can't divide " + numerator + " by 0"); // outputs failure
			}
			else if (numerator == 0) { // checks if numerator is 0
				System.out.println("0 cannot be divided"); // outputs failure
			}
			else {
				System.out.println(numerator + "/" + divisor + " is " + numerator/divisor); // outputs result
			}
		}
	}
}