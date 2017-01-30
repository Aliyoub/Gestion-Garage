package co.simplon.lifegarage;

import java.util.List;

public class Garage {
	private String name;
	private List<Car> cars ;
	private List<Vehicle> vehicles ;

	public Garage(String name) {
		this.name = name;
	}

	public void addCar(List<Car> cars){
		this.cars = cars;
	}

	public void addVehicle(List<Vehicle> vehicles){
		this.vehicles = vehicles;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}
}
