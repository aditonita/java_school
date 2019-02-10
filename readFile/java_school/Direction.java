package java_school;

import java.util.*;

public class Direction {

	private String direction;

	public Direction(int startStone, List<Integer> estBorder, List<Integer> westBorder) {
		if (estBorder.contains(startStone)) {
			direction = "leftToRight";
		}
		if (westBorder.contains(startStone)) {
			direction = "rightToLeft";
		}
	}

	public String getDirection() {
		return direction;
	}

}
