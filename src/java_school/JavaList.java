package java_school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		// 5
		// 12 0 1 78 12
		// 2
		// Insert
		// 5 23
		// Delete
		// 0
		// Sample Output
		// 0 1 78 12 23
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		int p = 0;
		int val = 0;
		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}
		n = sc.nextInt();

		for (int i = 0; i < 2 * n; i = i + 2) {
			sc.nextLine();
			String action = sc.nextLine();

			if (action.equals("Insert")) {
				p = sc.nextInt();
				val = sc.nextInt();
				l.add(p, val);
			}
			if (action.equals("Delete")) {
				p = sc.nextInt();
				l.remove(p);
			}
		}
		sc.close();

		for (int e : l) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
