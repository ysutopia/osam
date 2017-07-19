package variables;

import java.util.Scanner;

public class AddTest {

	public static void main(String[] args) {
		//Create a program that adds two integers that you type on the keyboard.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first integer.");
		int first = keyboard.nextInt();
		System.out.println("Please enter the second integer.");
		int second = keyboard.nextInt();
		int result = first + second;
		System.out.println("The result is " + result);
		keyboard.close();
	}

}
