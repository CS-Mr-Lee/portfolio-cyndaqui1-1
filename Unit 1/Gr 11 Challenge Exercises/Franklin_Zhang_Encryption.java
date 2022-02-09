/**
 * Name: Franklin Zhang
 * Date: 20222-02-08
 * Description: Program to encrypt user input with swapping first and last characters of words and operating ROT-2 on the characters in the middle
 */

import java.util.*; //imports all modules from library in java

public class Franklin_Zhang_Encryption {
	static Scanner scanner = new Scanner(System.in); //declare a scanner object
	public static String validate() { // used to gather input and filter
		String input = scanner.nextLine(); // reads user input
		while (input.length() < 2) { // executes loop as long as input is no greater than 2 characters
			input = scanner.nextLine(); // reads user input
		}
		return input; // returns accepted input as string
	}
	public static void main(String[] arg) {
		System.out.print("Hello, encrypt your string here: "); // prompt input from user
		String raw = validate(); // calls validate module for input
		String[] segmented = raw.split(" "); // splits input based on spaces existing
		String encrypted = ""; // empty result, eventually append characters to make a full output
		for (int i = 0, j = 0; i < segmented.length;i++) { // loops through array
			if (segmented[i].length() == 0) { // if whitespaces are present in the input, the split would've added an empty string to the array, and which I will utilize to refill the whitespace in the encrypted text
				encrypted += " "; // add a space
				continue; // continue next iteration
			}
			encrypted += segmented[i].charAt(segmented[i].length()-1); // appends last character of segmented[i] to encrypted
			for (int x = 1; x < segmented[i].length()-1;x++) { // loops through segmented[i] characters
				encrypted += (char) (segmented[i].charAt(x) + 2); // executes rot2 on character and appends to string
				j++;
			}
			encrypted += segmented[i].charAt(0); // appends first character of segmented[i]
			encrypted += " ";// adds in space which were split from earlier
		}
		encrypted = encrypted.substring(0,encrypted.length()-1); // there will always be a whitespace at the end due to how the loop worked, so im shaving it
		System.out.println(encrypted); // outputs encrypted string
	}
}