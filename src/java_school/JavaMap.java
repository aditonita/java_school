package java_school;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		// Sample Input
		// 3
		// uncle sam
		// 99912222
		// tom
		// 11122222
		// harry
		// 12299933
		// uncle sam
		// uncle tom
		// harry
		// Sample Output

		// uncle sam=99912222
		// Not found
		// harry=12299933

		Map<String, Integer> m = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			m.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (m.containsKey(s)) {
				System.out.println(s + "=" + m.get(s));
			} else {
				System.out.println("Not found");
			}
		}

		in.close();
	}

}
