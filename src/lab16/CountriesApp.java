package lab16;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		String name;

		boolean userContinue = true;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the List of Country Program");
		do {
			System.out.print(
					"Option 1: See the list of countries.\nOption 2: Add a country" + "to the list.\nOption 3: Exit\n");

			System.out.print("What would you like to do? 1,2, or 3: ");
			int userChoice = scnr.nextInt();

			userChoice = Validator.menuNumValidation(userChoice);// Number validation for user input off menu
			System.out.println();

			switch (userChoice) {// Using a switch case for easier reading
			case 1:
				CountriesTextFile.readFromFile();
				System.out.println();
				break;
			case 2:
				CountriesTextFile.writeToFile();
				System.out.println("This country has been added to the list.");
				System.out.println();
				break;
			case 3:
				System.out.println("Goodbye");
				userContinue = false;
				break;
			}
		} while (userContinue);
	}

}
