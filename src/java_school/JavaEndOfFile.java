package java_school;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			System.out.println(i + " " + in.nextLine());
			i++;
		}
		in.close();
	}

}
