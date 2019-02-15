package java_school;

import java.util.List;
import java.util.ArrayList;

public class TileB implements Tile {
	private List<Integer> shapeTileB = new ArrayList<>();
	private int startStone;
	private int tileBorder;
	String direction;
	List<Integer> northBorder;
	List<Integer> southBorder;
	List<Integer> estBorder;
	List<Integer> westBorder;

	public TileB(int startStone, int columns, String direction, List<Integer> northBorder, List<Integer> southBorder,
			List<Integer> estBorder, List<Integer> westBorder) {
		this.startStone = startStone;
		this.tileBorder = startStone;
		this.direction = direction;
		this.northBorder = northBorder;
		this.southBorder = southBorder;
		this.estBorder = estBorder;
		this.westBorder = westBorder;

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
		if (tileContainsStone(blockedStone)) {
			return false;
		}
		if (borderOvercome()) {
			return false;
		}
		return true;
	}

	private boolean tileContainsStone(List<Integer> blockedStone) {
		for (int stone : shapeTileB) {
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
		return new TileC(startStone, columns, direction, northBorder, southBorder, estBorder, westBorder);
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
