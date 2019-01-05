package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public static void main(String[] args) throws Throwable {
		float consumFuel = 0f;

		Dacia dacia = new Dacia(15f,"OT-44-ABC",Fuel.Gasoline);
		Logan logan = new Logan(38f,"AG-10-RGF",Fuel.Diesel);
		VWGolf vwgolf = new VWGolf(22f,"B-34-TRF",Tire.R15);
		VWGolf vwgolf2 = new VWGolf(26f,"BV-11-DSR",Tire.R18);
		VWPassat vwpassat = new VWPassat(33.4f,"CJ-08-NGT",Tire.R20);
		CKlasse cklasse = new CKlasse(100f,"IS-01-HTY",Tire.R16);
		SKlasse sklasse = new SKlasse(34.7f,"SV-01-JTY",Tire.R17);
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(dacia);
		carList.add(logan);
		carList.add(vwgolf);
		carList.add(vwgolf2);
		carList.add(vwpassat);
		carList.add(cklasse);
		carList.add(sklasse);
		
		for(Car car : carList) {
		car.start();
		consumFuel = consumFuel + car.drive(2000d);
		car.shiftGear(1);
		consumFuel = consumFuel + car.drive(1.4f);
		car.shiftGear(2);
		consumFuel = consumFuel + car.drive(2.6f);
		car.shiftGear(3);
		car.drive(5000d);
		consumFuel = consumFuel + car.drive(4f);
		car.shiftGear(4);
		car.drive(7000d);
		consumFuel = consumFuel + car.drive(3.4f);
		car.shiftGear(5);
		consumFuel = consumFuel + car.drive(2.16f);
		car.shiftGear(6);
		consumFuel = consumFuel + car.drive(1.34f);
		car.shiftGear(5);
		consumFuel = consumFuel + car.drive(11f);
		car.shiftGear(4);
		consumFuel = consumFuel + car.drive(7.9f);
		car.shiftGear(0);
		car.drive(10000d);
		car.stop(consumFuel);
		}
	}
	
}
