package software;

public class DrinkItem {
	Menu[] drink = new Menu[5];

	public DrinkItem() {
		drink[0] = new Menu("아메리카노",1000);
		drink[1] = new Menu("카페라떼",1500);
		drink[2] = new Menu("핫초코",1200);
		drink[3] = new Menu("에이드",2000);
		drink[4] = new Menu("스무디",2000);
	}
	public void showItem() {
		System.out.println("==========음료==========");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d. %s : %d\n",i+1,drink[i].getName(),drink[i].getPrice());
		}
	}
	public Menu choose(int index) {
		return drink[index];
	}
	
	
}
