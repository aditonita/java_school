package java_school;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int powerOfTwo = 1;
			int sumOfTwo = 1;
			int sum = a + b * sumOfTwo;
			System.out.print(sum + " ");
			for (int j = 1; j < n; j++) {
				powerOfTwo = powerOfTwo * 2;
				sumOfTwo = sumOfTwo + powerOfTwo;
				sum = a + b * sumOfTwo;
				System.out.print(sum + " ");
			}
			System.out.print("\n");
		}
		in.close();
	}

}
