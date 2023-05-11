package Package;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check if its a prime number: ");
		int n = scanner.nextInt();
		
		boolean isPrime = n > 1;
		for (int i = 2; i * i <= n; i++) {
			if (n % i ==0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(n + " is prime");
		} else {
			System.out.println(n + " is not prime");
		}
		scanner.close();
	}

}
