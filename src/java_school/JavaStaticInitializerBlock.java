package java_school;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
	static boolean flag;
	static int B;
	static int H;

	static {
		Scanner in = new Scanner(System.in);
		flag = false;
		B = in.nextInt();
		H = in.nextInt();
		in.close();
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (flag) {
			int area = B * H;
			System.out.print(area);
		} else {

		}

	}
}
