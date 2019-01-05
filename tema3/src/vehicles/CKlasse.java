package vehicles;

public class CKlasse extends Car {

	public CKlasse(float availableFuel, String chassisNumber, Tire tireSize) {
		super(availableFuel, chassisNumber, tireSize);
		super.setConsumptionPer100Km(7.2f);
		super.setFuelTankSize(45f);
		super.setFuelType(Fuel.Gasoline);
		super.setGears(4);
		super.setTireSize(Tire.R16);
	}

}
