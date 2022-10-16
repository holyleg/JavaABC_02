package main;

import java.util.Scanner;

import etc.CalculatorForMainApp;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CalculatorForMainApp cal = new CalculatorForMainApp();
		int num1, num2;
		int result;
		char operator;
		boolean run = true;

		while (run) {
			System.out.println("Enter the first number: ");
			num1 = sc.nextInt();
			
			System.out.println("Enter the second number: ");
			num2 = sc.nextInt();
			
			System.out.println("Enter the operator: ");
			operator = sc.next().charAt(0);
			
			if(operator == '+') {
				result = cal.add(num1, num2);
				System.out.println("The result is: " + result);
			}
			else if(operator == '-') {
				result = cal.sub(num1, num2);
				System.out.println("The result is: " + result);
			}
			else if(operator == '*') {
				result = cal.mul(num1, num2);
				System.out.println("The result is: " + result);
			}
			else if(operator == '/') {
				result = cal.div(num1, num2);
				System.out.println("The result is: " + result);
			}
			else {
				System.out.println("Invalid operator");
			}
		}
		sc.close();
	}

}
