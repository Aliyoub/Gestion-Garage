package co.simplon.lifegarage;

public class Bike extends Vehicle {
	private float taxe = 1;

	public Bike(String b, Color c, float p) {
		super();
		brand = b;
		color = c;
		price = p;
	}

	@Override
	public float getPriceWithTaxe() {
		return price + this.taxe;
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
