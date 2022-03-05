package creational.factory;

public class VegPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepared VegPizza");
	}

	@Override
	public void bake() {
		System.out.println("Baked VegPizza");		
	}

	@Override
	public void pack() {
		System.out.println("Packed VegPizza");
	}

}
