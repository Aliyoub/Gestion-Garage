package co.simplon.lifegarage;

import java.util.List;
import java.util.ArrayList;

public class LifeGarage {

	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();
		
		Garage garage = new Garage("garage", cars);	

		garage.addCar("renault", "ROUGE", 999.9);
		garage.addCar("peugeot", "VERT", 6000);
		
		System.out.println(cars);

	}

}
