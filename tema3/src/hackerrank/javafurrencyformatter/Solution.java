package hackerrank.javafurrencyformatter;

import java.util.*;
import java.text.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.

		Locale inLocale = new Locale("en", "IN");

		NumberFormat nfUs = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nfIndia = NumberFormat.getCurrencyInstance(inLocale);
		NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		String us = nfUs.format(payment);
		String india = nfIndia.format(payment);
		String china = nfChina.format(payment);
		String france = nfFrance.format(payment);

		System.out.println("US: " + us);
        System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
