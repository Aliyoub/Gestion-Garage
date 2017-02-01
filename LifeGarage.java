package co.simplon.lifegarage;

import java.util.List;
import java.util.Arrays;

public class LifeGarage {

	public static void main(String[] args) {
		Garage garage = new Garage("garage"); 			
		
		// Ajout et affichage de la voiture Renault
		Car renault1 = new Car("renault",Color.RED, 999.9f); // Création (instanciation de la voiture)			
		garage.addCar(renault1);

		System.out.println(renault1.getBrand()+' '+renault1.getColor()+' '+renault1.getPrice() + "\n");
		

		// Ajout et affichage des voitures Peugeot, Volkswagen, Renault
		Car peugeot1 = new Car("peugeot",Color.GREEN, 1000f);
		Car volkswagen1 = new Car("volkswagen",Color.BLUE, 1500f);
		Car renault2 = new Car("renault",Color.RED, 2000.5f);
		List<Car> cars= Arrays.asList(peugeot1,volkswagen1,renault2);
		garage.addCar(cars);	// Ajout des voitures dans le garage

		for(Car car : cars){
			System.out.println(car.getBrand()+' '+car.getColor()+' '+car.getPrice()); // Affichage effective des voitures
		}

		System.out.println("\n /*************	Partie Abstrait	***********************************/");

		// Ajout des motos dans le garage
		Bike harley1 = new Bike("harley",Color.RED, 800f);
		Bike ducati1 = new Bike("ducati", Color.BLUE, 1000f);
		Bike bmw1 = new Bike("bmw", Color.GREEN, 1999.9f);
		List<Bike> bikes= Arrays.asList(harley1,ducati1,bmw1);
		garage.addBike(bikes);

		// Affichage des véhicules dans le garage avec leurs prix taxés
		System.out.println(cars+" \n"+bikes);
	}
}
