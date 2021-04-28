package software;


import java.util.Scanner;

public class Customer {
	public Menu order(DrinkItem dk) {//메뉴주문
		dk.showItem();
		String number;
		int inumber;
		Scanner scan = new Scanner(System.in);
		Menu menu = null;
		while(menu == null) {
			
			System.out.print("음료를 선택 해 주세요 :");
			try{
				number = scan.next();
				inumber = Integer.parseInt(number);
				menu = dk.choose(inumber-1);
			}
			catch(Exception e) {
				System.out.print("입력이 잘못 되었습니다.\n다시입력해주세요");
			}
			System.out.print("음료를 선택 해 주세요 :");
			try{
				number = scan.next();
				inumber = Integer.parseInt(number);
				menu = dk.choose(inumber-1);
			}
			catch(Exception e) {
				System.out.print("입력이 잘못 되었습니다.\n다시입력해주세요");
			}
			
		}
		scan.close();
		return menu;//메뉴 반환
	}
	
	
		
	
	void drinkCoffee(Coffee coffee) {
		String name = coffee.getName();
		System.out.println(name+"(을)를 마신다.");
		
	}
}
