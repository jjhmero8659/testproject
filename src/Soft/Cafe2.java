package Soft;

import java.util.Scanner;

public class Cafe2 {
	Menu[] menu = new Menu[5];
	int total = 0;
	String[] menu_arr = new String[10];
	int[] menu_arri = new int[10];
	public Cafe2() {
		menu[0] = new Menu("아메리카노",1000);
		menu[1] = new Menu("카페라떼 ",2000);
		menu[2] = new Menu("레몬에이드",2000);
		menu[3] = new Menu("딸기스무디",2500);
		menu[4] = new Menu("흑당버블티",2500);
		
	}
	public void menu_show() {
		System.out.println("=====설계 Cafe입니다====");
		System.out.println("메뉴를 골라주세요");
		for(int i =0; i<5; i++) {
			System.out.printf("%d. %s  %d\n",i+1,menu[i].getName(),menu[i].getPrice());
		}
	}
	public void select_menu() {
			Scanner scan = new Scanner(System.in);
			String select = null;
			while(true) {
					System.out.print("입력(주문을 중단하려면 q를 입력해주세요) :");
					try {
					select = scan.nextLine();
					if((select.equals("q")||select.equals("Q"))==false) {
						menu_arri[Integer.parseInt(select)-1]++;
						System.out.printf("%s 주문!\n",menu[Integer.parseInt(select)-1].getName());
						total += menu[Integer.parseInt(select)-1].getPrice();
					}
					else if((select.equals("q")||select.equals("Q"))==true) {
						System.out.println("주문을 중단하겠습니다.");	
						break;
					}
					}
					catch(Exception e) {
						System.out.println("입력이 잘못되었습니다.");
					}
				}
			for(int i =0; i<5; i++) {
				System.out.printf("%s :%d\n",menu[i].getName(),menu_arri[i]);
			}
			System.out.println("총 가격 :"+total);
	}
}
