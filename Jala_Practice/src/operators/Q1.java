//1. Write a function for arithmetic operators(+,-,*,/)
package operators;

public class Q1 {

	public static void operatorMethod()
	{
		int a = 12;
		int b = 6;
		int add,sub,mult,div;
		
		add = a+b;
		sub = a-b;
		mult = a*b;
		div = a/b;
		System.out.println(add+"+"+sub+"+"+mult+"+"+div);
	}
	public static void main(String[] args) {
		
		operatorMethod();
	}

}
