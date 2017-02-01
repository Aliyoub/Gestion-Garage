package co.simplon.lifegarage;

public class Car extends Vehicle{

	public Car(String brand, Color color, float price) {

		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color.getColorKey();
	}

	public float getPrice() {
		return price;
	}
	
	@Override
	public float getPriceWithTaxe() {
		float tax  = 2f;
		return price + tax;
	}
}