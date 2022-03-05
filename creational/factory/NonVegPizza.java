package creational.factory;

public class NonVegPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepared NonVegPizza");
	}

	@Override
	public void bake() {
		System.out.println("Baked NonVegPizza");		
	}

	@Override
	public void pack() {
		System.out.println("Packed NonVegPizza");
	}

}
