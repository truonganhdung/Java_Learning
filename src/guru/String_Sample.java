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
		System.out.println("Length of String: " + str3.length());
		System.out.println("Character at position 5: " + str3.charAt(5));
		// Index of a given character
		System.out.println("Index of character 'S': " + str3.indexOf('R'));

		// Method 2 : Using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4 + ", Length of String: " + str4.length());

		// Compare to
		System.out.println("Compare To 'ROCKSTAR': " + str3.compareTo("rockstar"));
		// Compare to - Ignore case
		System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str3.compareToIgnoreCase(str4));

		// Contain method
		System.out.println("Contains sequence 'tar': " + str3.contains("tars"));

		// Ends With
		System.out.println("EndsWith character 'r': " + str3.endsWith("r"));

		// "replaceAll" & "replaceFirst"
		System.out.println("Replace 'Rock' with 'Duke': " + str3.replace("Rock", "Duke"));
	}
}
