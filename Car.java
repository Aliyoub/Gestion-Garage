package co.simplon.lifegarage;

public class Car extends Vehicle{	
	private String brand;
	private Color color;	
	private float price;
	private float taxe = 2;

	public Car(String brand, Color color, float price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
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
	
	@Override
	public float getPriceWithTaxe() {
		return this.price + this.taxe;
	}
}