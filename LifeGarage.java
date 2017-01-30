package co.simplon.lifegarage;

import java.util.List;
import java.util.ArrayList;

public class LifeGarage {

	public static void main(String[] args) {
		
		// Ajout et affichage de la voiture Renault
		Car renault1 = new Car("renault",Color.RED, 999.9f); // Création (instanciation de la voiture)
				
		List<Car> cars = new ArrayList<>();		
		cars.add(renault1);
		System.out.println(renault1.getBrand()+' '+renault1.getColor()+' '+renault1.getPrice() + "\n");
		
		// Ajout et affichage des voitures Peugeot, Volkswagen, Renault
		Car peugeot1 = new Car("peugeot",Color.GREEN, 1000);
		Car volkswagen1 = new Car("volkswagen",Color.BLUE, 1500);
		Car renault2 = new Car("renault",Color.RED, 2000.5f);
		
		cars.add(peugeot1);
		cars.add(volkswagen1);
		cars.add(renault2);
		
		Garage garage = new Garage("garage"); // 
		garage.addCar(cars);	// Ajout des voitures dans le garage
		
 
		for(Car car : cars){
			System.out.println(car.getBrand()+' '+car.getColor()+' '+car.getPrice()); // Affichage effective des voitures
		}
		
		System.out.println("\n /*************	Partie Abstrait	***********************************/");
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		// Ajout des véhicules dans le garage
		vehicles.add(new Car("renault",Color.RED, 999.9f));
		
		vehicles.add(new Car("peugeot",Color.GREEN, 1000));
		vehicles.add(new Car("volkswagen",Color.BLUE, 1500));
		vehicles.add(new Car("renault",Color.RED, 2000.5f));		
		
		vehicles.add(new Bike("harley",Color.RED, 800f));		
		vehicles.add(new Bike("ducati", Color.BLUE, 1000f));
		vehicles.add(new Bike("bmw", Color.GREEN, 1999.9f));
		
		
		garage.addVehicle(vehicles);
		
		
		// Affichage des véhicules dans le garage avec leurs prix taxés
		for(Vehicle vehicle : vehicles){
			System.out.println(vehicle.toString());
		}		
		
	}

}
