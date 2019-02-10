package java_school;

import java.util.List;
import java.util.ArrayList;

public class TileB implements Tile {
	private List<Integer> shapeTileB = new ArrayList<>();
	private int startStone;
	private int tileBorder;

	public TileB(int startStone, int columns, String direction) {
		this.startStone = startStone;
		this.tileBorder = startStone;

		if (direction == "leftToRight") {
			shapeTileB.add(startStone);
			shapeTileB.add(startStone + columns);
			shapeTileB.add(startStone + columns + 1);
			tileBorder = startStone + columns + 1;
		}
		if (direction == "rightToLeft") {
			shapeTileB.add(startStone);
			shapeTileB.add(startStone + columns);
			shapeTileB.add(startStone + columns - 1);
			tileBorder = startStone + columns - 1;
		}

	}

	@Override
	public boolean isPlaceble(List<Integer> blockedStone) {
		if (shapeTileB.containsAll(blockedStone)) {
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
		return new TileC(startStone, columns, direction);
	}

	@Override
	public boolean borderOvercome(List<Integer> northBorder, List<Integer> southBorder, List<Integer> estBorder,
			List<Integer> westBorder) {
		if(northBorder.containsAll(shapeTileB)) {
			return true;
		}
		if(southBorder.containsAll(shapeTileB)) {
			return true;
		}
		if(estBorder.containsAll(shapeTileB)) {
			return true;
		}
		if(westBorder.containsAll(shapeTileB)) {
			return true;
		}
		return false;
	}

}
