package lab16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Validator {
	static Scanner scnr = new Scanner(System.in);

	public static int menuNumValidation(int playerChoice) {
		Scanner scnr = new Scanner(System.in);

		while ((playerChoice != 1) && (playerChoice != 2) && (playerChoice != 3)) {
			System.out.print("Invalid entry. Please enter 1, 2, or 3: ");
			playerChoice = scnr.nextInt();
			System.out.println();
		}
		return playerChoice;
	}

	public static boolean dublicateCountry(String userCountry) {
		boolean isDuplicate = false;// if it is a duplicate, return false
		String[] countries;
		try {
			countries = Files.readAllLines(new File("countries.txt").toPath()).toArray(new String[0]);
			for (String country1 : countries) {
				if (country1.equalsIgnoreCase(userCountry)) {
					isDuplicate = true;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();//
		}
		return isDuplicate;
	}

	public static boolean dublicatePopulation(String populationNum) {
		boolean isDuplicate = false;// if it is a duplicate, return false
		String[] populations;
		try {
			populations = Files.readAllLines(new File("populations.txt").toPath()).toArray(new String[0]);
			for (String population1 : populations) {
				if (population1.equalsIgnoreCase(populationNum)) {
					isDuplicate = true;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();//
		}
		return isDuplicate;

	}

	

}
