package java_school;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class JavaHashSet1 {

	private static final int HashSet = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		// Write your code here
		s.close();
		Set<String> hashSet = new HashSet<>(); 
		for (int i = 0; i < t; i++) {
			hashSet.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(hashSet.size());
		}
	}

}
