package lab16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountriesTextFile {//Make sure to close scanners

	public static void readFromFile() {
		try {
			File myFile = new File("countries.txt");
			FileReader reader = new FileReader(myFile);
			BufferedReader buff = new BufferedReader(reader);
			String line = null;
			while ((line = buff.readLine()) != null) {
				System.out.println(line);
			}
			buff.close();// closing so it does'nt overflow file handling
		} catch (Exception e) {
			e.printStackTrace();// using stack trace to print out the entire stack trace, for finding where the
								// actual problem occurred.
		}
	}

	public static void writeToFile() {
		// write to file
		try {
			Scanner scnr = new Scanner(System.in);
			FileWriter writer = new FileWriter("countries.txt", true);
			System.out.println("Add a country: ");
			String userCountry = scnr.nextLine();
			System.out.println("Add the population of the country: ");
			int populationNum = scnr.nextInt();
			if (!Validator.dublicateCountry(userCountry)) {// checks if country's been added to the list already
				writer.write(userCountry + "\n");
				writer.close();
			} else {
				System.out.println("Country already in list.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
