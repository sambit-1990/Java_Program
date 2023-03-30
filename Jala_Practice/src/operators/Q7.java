//7. Print the smaller and larger number
package operators;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int num[] = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = scn.nextInt();
		}
		int largestNumber = num[0];
		for (int j = 0; j < 5; j++) {
			while (j < 5) {
				if (num[0] > num[j]) {
					largestNumber = num[j];
				}
				j++;
			}
		}
		int smallestNumber = num[0];
		for (int k = 0; k < 5; k++) {
			while (k < 5) {
				if (num[0] < num[k]) {
					largestNumber = num[k];
				}
				k++;
			}
		}
		System.out.println("largestNumber = " + largestNumber);
		System.out.println("smallestNumber = " + smallestNumber);
	}

}
