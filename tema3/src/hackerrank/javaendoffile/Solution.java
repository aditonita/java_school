package hackerrank.javaendoffile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("..\\java_school\\tema3\\src\\hackerrank\\javaendoffile\\input"));
		int lineNr = 0;
		while(sc.hasNext()) {
			System.out.println(++lineNr + " " + sc.nextLine());
		}
	}
}
