package co.simplon.lifegarage;

public class Car extends Vehicle{
	private float taxe = 2;

	public Car(String b, Color c, float p) {

		brand = b;
		color = c;
		price = p;
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
		return price + this.taxe;
	}
}