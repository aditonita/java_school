package java_school;

import java.util.List;
import java.util.ArrayList;

public class TileC implements Tile {
	private List<Integer> shapeTileC = new ArrayList<>();
	private int startStone;
	private int tileBorder;

	public TileC(int startStone, int columns, String direction) {
		this.startStone = startStone;
		this.tileBorder = startStone;

		if (direction == "leftToRight") {
			shapeTileC.add(startStone);
			shapeTileC.add(startStone + columns);
			shapeTileC.add(startStone + 2 * columns);
			shapeTileC.add(startStone + 2 * columns + 1);
			tileBorder = startStone + 2 * columns + 1;
		}
		if (direction == "rightToLeft") {
			shapeTileC.add(startStone);
			shapeTileC.add(startStone + columns);
			shapeTileC.add(startStone + 2 * columns);
			shapeTileC.add(startStone + 2 * columns - 1);
			tileBorder = startStone + 2 * columns - 1;
		}
	}

	@Override
	public boolean isPlaceble(List<Integer> blockedStone) {
		if (shapeTileC.containsAll(blockedStone)) {
			return false;
		}
		return true;
	}

	@Override
	public int nextFreeStone(String direction) {
		if (direction == "leftToRight") {
			return tileBorder + 1;
		}
		if (direction == "rightToLeft") {
			return tileBorder - 1;
		}
		return startStone;
	}

	@Override
	public boolean stopGame(List<Integer> northBorder, List<Integer> southBorder, List<Integer> estBorder,
			List<Integer> westBorder) {
		if (northBorder.contains(tileBorder)) {
			return true;
		}
		if (southBorder.contains(tileBorder)) {
			return true;
		}
		if (estBorder.contains(tileBorder)) {
			return true;
		}
		if (westBorder.contains(tileBorder)) {
			return true;
		}
		return false;
	}

	@Override
	public Tile nextTile(int startStone, int columns, String direction) {
		return new TileA(startStone, columns, direction);
	}

	@Override
	public boolean borderOvercome(List<Integer> northBorder, List<Integer> southBorder, List<Integer> estBorder,
			List<Integer> westBorder) {
		if (northBorder.containsAll(shapeTileC)) {
			return true;
		}
		if (southBorder.containsAll(shapeTileC)) {
			return true;
		}
		if (estBorder.containsAll(shapeTileC)) {
			return true;
		}
		if (westBorder.containsAll(shapeTileC)) {
			return true;
		}
		return false;
	}
}
