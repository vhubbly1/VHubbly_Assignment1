/*
 * Class: CMSC203 
 * Instructor:Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 07/17/2023
 * Platform/compiler:IDE ECLIPSE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here:Vivek Hubbly
*/

import java.util.Scanner;
import java.util.Random;
public class VHubbly_Assignment1 {
	 
	public static int guess(int game) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int color = random.nextInt(5); 
		String mainColor = "  ";
		
		int score = 0;
		for(int i=0;i<10;i++) {
			System.out.print("\nRound " + (i+1));
			System.out.println("\n ");
			System.out.println("I am thinking of a color");
			System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			int guess;
			guess = scanner.nextInt();
			if (guess ==color) {
				score++;
			}
			switch(color) {
			case 0:
				mainColor="Red ";
				
				//breaks after case 0
				break;
			case 1:
				mainColor = "Green ";
				
				//breaks after case 1
				break;
			case 2:
				mainColor = "Blue ";
				
				
				//breaks after case 2
				break;
			case 3:
				mainColor = "Orange ";
				
				
				//breaks after case 3
				break;
			case 4:
				mainColor = "Yellow ";
				
				
				//breaks after case 4
				break;
			}
			
			/* moves to generate random color after guess */ color = random.nextInt(5);
			
			
			System.out.println("I was thinking of " + mainColor);
			
			
			
		}
		scanner.close();
		return score;
	}
	
	public static void main(String[] args) {
        String name, describe;
        int mcNum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("\nEnter your MC M#: M");
        mcNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\nDescribe yourself:");
        describe = scanner.nextLine();
        System.out.print("\nDue Date: 06/20/23");
        System.out.print("\nCMSC203 Assignment1: Test your ESP Skills!");
        int result = guess(1);
        System.out.println("\nYou guessed " + result + " out of 10 colors correctly.");
        System.out.print("User Name: " + name + "\nStudent MC M#: M" + mcNum + "\nUser Description: " + describe + "\nDue Date: 07/17/23\n\n");
        scanner.close();
    }
		

	}



