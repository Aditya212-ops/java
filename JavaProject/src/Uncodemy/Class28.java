package Uncodemy;

public class Class28 {

	public static void main(String[] args) {
		int e;
		int result;
		for (int i = 0; i < 10; i++) {
			result = 1;

			e = i;
			while (e > 0) {
				result *= 2;
				e--;
			}
			System.out.println("2 to the power of " + i + " is " + result);
		}

	}
}
