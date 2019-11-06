package com.class10;

public class CountryArray {

	public static void main(String[] args) {
		String[] country = { "Turkey", "Germany", "USA", "France", "Italy" };

		// String countryCase;

		String capital;
		// for(int i=0; i< country.length; i++)
		for (String countryfor : country) {
			// countryCase = country[i];
			switch (countryfor) {
			case "Turkey":
				capital = "Ankara";
				break;
			case "Germany":
				capital = "Berlin";
				break;
			case "USA":
				capital = "Washington";
				break;
			case "France":
				capital = "Paris";
				break;

			default:
				capital = "Unknown";

				break;
			}

			System.out.println("The capital city of " + countryfor + " is " + capital);
		}

		for (int x = 5; x <= 25; x = x + 5) {

			// Switch on number.

			switch (x) {

			case 5:

				System.out.println("The case 5 is true");

				break;
			case 10:

				System.out.println("The case 10 is true");

				break;
			case 15:

				System.out.println("The case 155 is true");

				break;
			case 20:

				System.out.println("The case 20 is true");

				break;
			case 25:

				System.out.println("The case 25 is true");

				break;
			default:
				System.out.println("");
				break;
			}

		}
	}

}
