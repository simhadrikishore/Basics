package sample;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter a value of A: ");
		System.out.println("Enter a value of B: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("Addition: " + (a + b));
		System.out.println("Substraction: " + (a - b));
		System.out.println("Multiplcation: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("Reminder: " + (a % b));
    System.out.println("The Arthmetic operations");
	}
}
