//5. Programs on Logical AND,OR operator and Logical NOT
package operators;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scn.nextInt();
		System.out.println("Enter second number");
		int num2 = scn.nextInt();
		if(num1==5 && num2==6)
		{
			System.out.println("Example of logical AND operator");
		}
		else if(num1==6 || num2==5)
		{
			System.out.println("Example of logical OR operator");
		}
		else if(num1!=num2)
		{
			System.out.println("Example of logical NOT operator");
		}

	}

}
