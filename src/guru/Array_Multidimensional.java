package guru;

/* Author: truonganhdung
 * Created Date: 11/09/2018
 * Modified Date: ../../2018
 * 
 * https://www.guru99.com/java-arrays.html#2
 * */

public class Array_Multidimensional {
	public static void main(String[] args) {

		int[][] twoD = new int[4][4];

		twoD[0][0] = 1;
		twoD[1][1] = 2;
		twoD[3][2] = 3;
		System.out.print(twoD[3][2]);
	}

}