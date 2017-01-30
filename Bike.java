package co.simplon.lifegarage;

public class Bike extends Vehicle {
	private String brand;
	private Color color;
	private float price;
	private float taxe = 1;

	public Bike(String brand, Color color, float price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public float getPriceWithTaxe() {
		return this.price + this.taxe;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return this.color.getColorKey();
	}

	public float getPrice() {
		return price;
	}
}
