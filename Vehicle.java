package co.simplon.lifegarage;

public abstract class Vehicle {
	
	protected abstract String getBrand();
	protected abstract String getColor();
	protected abstract float getPriceWithTaxe();

	@Override
	public String toString() {
		return "Vehicle [brand=" + getBrand() + ", color=" + getColor() + ", getPriceWithTaxe()="
				+ getPriceWithTaxe() + "]";
	}
	
}
