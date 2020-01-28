package java_school;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] args) {
		/*
		 * final byte MINBYTE = Byte.MIN_VALUE; final byte MAXBYTE =
		 * Byte.MAX_VALUE; final short MINSHORT = Short.MIN_VALUE; final short
		 * MAXSHORT = Short.MAX_VALUE; final int MININT = Integer.MIN_VALUE;
		 * final int MAXINT = Integer.MAX_VALUE; final long MINLONG =
		 * Long.MIN_VALUE; final long MAXLONG = Long.MAX_VALUE;
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127) {
					System.out.println("* byte");
				}
				// Complete the code
				if (x >= -32768 && x <= 32767) {
					System.out.println("* short");
				}
				if (x >= -2147483648 && x <= 2147483647) {
					System.out.println("* int");
				}
				if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}
		sc.close();
	}
}
