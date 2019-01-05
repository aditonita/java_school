/**
 * 
 */
package vehicles;

/**
 * @author adi
 *
 */
public class Logan extends Dacia {

	/**
	 * @param availableFuel
	 * @param chassisNumber
	 * @param fuelType
	 */
	public Logan(float availableFuel, String chassisNumber, Fuel fuelType) {
		super(availableFuel, chassisNumber, fuelType);
		super.setTireSize(Tire.R16);
		super.setGears(5);
		super.setConsumptionPer100Km(6.5f);
		switch (fuelType) {
		case Petrol:
			super.setFuelTankSize(0f);
			break;
		case Diesel:
			super.setFuelTankSize(42f);
			break;
		case Gasoline:
			super.setFuelTankSize(0f);
			break;
		case ButanGas:
			super.setFuelTankSize(28f);
			break;
		case UnleadGasoline:
			super.setFuelTankSize(40f);
			break;
		case PetrolAndGas:
			super.setFuelTankSize(54f);
			break;
		}
	}
	
	

}
