package co.simplon.lifegarage;

public class Bike extends Vehicle {

	public Bike(String brand, Color color, float price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public float getPriceWithTaxe() {
		float tax = 1f;
		return price + tax;
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
}
