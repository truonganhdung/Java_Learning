package guru;

/* Author: truonganhdung
 * Created Date: 11/09/2018
 * Modified Date: ../../2018
 * 
 * https://www.guru99.com/java-variables.html#4
 * */

import org.testng.annotations.Test;

public class Type_Casting {
	
	@Test
	public void f() {
		byte x;
		int a = 270;
		double b = 128.128;
		
		System.out.println("int converted to byte:");
		x = (byte) a;
		System.out.println("a and x " + a + " " + x);
		System.out.println("----------------------");
		
		System.out.println("\ndouble converted to int:");
		a = (int) b;
		System.out.println("b and a " + b + " " + a);
		System.out.println("----------------------");
		
		System.out.println("\ndouble converted to byte:");
		x = (byte) b;
		System.out.println("b and x " + b + " " + x);
		System.out.println("----------------------");
	}
}
