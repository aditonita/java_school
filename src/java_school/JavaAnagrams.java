package java_school;

import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		a = a.toUpperCase();
		b = b.toUpperCase();
		int englishCharsA[] = new int[128];
		int englishCharsB[] = new int[128];
		int k;
		int j;
		// for (int i = 0; i < 128; i++) {
		// englishCharsA[i] = 0;
		// englishCharsB[i] = 0;
		// }
		if (a.length() != b.length()) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			k = (int) a.charAt(i);
			j = (int) b.charAt(i);
			englishCharsA[k] = englishCharsA[k] + 1;
			englishCharsB[j] = englishCharsB[j] + 1;
		}
		for (int i = 0; i < 128; i++) {
			if (englishCharsA[i] != englishCharsB[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
