package guru;

/* Author: truonganhdung
 * Created Date: 11/09/2018
 * Modified Date: ../../2018
 * 
 * https://www.guru99.com/array-of-objects.html
 * */

class Account {
	int a;
	int b;
	
	public void setData(int aa, int bb) {
		a = aa;
		b = bb;
	}
	
	public void showData() {
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}
}

class Array_Of_Objects {
	public static void main(String args[]) {
		Account obj[] = new Account[2];
		obj[0] = new Account();
		obj[1] = new Account();
		
		obj[0].setData(1, 2);
		obj[1].setData(3, 4);
		
		System.out.println("For Array Element 0:");
		obj[0].showData();
		System.out.println("\n");
		System.out.println("For Array Element 1:");
		obj[1].showData();
	}
}

