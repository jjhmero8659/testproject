package software;

public class DrinkItem {
	Menu[] drink = new Menu[5];

	public DrinkItem() {
		drink[0] = new Menu("�Ƹ޸�ī��",1000);
		drink[1] = new Menu("ī���",1500);
		drink[2] = new Menu("������",1200);
		drink[3] = new Menu("���̵�",2000);
		drink[4] = new Menu("������",2000);
	}
	public void showItem() {
		System.out.println("==========����==========");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d. %s : %d\n",i+1,drink[i].getName(),drink[i].getPrice());
		}
	}
	public Menu choose(int index) {
		return drink[index];
	}
	
	
}
