package creational.factory;

import java.util.Scanner;

public class PizzaStore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PizzaFactory p = new PizzaFactory();
		String type = sc.nextLine();
		p.orderPizza(type);
		sc.close();
	}

}
