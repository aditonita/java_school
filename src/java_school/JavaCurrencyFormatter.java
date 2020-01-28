package java_school;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.
		NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		String us = usFormatter.format(payment);
		// NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(new
		// Locale("en"));
		NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String india = indiaFormatter.format(payment);
		NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = chinaFormatter.format(payment);
		NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = franceFormatter.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}

}
