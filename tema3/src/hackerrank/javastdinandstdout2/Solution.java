package hackerrank.javastdinandstdout2;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		String d1 = scan.next();
		double d = Double.parseDouble(d1);
		scan.nextLine();
		String s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		scan.close();
	}
}
