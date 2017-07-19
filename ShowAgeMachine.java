package variables;

import java.util.Calendar;
import java.util.Scanner;

public class ShowAgeMachine {

	public static void main(String[] args) {
		//If you enter the birth year, make it automatically calculate the age.
		//Enter the year of birth.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the birth year.");
		int birth = keyboard.nextInt();
		//Age is current year - birth year + 1
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year - birth + 1;
		System.out.println("Your age is " + age);
		keyboard.close();

	}

}
