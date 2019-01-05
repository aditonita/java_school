package vehicles;

public class SKlasse extends CKlasse {

	public SKlasse(float availableFuel, String chassisNumber, Tire tireSize) {
		super(availableFuel, chassisNumber, tireSize);
		super.setConsumptionPer100Km(6.2f);
		super.setFuelTankSize(50f);
		super.setFuelType(Fuel.Diesel);
		super.setGears(6);
		super.setTireSize(Tire.R17);
	}

}
