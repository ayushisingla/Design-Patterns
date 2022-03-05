package structural.decorator;

public class PizzaShop {

	public static void main(String[] args) {

		Pizza pizza = new CheesePizzaDecorator(new VeggiePizzaDecorator(new PlainPizza()));
		pizza.bake();
	}

}
