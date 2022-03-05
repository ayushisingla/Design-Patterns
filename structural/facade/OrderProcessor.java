package structural.facade;

public class OrderProcessor {

	public boolean checkStock() {
		System.out.println("checking stock");
		return true;
	}

	public String orderItem(String name) {
		System.out.println("Ordering item:" + name);
		return name;
	}

	public void shipItem(String orderId, int quantity) {
		System.out.println("Shipping order:" + orderId + " - " + quantity + "pieces");
	}
}
