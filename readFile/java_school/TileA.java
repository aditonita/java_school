package java_school;

import java.util.List;
import java.util.ArrayList;

public class TileA implements Tile {
	public List<Integer> shapeTileA = new ArrayList<>();
	private int startStone;
	private int tileBorder;

	public TileA(int startStone, int columns, String direction) {
		this.startStone = startStone;
		this.tileBorder = startStone;
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
		if (shapeTileA.containsAll(blokedStone)) {
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
		return new TileB(startStone, columns, direction);
	}
	
	@Override
	public boolean borderOvercome(List<Integer> northBorder, List<Integer> southBorder, List<Integer> estBorder,
			List<Integer> westBorder) {
		if(northBorder.containsAll(shapeTileA)) {
			return true;
		}
		if(southBorder.containsAll(shapeTileA)) {
			return true;
		}
		if(estBorder.containsAll(shapeTileA)) {
			return true;
		}
		if(westBorder.containsAll(shapeTileA)) {
			return true;
		}
		return false;
	}
}
