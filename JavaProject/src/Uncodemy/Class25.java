package Uncodemy;

public class Class25 {

	public static void main(String[] args) {
		double num, sroot, rerr;
		for (num = 1.0; num < 5; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Square root of " + num + " is " + sroot);
			// compute rounding error 
			rerr = num - (sroot * sroot);
			System.out.println("Rounding error is " + rerr);
			System.out.println();
		}
	}

}
