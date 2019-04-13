package hackerrank.javaloops2;

import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int sum = 0;
			int pwdTwo = 1;
			for (int j = 0; j < n; j++) {
//				System.out.println("a=" + a + "pwdTwo=" + pwdTwo + "b=" + b);
				sum = sum + pwdTwo * b;
				System.out.print(a + sum + " ");
				pwdTwo = pwdTwo * 2;
			}
			System.out.println();
		}
		in.close();

	}

}
