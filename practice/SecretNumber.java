package practice;

import java.util.Scanner;
import java.lang.Math;

public class SecretNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double userGuess, compare, randomNum;
		
		
		System.out.print("Guess a number between 1 and 10: ");
		userGuess = Math.round(sc.nextDouble());
		
		randomNum = Math.random();
		compare = Math.round(randomNum * 10);
		
			if (userGuess == compare) {
				
				System.out.println("You chose " + (int)userGuess + ", that's correct!");
				
			} else {
				
				System.out.println("Sorry, the number was " + (int)compare);
				
			}
			
	}

}
