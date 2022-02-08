package org.opentutorials.javatutorials.operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// result is 3
		int result = 1 + 2;
		System.out.println(result);
		
		// result is 2
		result = result - 1; // result -= result
		System.out.println(result);
		
		// result is 6
		result = result * 3;
		System.out.println(result);
		
		// result is 3
		result = result / 2;
		System.out.println(result);
		
		// result is 13
		result = result + 10; // result += 10
		System.out.println(result);
		
		// result is 6
		result = result % 7;
		System.out.println(result);
	}

}
