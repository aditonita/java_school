package java_school;

import java.util.Scanner;

public class JavaStdinAndStdoutI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		scan.close();
	}

}
