//2. Write a method for increment and decrement operators(++, --)
package operators;

public class Q2 {

	public static void increment() {
		int a = 0;
		while (a < 5) {
			a++;
			System.out.println(a);
		}
	}

	public static void decrement() {
		int a = 5;
		while (a > 0) {
			a--;
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		increment();
		decrement();

	}

}
