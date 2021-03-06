package org.opentutorials.javatutorials.variables;

public class floatDemo {

	public static void main(String[] args) {
		
		// Explicit float assignment
		float a = 2.2F;
		long b = 2147483648L; // long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		byte c = 127; // byte : -128 ~ 127
		short d = 32767; // short : -32,768 ~ 32,767
		int e = 2147483647; // int : -2,147,483,648 ~ 2,147,483,647
		
		System.out.println(a + b); // 2.14748365E9
		System.out.println(c + b); // 2147483775
		System.out.println(c + d); // 32894
		System.out.println(d + e); // -2147450882 --> int 범위 초과로 (-)로 넘어감
		
		/*
			Integer : byte, short, int, long
			Real : float, double
			string : char
		*/
	}

}
