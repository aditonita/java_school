package java_school;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		s = s.trim();
		if (s.length() == 0) {
			System.out.println(0);
		} else {
			String result[] = s.split("[ |!|,|\\?|\\.|_|'|@|]+");
			System.out.println(result.length);
			for (String t : result) {
				System.out.println(t);
			}
		}
		scan.close();

	}

}
