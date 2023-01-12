package runner;

import java.util.Scanner;

public class Runner {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Name";
		mainMenu(s);
		

	}

	public static void mainMenu(String id) {
		
		//initializing scanner
		Scanner scan = new Scanner(System.in);
		
		
		menu(id);
		
		int ans = 0;

		boolean whileBool = true;
		
		while(whileBool == true) {
			ans = scan.nextInt();
			
			if(ans == 1) {
				//Add album
				System.out.println("This will add an album");
				
			}
			else if(ans == 2) {
				//Update Progress
				System.out.println("This will update the progress of an album");

			}
			else if(ans == 3) {
				//View Albums
				System.out.println("This will display the albums and their progress");
			
			}
			else if (ans == 4) {

				System.out.println("Thanks for using our tracker, have a great day!\n");
				
				whileBool = false;
				
			}
			else{
				System.out.println("Invalid input, try again!\n");
				scan.nextLine();
				
				
			}
			menu(id);
			
		}
		
		scan.close();
		

		
		
	}
	public static void menu(String id) {
		
		System.out.println("==============================================");
		System.out.println("  Hello, " + id );
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
