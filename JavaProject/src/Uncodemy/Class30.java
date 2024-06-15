package Uncodemy;

import java.io.IOException;

public class Class30 {

	public static void main(String[] args) throws IOException {
		char ch;
		for (;;) {
			ch = (char) System.in.read(); // get a char
			if (ch == 'q')
				break;
		}
		System.out.println("You pressed q!");

	}

}
