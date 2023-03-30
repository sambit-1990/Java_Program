//4. Write a program to find the two numbers equal or not.

package operators;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scn.nextInt();
		System.out.println("Enter second number");
		int num2 = scn.nextInt();

		if (num1 == num2) {
			System.out.println("Both entered numbers are equal");
		} else {
			System.out.println("Both entered numbers are not equal");
		}

	}

}
