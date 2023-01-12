package runner;

import java.util.Scanner;

public class Runner {


	public static void main(String[] args) {
		// user already exists in database
		// retrieve the user from database 
		String s = "Name";
		loggedMenu(s);


	}

	public static void loggedMenu(String id) {

		//initializing scanner
		Scanner scan = new Scanner(System.in);

		int ans;

		do {
			menu(id);
			ans = scan.nextInt();
			switch (ans) {
				case 1:
					//Add album
					System.out.println("This will add an album");
					break;

				case 2:
					//Update Progress
					System.out.println("This will update the progress of an album");
					break;

				case 3:
					//View Albums
					System.out.println("This will display the albums and their progress");
					break;

				case 4:
					System.out.println("Thanks for using our tracker, have a great day!\n");
					break;

				default:
					System.out.println("Invalid input, try again!\n");
					scan.nextLine();
			}
		}
		while (ans != 4);
		scan.close();
	}

	public static void menu(String id) {

		System.out.println("==============================================");
		System.out.println("  Hello, " + id);
		System.out.println("| Welcome to the Album Progress Tracker!     |");
		System.out.println("|                                            |");
		System.out.println("| Please choose from, the following options: |");
		System.out.println("|                                            |");
		System.out.println("| 1: Add Album                               |");
		System.out.println("| 2: Update Progress                         |");
		System.out.println("| 3: List Albums                             |");
		System.out.println("| 4: LOGOUT                                  |");
		System.out.println("|                                            |");
		System.out.println("==============================================");


	}
}
