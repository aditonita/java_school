package hackerrank.Java1darraypart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	static int n;
	static int leap;
	static int k = 0;
	static boolean stopGame = false;
	static boolean wasBackward = false;
	static boolean wasForward = false;
	static int repeatMove = 0;

	public static void main(String[] args) throws FileNotFoundException {

//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new File("..\\java_school\\tema3\\src\\hackerrank\\Java1darraypart2\\input.txt"));

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			n = sc.nextInt();
			leap = sc.nextInt();
			int[] game = new int[n];
			for (int j = 0; j < n; j++) {
				game[j] = sc.nextInt();
			}
			while (!stopGame) {
				if (canMoveForwardLeap(k, leap, game)) {
					k = MoveForwardLeap(k, leap, game);
				} else if (canMoveForward(k, game)) {
					k = moveForward(k, game);
					if (wasBackward) {
						repeatMove++;
						wasForward = true;
					} else {
						repeatMove = 0;
						wasForward = true;
					}
					wasBackward = false;
				} else if (canMoveBackward(k, game)) {
					k = moveBackward(k, game);
					if (wasForward) {
						repeatMove++;
						wasBackward = true;
					} else {
						repeatMove = 0;
						wasBackward = true;
					}
					wasForward = false;
				} else {
					System.out.println("NO");
					stopGame = true;
				}
				if (repeatMove == 5) {
					System.out.println("NO");
					stopGame = true;
				}
				if ((k == (n - 1)) || ((k + leap) > (n - 1))) {
					System.out.println("YES");
					stopGame = true;
				}
			}
			reInit();
		}
	}

	private static void reInit() {
		k = 0;
		stopGame = false;
		wasBackward = false;
		wasForward = false;
		repeatMove = 0;
	}

	private static int moveBackward(int k, int[] game) {
		if ((k - 1) >= 0) {
			if (game[k - 1] == 0) {
				return k - 1;
			}
		}
		return k;
	}

	private static boolean canMoveBackward(int k, int[] game) {
		if ((k - 1) >= 0) {
			if (game[k - 1] == 0) {
				return true;
			}
		}
		return false;
	}

	private static int moveForward(int k, int[] game) {
		if ((k + 1) < game.length) {
			if (game[k + 1] == 0) {
				return k + 1;
			}
		}
		return k;
	}

	private static boolean canMoveForward(int k, int[] game) {
		if ((k + 1) < game.length) {
			if (game[k + 1] == 0) {
				return true;
			}
		}
		return false;
	}

	private static int MoveForwardLeap(int k, int leap, int[] game) {
		if ((k + leap) < game.length) {
			if (game[k + leap] == 0) {
				return k + leap;
			}
		}
		return k;
	}

	private static boolean canMoveForwardLeap(int k, int leap, int[] game) {
		if ((k + leap) < game.length) {
			if (game[k + leap] == 0) {
				return true;
			}
		}
		return false;
	}

}
