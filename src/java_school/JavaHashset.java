package java_school;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {

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
		Set<Element> hashSet = new HashSet<>();
		for (int i = 0; i < pair_left.length || i < pair_right.length; i++) {
			Element e = new JavaHashset().new Element(pair_left[i], pair_right[i]);
			hashSet.add(e);
			// hashSet.forEach(elm -> System.out.println(elm.pairLeft +
			// elm.pairRight));
			System.out.println(hashSet.size());
		}
	}

	//
	class Element {
		private String pairLeft;
		private String pairRight;

		Element(String pairLeft, String pairRight) {
			this.pairLeft = pairLeft;
			this.pairRight = pairRight;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((pairLeft == null) ? 0 : pairLeft.hashCode());
			result = prime * result + ((pairRight == null) ? 0 : pairRight.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Element other = (Element) obj;
			if (pairLeft == null) {
				if (other.pairLeft != null)
					return false;
			} else if (!pairLeft.equals(other.pairLeft))
				return false;
			if (pairRight == null) {
				if (other.pairRight != null)
					return false;
			} else if (!pairRight.equals(other.pairRight))
				return false;
			return true;
		}

	}
	//
}
