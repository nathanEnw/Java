package Package;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to find its factorial");
		int n = scanner.nextInt();
		int factorial = 1;
		
		for (int i = 1; n >= i; i++) {
			factorial *=i;
		}
		
		System.out.println("Factorial of " + n + " is " + factorial);
		scanner.close();
	}
}