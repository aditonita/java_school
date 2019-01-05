package vehicles;

public class Dacia extends Car {

	private	Dacia(float availableFuel, String chassisNumber, Tire tireSize) {
		super(availableFuel, chassisNumber, tireSize);
		if (availableFuel > super.getFuelTankSize()) {
			availableFuel = super.getFuelTankSize();
		}
	}

	public Dacia(float availableFuel, String chassisNumber, Fuel fuelType) {
		this(availableFuel, chassisNumber, Tire.R14);
		super.setFuelType(fuelType);
		super.setGears(4);
		super.setConsumptionPer100Km(7.5f);
		switch (fuelType) {
		case Petrol:
			super.setFuelTankSize(0f);
			break;
		case Diesel:
			super.setFuelTankSize(42f);
			break;
		case Gasoline:
			super.setFuelTankSize(38f);
			break;
		case ButanGas:
			super.setFuelTankSize(0f);
			break;
		case UnleadGasoline:
			super.setFuelTankSize(0f);
			break;
		case PetrolAndGas:
			super.setFuelTankSize(0f);
			break;
		}
	}
}
