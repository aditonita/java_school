package vehicles;

public enum Tire {
R10(1),
R12(2),
R13(3),
R14(4),
R15(5),
R16(6),
R17(7),
R18(8),
R19(9),
R20(10),
R22(11)
;

	private final int tireType;
	
	private Tire(int tireType) {
		this.tireType = tireType;
	}
	
	public int getTireType() {
		return this.tireType;
	}
	
}
