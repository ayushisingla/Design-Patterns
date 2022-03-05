package structural.facade;

public class OrderFacade {

	public void processOrder(String name, int quantity) {
		OrderProcessor orderProcessor = new OrderProcessor();
		if (orderProcessor.checkStock()) {
			String orderId = orderProcessor.orderItem(name);
			orderProcessor.shipItem(orderId, quantity);
		}
	}
}
