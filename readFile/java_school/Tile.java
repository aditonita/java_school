package java_school;

import java.util.List;

public interface Tile {
	boolean isPlaceble(List<Integer> blockedStone);

	int nextFreeStone(String direction);

	boolean stopGame(List<Integer> northBorder, List<Integer> southBorder, List<Integer> estBorder,
			List<Integer> westBorder);

	boolean borderOvercome(List<Integer> northBorder, List<Integer> southBorder, List<Integer> estBorder,
			List<Integer> westBorder);

	public Tile nextTile(int startStone, int columns, String direction);
}
