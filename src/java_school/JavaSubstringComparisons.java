package java_school;

public class JavaSubstringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSmallestAndLargest("ava", 3));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length
		// 'k'
		// 'largest' must be the lexicographically largest substring of length
		// 'k'

		smallest = s.substring(0, k);
		largest = s.substring(0, k);
		for (int i = 0; i < s.length() - k + 1; i++) {

			if (smallest.compareTo(s.substring(i, i + k)) > 0) {
				smallest = s.substring(i, i + k);
			}
			if (largest.compareTo(s.substring(i, i + k)) < 0) {
				largest = s.substring(i, i + k);
			}

		}


		return smallest + "\n" + largest;
	}
}
