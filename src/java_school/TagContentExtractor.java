package java_school;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "<(?i)(.+)>([^<]+)<\/\1>"

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			// Write your code here
			boolean find = false;
			Pattern pattern = Pattern.compile("<(.+)>([^<]+)<\\/\\1>");
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				System.out.println(matcher.group(2));
				find = true;
			}
			if(!find){
				System.out.println("None");
			}

			testCases--;
		}
		in.close();
	}

}
