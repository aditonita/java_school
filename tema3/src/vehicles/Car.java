/**
 * 
 */
package vehicles;

/**
 * @author adi
 *
 */
public abstract class Car {

	private float fuelTankSize;
	private Fuel fuelType;
	private int gear;
	private int gears;
	private float consumptionPer100Km;

	private float availableFuel;
	private Tire tireSize;

	private String chassisNumber;

	private Car(float availableFuel, String chassisNumber) {
		this.availableFuel = availableFuel;
		this.chassisNumber = chassisNumber;
		this.tireSize = Tire.R10;
	}

	public Car(float availableFuel, String chassisNumber, Tire tireSize) {
		this(availableFuel, chassisNumber);
		this.tireSize = tireSize;
	}

	/**
	 * @return instant instantConsumption function of gear
	 */
	private float instantConsumtion(int gear) {
		if (gear == 0) {
			return this.consumptionPer100Km / 100;
		} else {
//			System.out.println("consum insant: "
//					+ (((gears / gear - 1) * 0.1f) * this.consumptionPer100Km + this.consumptionPer100Km));
			return ((gears / gear - 1) * 0.1f) * this.consumptionPer100Km + this.consumptionPer100Km;
		}
	}

	private float riseConsumtion(Tire tireType) {
		return this.consumptionPer100Km * tireType.getTireType() * 0.1f;
	}

	public void start() {
		this.gear = 0;
		if (this.availableFuel == 0 || this.fuelTankSize == 0) {
			stop(0f);
		}
//		System.out.println("gear " + this.gear);
	}

	public float shiftGear(int gear) {
		if (gear >= 0 && gear < this.gears) {
			this.gear = gear;
		}
		return instantConsumtion(this.gear) + riseConsumtion(this.tireSize);
	}

	public float drive(double miliseconds) {
		if (this.gear == 0) {
//			System.out.println(miliseconds +"milis: "+(float) ((instantConsumtion(this.gear) * miliseconds / 1000)));
			return (float) ((instantConsumtion(this.gear) * miliseconds / 1000));
		} else {
			return 0f;
		}
	}

	public float drive(float distance) {
		if (this.gear != 0) {
//			System.out.println(distance + "dist: "
//					+ (float) ((instantConsumtion(this.gear) + riseConsumtion(this.tireSize)) * distance));
			return (float) ((instantConsumtion(this.gear) + riseConsumtion(this.tireSize)) * distance / 100);
		} else {
			return 0f;
		}
	}

	public void stop(float fuel) {
		System.out.println("-------------------------\n" + getClass().getName());
		float fuelInTank = this.availableFuel - fuel;
		System.out.println("Total consumption is: " + (fuelInTank > 0 ? fuel : this.availableFuel));
		this.availableFuel = fuelInTank > 0 ? fuelInTank : 0f;
		System.out.println("Available fuel in tank: " + this.availableFuel);
	}

	public Fuel getFuelType() {
		return fuelType;
	}

	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public float getFuelTankSize() {
		return fuelTankSize;
	}

	public void setFuelTankSize(float fuelTankSize) {
		this.fuelTankSize = fuelTankSize;
	}

	public float getAvailableFuel() {
		return availableFuel;
	}

//	public void setAvailableFuel(float availableFuel) {
//		this.availableFuel = availableFuel;
//	}

	public void setTireSize(Tire tireSize) {
		this.tireSize = tireSize;
	}

	public void setConsumptionPer100Km(float consumptionPer100Km) {
		this.consumptionPer100Km = consumptionPer100Km;
	}

}
