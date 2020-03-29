package java_school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Write your Checker class here

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		if (p2.score > p1.score) {
			return 1;
		} else if (p1.score == p2.score) {
			if (p1.name.compareTo(p2.name) > 0) {
				return 1;
			}else if(p1.name.compareTo(p2.name) < 0){
				return -1;
			}
		} else {
			return -1;
		}
		return 0;
	}

}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class JavaComparator {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File fin = new File ("/home/veronica/exercices/java/github/java_school/src/java_school/data/inputJavaComparator");
		Scanner scan = new Scanner(fin);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}

	}

}
