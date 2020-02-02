package java_school;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		for (int t = 0; t < s.length; t++) {
			for (int i = 0; i < s.length; i++) {
				int j = i;
				while (j < s.length - 3) {
					try {
						BigDecimal bigA = new BigDecimal(s[j]);
						BigDecimal bigB = new BigDecimal(s[j + 1]);
						if (bigB.compareTo(bigA) == -1) {
							s[n + 1] = s[j + 1];
							s[j + 1] = s[j];
							s[j] = s[n + 1];
						}
					} catch (NullPointerException e) {

					}
					j++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			 System.out.println(s[i]);
		}
		/*
		 * int temp;
		 * 
		 * int[] myArray = new int[] { 2, 10, 5, 8, 0, 7, 10, 11 };
		 * 
		 * for (int i = 0; i < myArray.length; i++) { for (int j = i + 1; j <
		 * myArray.length; j++) { if (myArray[j] < myArray[i]) { temp =
		 * myArray[i]; myArray[i] = myArray[j]; myArray[j] = temp; }
		 * 
		 * } } System.out.println("\n"); for (int k = 0; k < myArray.length;
		 * k++) { System.out.print(myArray[k] + ", "); }
		 */
	}
}
