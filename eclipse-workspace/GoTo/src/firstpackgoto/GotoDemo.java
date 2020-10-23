package firstpackgoto;

import java.util.Scanner;

public class GotoDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guessing game! \n");
		System.out.println("Please enter the intger number to guess 'n' from 1 to 10");
		System.out.print("n = ");
		int guess = sc.nextInt();
		sc.close();
		//This function works like "goto"
		lavel1: {
		int n = guess;
		System.out.println("You entered: "+n);
		lavel2:   {
			if(n == 2) {
				System.out.println("Yes! You got it!");
				break lavel2; 
			           }
			System.out.println("Sorry, 'n' equal: not "+ guess+ "!");
		          }
		break lavel1;
	            }

	}

}
