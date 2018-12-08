package tema1;

import java.util.Scanner;

public class arithmeticCalculator {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Arithmetic Calculator - permit as input numbers [only integer] and operators");
		char cancel = 'a';
		int rezultat = 0;
		int operand = 0;
		int operand2 = 0;
		boolean wasOperator = false;
		String operator = "+";
		
		String numar = sc.next();
		operand2 = getNumber(numar);
		
		do {
			String inputString = sc.next();
			if (inputString.length() > 0) {
			cancel = inputString.charAt(0);
			}
			if((cancel != '=') && (cancel != 'c')) {
				if(wasOperator)	{
					operand = getNumber(inputString);
					rezultat = getRezultat(operator, operand, operand2);
					System.out.println(operand2 + operator + operand + "=" + rezultat);
					operand2 = rezultat;
					wasOperator = false;
				}else {
					operator = getOperator(inputString);
					wasOperator = true;
				}
			}
			}while((cancel != '=') && (cancel != 'c'));
		System.out.println("=" + rezultat);
		}
	
	public static int getNumber(String input) {
		
		int operand = 0;
		boolean isNumber = false;
		
		do {
		try {
			operand = Integer.parseInt(input);
			isNumber = true;
		}catch(NumberFormatException e) {
			System.out.println("NAN");
			input = sc.next();
			isNumber = false;
		}
		} while(!isNumber);
		
		return operand;
	}
	
	public static String getOperator(String input) {
		
		String operator = null;
		boolean isOperator = false;
		
		do {
			switch (input) {
			case "+":
				operator = input;
				isOperator = true;
				break;
			case "-":
				operator = input;
				isOperator = true;
				break;
			case "*":
				operator = input;
				isOperator = true;
				break;
			case "/":
				operator = input;
				isOperator = true;
				break;
			default:
				System.out.println("Must be an operator");
				input = sc.next();
				isOperator = false;
			}
		}while(!isOperator);
		return operator;
	}
	
	public static int getRezultat(String operator, int operand, int rezultat) {
		
		int out = rezultat;
		switch (operator) {
		case "+":
			out = rezultat + operand;
			break;
		case "-":
			out = rezultat - operand;
			break;
		case "*":
			out = rezultat * operand;
			break;
		case "/":
			out = rezultat / operand;
			break;
		}
		return out;
	}
}

