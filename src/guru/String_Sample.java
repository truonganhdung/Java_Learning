package guru;

/* Author: truonganhdung
 * Created Date: 11/12/2018
 * Modified Date: ../../2018
 * 
 * https://www.guru99.com/java-strings.html#2
 * */

public class String_Sample {
	public static void main(String[] args) {
		// String Concatenation
		String str1 = "Rock";
		String str2 = "Star";
		
		// Method 1 : Using concat
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		// Method 2 : Using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4);
	}
}
