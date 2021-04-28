package cafe;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu m) {
		m.showMenus();

		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;

		while(mi == null) {
			// 채우기
			System.out.print("메뉴번호를 입력해주세요 :");
			scan.nextInt();
			//mi = new MenuItem
		}
		scan.close();
		return mi;
	}

	void drinkCoffee(Coffee coffee) {
		String name = coffee.getName();
		System.out.println(name+"(을)를 마신다.");

	}

}
