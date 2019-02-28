package hackerrank.javasubarray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		int n;

//		final Scanner sc = new Scanner(System.in);
		final Scanner sc = new Scanner(new File("..\\java_school\\tema3\\src\\hackerrank\\javasubarray\\input.txt"));
		n = sc.nextInt();
		int[] arr = new int[n];
		int k = 0;
		int sum = 0;
		int contor = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j--) {
				while (k < j) {
					if (i + k < j) {
						sum += arr[i + k];
					}
					k++;
				}
				if(sum<0) {
					contor++;
				}
				k = 0;
				sum = 0;
			}
		}
		System.out.println(contor);
	}
}
