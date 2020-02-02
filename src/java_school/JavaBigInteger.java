package java_school;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		BigDecimal bigA = new BigDecimal(a);
		BigDecimal bigB = new BigDecimal(b);
		
		BigDecimal sum = bigA.add(bigB);
		BigDecimal multiply = bigA.multiply(bigB);
		
		System.out.println(sum);
		System.out.println(multiply);

	}

}
