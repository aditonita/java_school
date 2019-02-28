package hackerrank.javaarraylist;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
//		final Scanner sc = new Scanner(System.in);
		final Scanner sc = new Scanner(new File("..\\java_school\\tema3\\src\\hackerrank\\javaarraylist\\input.txt"));
		int x;
		int y;
		List<Integer[]> arr = new ArrayList<Integer[]>();
		List<Integer[]> xy = new ArrayList<Integer[]>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int d = sc.nextInt();
			Integer[] a = new Integer[d];
			for (int j = 0; j < d; j++) {
				a[j] = sc.nextInt();
			}
			arr.add(a);
		}
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			Integer[] p = new Integer[2];
			p[0] = sc.nextInt();
			p[1] = sc.nextInt();
			xy.add(p);
		}
//		System.out.println(xy.get(1)[1]);
		for (Integer[] s : xy) {
			x = s[0] - 1;
			y = s[1] - 1;
			if (arr.size() > x) {
				if (arr.get(x).length > 0) {
					if (arr.get(x).length > y) {
						System.out.println(arr.get(x)[y]);
					} else {
						System.out.println("ERROR!");
					}
				} else {
					System.out.println("ERROR!");
				}
			}
		}
//		System.out.println(arr.get(1)[0]);

	}

}
