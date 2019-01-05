package vehicles;

public class VWGolf extends Car {

	public VWGolf(float availableFuel, String chassisNumber, Tire tireSize) {
		super(availableFuel, chassisNumber, tireSize);
		
		super.setConsumptionPer100Km(5.5f);
		super.setFuelTankSize(40f);
		super.setFuelType(Fuel.Diesel);
		super.setGears(4);
		super.setTireSize(tireSize);
	}

}
