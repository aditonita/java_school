package java_school;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestFile {
	public static void main(String[] args) {

		boolean stopGame = false;
		int contor = 0;
		List<String> lines = new ArrayList<>();

//		ReadFile rf = new ReadFile("D:\\javaschool\\java_school\\readFile\\test.txt");
		ReadFile rf = new ReadFile(".\\readFile\\test.txt");
		lines = rf.getLines();
		InputData dataIn = new InputData(lines.get(0));
		int rows = dataIn.getRows();
		int columns = dataIn.getColumns();
		int startStone = dataIn.getStartStone();
		List<Integer> blokedStone = dataIn.getBlackStones();
		List<Integer> northBorder = dataIn.getNorthBorder();
		List<Integer> southBorder = dataIn.getSouthBorder();
		List<Integer> estBorder = dataIn.getEstBorder();
		List<Integer> westBorder = dataIn.getWestBorder();

		Direction direction = new Direction(startStone, estBorder, westBorder);

		TileA tileA = new TileA(startStone, columns, direction.getDirection(),northBorder,southBorder,estBorder,westBorder);
		Tile tile = tileA;

		do {
			if (tile.isPlaceble(blokedStone)) {
				contor = 0;
				System.out.println(tile.getClass().getSimpleName());
				stopGame = tile.stopGame(northBorder, southBorder, estBorder, westBorder);
				startStone = tile.nextFreeStone(direction.getDirection());
				tile = tile.nextTile(startStone, columns);
			} else {
				contor++;
				tile = tile.nextTile(startStone, columns);
			}
			if (contor > 3) {
				stopGame = true;
				System.out.println("Wrong Data Input " + contor);
			}
		} while (!stopGame);

//		TileB tileB = new TileB(startStone, columns, direction.getDirection());
//		TileC tileC = new TileC(startStone, columns, direction.getDirection());
//		rf.getLines().forEach(line -> System.out.println(line));
//		lines.forEach(line -> System.out.println(line));

	}
}
