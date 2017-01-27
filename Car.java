package co.simplon.lifegarage;

public class Car {
	
	private String brand;	
	private enum Color {ROUGE, VERT, BLEU};
	private double price; 	
	private Color color;
	
	
	public Car(String brand, String color, double price) {
		
		this.brand = brand;
		this.color = Color.valueOf(color);
		this.price = price;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}


	public String getBrand() {
		return brand;
	}


	public double getPrice() {
		return price;
	}


	public Color getColor() {
		return color;
	}
	
}
