package java_school;

import java.util.Scanner;

public class JavaStringIntroduction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println((A.compareTo(B)>0)?"Yes":"No");
        String firstCharA = Character.toString(A.charAt(0));
        String firstCharB = Character.toString(B.charAt(0));
        System.out.println(A.replaceFirst(firstCharA,firstCharA.toUpperCase()) + " " + B.replaceFirst(firstCharB,firstCharB.toUpperCase()));
	}

}
