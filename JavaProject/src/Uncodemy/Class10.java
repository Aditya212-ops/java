package Uncodemy;

public class Class10 {

	public static void main(String[] args) {
		// WAP to find the greater value among 3 double variables
		double a = 10.5, b = 8.3, c = 12.7, m;

		if ((a > b) && (a > c)) {
			m = a;
		}

		else if (b > c) {
			m = b;
		} else {
			m = c;
		}

		System.out.println("The greatest value among 3 double variables is: " + m);

	}

}
