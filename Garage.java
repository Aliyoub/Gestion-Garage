package co.simplon.lifegarage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private String name;
	private List<Car> cars = new ArrayList<>() ;
	
    public Garage(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

	public void addCar(String brand,String color,double price){
		this.cars.add(new Car(brand,color,price));
	}

}
