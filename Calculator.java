package Package;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) throws IOException{
		double number1, number2, result;
		char calculator;
		
		System.out.println("Choose math method (+, -, *, /)");
		
		Scanner scanner = new Scanner(System.in);
		calculator = scanner.next().charAt(0);
		
		System.out.println("Enter first number");
		number1= scanner.nextDouble();
		
		System.out.println("Enter second number");
		number2 = scanner.nextDouble();
		
		if (calculator == '+') {
			result = number1 + number2;
			System.out.println(result);
		}
		else if (calculator == '-') {
			result = number1 - number2;
			System.out.println(result);
		}
		else if (calculator == '*') {
			result = number1 * number2;
			System.out.println(result);
		}
		else if (calculator == '/') {
			if(number1 == 0 || number2 == 0) {
				System.out.println("Cannot divide with 0");
			} else {
				result = number1 / number2;
				System.out.println(result);
			}
		}
		else {
			System.out.println("Invalid method");
		}
		scanner.close();
	}
}
