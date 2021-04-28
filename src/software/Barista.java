package software;

public class Barista {
	public Coffee makeCoffee(Menu mi) {
		Coffee coffee = new Coffee(mi);
		return coffee;
	}
}
