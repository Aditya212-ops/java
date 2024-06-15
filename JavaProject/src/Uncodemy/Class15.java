package Uncodemy;

public class Class15 {

	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;
		x = 10.0;
		y = 3.0;

		i = (int) (x / y); // cast double to int 
		
		System.out.println("Integer outcome of x / y: " + i); 
		
		i = b = (byte) i;
							// 100;
		

		System.out.println("Value of b: " + b);
		i = 300;
		b = (byte) i;

		System.out.println("Value of b: " + b);
		b = 88; // ASCII code for X
		ch = (char) b;
		System.out.println("ch: " + ch);
	}

}
