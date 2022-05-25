import java.util.Scanner;

public class Stack {
	private int pointer = -1;
	private String[] mem = new String[493879289];
	public Stack() {
	}

	public void push(String val) {
		pointer++;
		mem[pointer] = val;
	}

	public void pop() {
		if (pointer < 0) {
			return;
		}
		mem[pointer] = new String();
		this.pointer--;
	}

	public String getTop() {
		return mem[getPointer()];
	}

	public int getPointer() {
		return this.pointer;
	}

	public String[] getMem() {
		return this.mem;
	}

	public static void main(String[] args) {
		// int count = 0;
		// while (true) {
		// 	try {
		// 		String[] mem2 = new String[493879290-count];
		// 		System.out.println(493879290-count);
		// 		return;
		// 	}
		// 	catch (OutOfMemoryError e) {
		// 		count++;
		// 	}
		// }
		Scanner scanner = new Scanner(System.in);
		String input;
		Stack stack = new Stack();
		while (true) {
			input = scanner.nextLine();
			switch (input) {
				case "print":
					for (int i = stack.pointer; i >= 0; i--) {
						if (i == -1) {
							break;
						}
						String element = stack.getMem()[i];
						for (int j = 0; j < 30; j++) {System.out.print("-");}
						System.out.println();
						String middle = "| ";
						for (int j = 0; j < (26-element.length())/2; j++) {middle += " ";}
						middle += stack.getMem()[i];
						for (int j = 0; j < (26-element.length())/2; j++) {middle += " ";}
						if (element.length() %2 != 0) {middle += " ";}
						middle += " |";
						System.out.println(middle);
					}
					for (int j = 0; j < 30; j++) {System.out.print("-");}
					System.out.println();
					break;
				case "pop":
					stack.pop();
					break;
				case "push":
					input = scanner.nextLine();
					while (input.length() > 26) {
						input = scanner.nextLine();
					}
					stack.push(input);
					break;
				case "getTop":
					System.out.println(stack.getTop());
					break;
				default:
					System.out.println("Invalid!");
			}
		}
	}
}