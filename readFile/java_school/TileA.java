package java_school;

import java.util.List;
import java.util.ArrayList;

public class TileA implements Tile {
	public List<Integer> shapeTileA = new ArrayList<>();
	private int startStone;
	private int tileBorder;
	String direction ;
	List<Integer> northBorder;
	List<Integer> southBorder;
	List<Integer> estBorder;
	List<Integer> westBorder;

	public TileA(int startStone, int columns, String direction, List<Integer> northBorder, List<Integer> southBorder,
			List<Integer> estBorder, List<Integer> westBorder) {
		this.startStone = startStone;
		this.tileBorder = startStone;
		this.direction = direction;
		this.northBorder = northBorder;
		this.southBorder = southBorder;
		this.estBorder = estBorder;
		this.westBorder = westBorder;

		if (direction == "leftToRight") {
			shapeTileA.add(startStone);
			shapeTileA.add(startStone + 1);
			shapeTileA.add(startStone + 2);
			this.tileBorder = startStone + 2;
		}
		if (direction == "rightToLeft") {
			shapeTileA.add(startStone);
			shapeTileA.add(startStone - 1);
			shapeTileA.add(startStone - 2);
			this.tileBorder = startStone + 2;
		}
	}

	@Override
	public boolean isPlaceble(List<Integer> blokedStone) {
		if (tileContainsStone(blokedStone)) {
			return false;
		}
		if (borderOvercome()) {
			return false;
		}
		return true;
	}

	private boolean tileContainsStone(List<Integer> blockedStone) {
		for (int stone : shapeTileA) {
			if(blockedStone.contains(stone)) {
				return true;
			}
		}
		return false;
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
	public Tile nextTile(int startStone, int columns) {
		return new TileB(startStone, columns, direction, northBorder, southBorder, estBorder, westBorder);
	}

	private boolean borderOvercome() {
		if (tileContainsStone(northBorder)) {
			return true;
		}
		if (tileContainsStone(southBorder)) {
			return true;
		}
		if (direction == "rightToLeft" && tileContainsStone(estBorder)) {
			return true;
		}
		if (direction == "leftToRight" && tileContainsStone(westBorder)) {
			return true;
		}
		return false;
	}
}
