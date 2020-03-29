package java_school;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Let's play a game on an array! You're standing at index 0 of an n-element array named game. 
// From some index i (where 0<=i<=n), you can perform one of the following moves:
// Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.
// Move Forward:
//   If cell i+1 contains a zero, you can walk to cell i+1.
//   If cell i+leap contains a zero, you can jump to cell i+leap.
//   If you're standing in cell n-1 or the value of i+leap>=n, you can walk or jump off the end of 
//   the array and win the game.
// In other words, you can move from index i to index i+1, i-1 or i+leap as long as the destination 
// index is a cell containing a 0. If the destination index is greater than n-1, you win the game.

public class Java1DArrayPart2 {

	public static boolean canWin(int leap, int[] game) {
		if (game == null) {
			return false;
		}
		return isSolvable(leap, game, 0);
	}

	private static boolean isSolvable(int leap, int[] game, int i) {
		if (i >= game.length) {
			return true;
		} else if (i < 0 || game[i] == 1) {
			return false;
		}
		game[i] = 1;
		return isSolvable(leap, game, i + leap) || isSolvable(leap, game, i + 1) || isSolvable(leap, game, i - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fin = new File(
				"/home/veronica/exercices/java/github/java_school/src/java_school/data/inputJava1DArrayPart2");
		Scanner scan;
		try {
			scan = new Scanner(fin);
			FileWriter fw = new FileWriter(
					"/home/veronica/exercices/java/github/java_school/src/java_school/data/outputJava1DArrayPart2");
			// Scanner scan = new Scanner(System.in);
			int q = scan.nextInt();
			while (q-- > 0) {
				int n = scan.nextInt();
				int leap = scan.nextInt();

				int[] game = new int[n];
				for (int i = 0; i < n; i++) {
					game[i] = scan.nextInt();
				}

				// System.out.println((canWin(leap, game)) ? "YES" : "NO");
				fw.write((canWin(leap, game)) ? "YES" : "NO");
				fw.write("\n");
			}
			scan.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
