package guru;

/* Author: truonganhdung
 * Created Date: 11/09/2018
 * Modified Date: ../../2018
 * 
 * https://www.guru99.com/java-arrays.html#2
 * */

public class Array_Simple {
	public static void main(String args[]) {
		int array[] = new int[7];

		for (int count = 0; count < 7; count++) {
			array[count] = count + 1;

			System.out.println("array[" + count + "] = " + array[count]);
		}
		System.out.println("Length of Array  =  " + array.length);
		// array[8] =10;
	}
}
