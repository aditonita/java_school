package java_school;

import java.util.Scanner;

public class JavaLoopsI {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 1; i < 11; i++) {
			System.out.println(N + " x " + i + " = " + N * i);
		}
		scanner.close();
	}

}
