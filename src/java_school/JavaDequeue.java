package java_school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {

	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		File fin = new File("/home/veronica/exercices/java/github/java_school/src/java_school/data/inputJavaDequeue");
		Scanner in = new Scanner(fin);
		Deque<Integer> deque = new ArrayDeque<>();
		Set<Integer> s = new HashSet<>();
		int n = in.nextInt();
		int m = in.nextInt();
		// int maxSize = 0;
		int maxSize = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			//deque.add(num);
			deque.addLast(num);
			if (deque.size() == m) {
//				maxSize = maxSize > deque.stream().distinct().count() ? maxSize
//						: (int) deque.stream().distinct().count();
				s.addAll(deque);
				if (maxSize < s.size()) {
				maxSize = s.size();
				}
				s.clear();
				deque.removeFirst();
			}
		}
		in.close();

		System.out.println(maxSize);
		
		System.out.println((float)(System.currentTimeMillis()-startTime)/1000);
	}
}
