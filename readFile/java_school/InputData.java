package java_school;

import java.util.ArrayList;
import java.util.List;

public class InputData {

	private int rows;
	private int columns;
	private int blackStone;
	private List<Integer> blackStones = new ArrayList<>();
	private int startStone;
	private List<Integer> northBorder = new ArrayList<>();
	private List<Integer> southBorder = new ArrayList<>();
	private List<Integer> estBorder = new ArrayList<>();
	private List<Integer> westBorder = new ArrayList<>();

	public InputData(String line) {
		String[] in = line.split(" \\s*");
		this.rows = Integer.parseInt(in[0]);
		this.columns = Integer.parseInt(in[1]);
		this.blackStone = Integer.parseInt(in[2]);
		for (int i = 0; i < blackStone; i++) {
			this.blackStones.add(Integer.parseInt(in[i + 3]));
		}
		this.startStone = Integer.parseInt(in[in.length - 1]);
		for (int i = 0; i < columns; i++) {
			this.northBorder.add(i + 1);
			this.southBorder.add(rows * (columns - 1) + i);
		}
		for (int i = 0; i < rows; i++) {
			this.estBorder.add(i * columns + 1);
			this.westBorder.add((i + 1) * columns);
		}
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public List<Integer> getBlackStones() {
		return blackStones;
	}

	public int getStartStone() {
		return startStone;
	}

	public List<Integer> getNorthBorder() {
		return northBorder;
	}

	public List<Integer> getSouthBorder() {
		return southBorder;
	}

	public List<Integer> getEstBorder() {
		return estBorder;
	}

	public List<Integer> getWestBorder() {
		return westBorder;
	}
}
