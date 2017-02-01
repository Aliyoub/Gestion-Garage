package co.simplon.lifegarage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private String name;
    private List<Car> cars = new ArrayList<>();
    private List<Bike> bikes = new ArrayList<>();  
    

	public Garage(String name) {
		this.name = name;
	}

	public void addCar(Car car){
		this.cars.add(car);
	}
	
	public void addCar(List<Car> cars){
		this.cars.addAll(cars);
	}	

	public void addBike(List<Bike> bikes){
		this.bikes.addAll(bikes);
	}

}
