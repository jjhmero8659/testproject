package software;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(Menu mi) {
		name = mi.getName();
		price = mi.getPrice();
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
