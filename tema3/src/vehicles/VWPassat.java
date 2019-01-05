package vehicles;

public class VWPassat extends VWGolf {

	public VWPassat(float availableFuel, String chassisNumber, Tire tireSize) {
		super(availableFuel, chassisNumber, tireSize);
		super.setConsumptionPer100Km(5f);
		super.setFuelTankSize(42f);
		super.setFuelType(Fuel.Petrol);
		super.setGears(6);
		super.setTireSize(tireSize);
	}

}
