package java_school;

import java.util.Scanner;

public class JavaIfElse {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		/*
		 * If is odd, print Weird If is even and in the inclusive range of 2 to
		 * 5, print Not Weird If is even and in the inclusive range of 6 to 20,
		 * print Weird If is even and greater than 20, print Not Weird
		 */

		if (N % 2 == 1 || (N > 5 && N <= 20)) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}

		scanner.close();
	}

}
