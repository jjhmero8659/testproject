package cafe;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu m) {
		m.showMenus();

		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;

		while(mi == null) {
			// ä���
			System.out.print("�޴���ȣ�� �Է����ּ��� :");
			scan.nextInt();
			//mi = new MenuItem
		}
		scan.close();
		return mi;
	}

	void drinkCoffee(Coffee coffee) {
		String name = coffee.getName();
		System.out.println(name+"(��)�� ���Ŵ�.");

	}

}
