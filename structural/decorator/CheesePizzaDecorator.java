package structural.decorator;

public class CheesePizzaDecorator extends PizzaDecorator {

	public CheesePizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	public void bake() {
		super.bake();
		System.out.println("Add cheese burst");
	}
}
