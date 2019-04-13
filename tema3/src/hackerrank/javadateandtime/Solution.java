package hackerrank.javadateandtime;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.DayOfWeek;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		Calendar c = Calendar.getInstance();

		c.set(year, month - 1, day);

//		c.set(Calendar.MONDAY, month - 1);
//		c.set(Calendar.DATE, day);
//		c.set(Calendar.YEAR, year);

		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			return "SUNDAY";
		case Calendar.MONDAY:
			return "MONDAY";
		case Calendar.TUESDAY:
			return "TUESDAY";
		case Calendar.WEDNESDAY:
			return "WEDNESDAY";
		case Calendar.THURSDAY:
			return "THURSDAY";
		case Calendar.FRIDAY:
			return "FRIDAY";
		case Calendar.SATURDAY:
			return "SATURDAY";
		}
		return "";
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);

		bufferedWriter.write(res);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
