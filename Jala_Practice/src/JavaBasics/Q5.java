//5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables

package JavaBasics;

public class Q5 {

	static int num = 5;

	public static void main(String[] args) {
		int num = 8;
		System.out.println(num);
		System.out.println(Q5.num);

	}

}
