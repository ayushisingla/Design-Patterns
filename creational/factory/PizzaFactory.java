package creational.factory;

public class PizzaFactory {

	public Pizza orderPizza(String type) {
		Pizza p;
		if (type.equalsIgnoreCase("veg")) {
			p = new VegPizza();
		} else if (type.equalsIgnoreCase("nonveg")) {
			p = new NonVegPizza();
		} else {
			p = null;
		}
		p.prepare();
		p.bake();
		p.pack();
		return p;
	}

}
