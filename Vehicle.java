package co.simplon.lifegarage;

public abstract class Vehicle {
	protected  String brand;
	protected  Color color;
	protected  float price;
	
	protected abstract float getPriceWithTaxe();
		
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", color=" + color + ", getPriceWithTaxe()="
				+ getPriceWithTaxe() + "]";
	}
}
