// 1. How to create a class, object, method and its signature

package javaBasics;

public class Q1 {
	int a, b;

	public int add(int a, int b) {
		return a + b;
		
	}

	public static void main(String[] args) {

		Q1 obj = new Q1();
		System.out.println(obj.add(5, 6));

	}

}
