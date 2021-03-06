package org.opentutorials.javatutorials.compare;

public class EqualDemo {

	public static void main(String[] args) {
		
		System.out.println(1 == 2); // false
		System.out.println(1 == 1); // true
		System.out.println("1" == "1"); // true
		System.out.println("one" == "two"); // false
		System.out.println("one" == "one"); // true
		
		System.out.println(1 != 2); // true
		System.out.println(1 != 1); // false
		System.out.println("1" != "1"); // false
		System.out.println("one" != "two"); // true
		System.out.println("one" != "one"); // false
		
		System.out.println(10 > 20); // false
		System.out.println(10 >= 2); // true
		System.out.println(10 > 2); // true
		
		String a = "Hello \"World\"";
		String b = new String("Hello \"World\"");
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true

	}

}
