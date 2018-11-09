package guru;

/* Author: truonganhdung
 * Created Date: 11/09/2018
 * Modified Date: ../../2018
 * 
 * https://www.guru99.com/java-arrays.html#2
 * */

public class Array_Pass_by_Reference {
	public static void passByReference(String a[]) {
		a[1] = "Mango 1";
	}

	public static void main(String args[]) {
		String[] b = { "Apple", "Mango", "Orange" };
		for(int i = 0;i< b.length;i++) {
			System.out.println("After Function Call :    " + b[i]);
		}
		System.out.println("\n");
		
		Array_Pass_by_Reference.passByReference(b);
		
		for(int i = 0;i< b.length;i++) {
			System.out.println("After Function Call :    " + b[i]);
		}
	}
}