package java_school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class JavaStack {

	public static void main(String[] args) throws FileNotFoundException {
		File fin = new File("/home/veronica/exercices/java/github/java_school/src/java_school/data/inputJavaStack");
		Scanner sc = new Scanner(fin);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			System.out.println(isBalanced(input));
		}
		sc.close();
	}

	private static boolean isBalanced(String string) {
		Deque<Character> stack = new ArrayDeque<>();
		boolean checkStack = true;

		if (string.length() % 2 != 0) {
			return false; // nu sunt caractere in numar par
		}
		if (string.length() == 0 || string == null) {
			return true;
		}
		for (int i = 0; checkStack && i < string.length(); i++) {
			// verifica daca se exista perechi (),[],{} sau se termina toate
			// caracterele
			char c = string.charAt(i);
			switch (c) {
			case '(':
			case '[':
			case '{':
				stack.addLast(c);
				// adauga in stiva daca este caracter de inceput
				break;
			case ')':
					checkStack = !(stack.isEmpty() || stack.removeLast() != '(');
				// elimina din stiva daca ultimul element a fost pereche ()
				// verifica daca e vida stiva 
				break;
			case ']':
					checkStack = !(stack.isEmpty() || stack.removeLast() != '[');
				// elimina din stiva daca ultimul element a fost pereche []
				break;
			case '}':
					checkStack = !(stack.isEmpty() || stack.removeLast() != '{');
				// elimina din stiva daca ultimul element a fost pereche {}
				break;
			default:
				return false; // orice alt caracter este gresit
			}
		}
//		if (!stack.isEmpty()) {
//			return false;
//		}
		return checkStack;
	}

}
