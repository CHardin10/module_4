package practice;

import java.util.Scanner;
import java.lang.Math;

public class SecretNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double userGuess, randomNum;
		
		System.out.println();
		System.out.print("Guess a number between 0 and 10: ");
		
		randomNum = Math.round(Math.random() * 10);
					
			while ((userGuess = Math.round(sc.nextDouble())) != randomNum) {
	
				System.out.println();
				System.out.print("Sorry, guess again: ");
	
					if (userGuess > 10 || userGuess < 0) {
							
						System.out.println();
						System.out.println("Enter a valid number!");
						SecretNumber.main(args);
				}
			}
			
			if (userGuess == randomNum) {
				
				System.out.println();
				System.out.println("You chose " + (int)userGuess + ", that's correct!");
				
			}
			
		String yes = "yes";
		String no = "no";
		
		System.out.print("");
		String s = in.nextLine();
		System.out.print("Do you want to guess another number? (Yes/No): ");
		String choose = sc.nextLine().toLowerCase();
					
			if (choose.contentEquals(yes)) {
							
				SecretNumber.main(args);
							
			} else if (choose.contentEquals(no)) {
							
				System.exit(0);
							
			}
	}
}
