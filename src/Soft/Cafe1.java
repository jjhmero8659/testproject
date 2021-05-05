package Soft;

import java.util.Scanner;

public class Cafe1 {
	Menu[] menu = new Menu[5];
	private int total = 0;
	//String[] menu_arr = new String[10];
	int[] menu_arri = new int[10];
	public Cafe1() {
		menu[0] = new Menu("아메리카노",1000);
		menu[1] = new Menu("카페라떼 ",2000);
		menu[2] = new Menu("레몬에이드",2000);
		menu[3] = new Menu("딸기스무디",2500);
		menu[4] = new Menu("흑당버블티",2500);
		
	}
	public void menu_show() {
		System.out.println("=====소프트웨어 Cafe입니다====");
		System.out.println("메뉴를 골라주세요");
		System.out.println("==========================");
		for(int i =0; i<5; i++) {
			System.out.printf("%d. %s  %d\n",i+1,menu[i].getName(),menu[i].getPrice());
		}
	}
	public int select_menu() {
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
						System.out.println("==========================");
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
			System.out.println("==========================");
			return total;
	}
	public int get_total() {
		return total;
	}
	public boolean refuse(Cafe1 cafe1,Payment pay) {
		System.out.println("======소프트웨어 설계 Cafe======");
		System.out.print("주문을 거절하시겠습니까? (Y/N) :");
		String refuse = null;
		Scanner scan = new Scanner(System.in);
		try {
			refuse = scan.nextLine();
		}
		catch(Exception e) {
			System.out.println("입력이 잘못 되었습니다.");
		}
		if((refuse.equals("y")||refuse.equals("Y"))==true) {
			System.out.println("주문을 거절 하셨습니다.");
			System.out.println("============================");
			System.out.println("카페의 사정으로 인해 주문이 거절되었습니다.");
			System.out.println("금액이 반환 됩니다.");
			System.out.println(cafe1.get_total());
			System.out.println("==========================");
			return false;
		}
		else {
			System.out.println("주문을 접수 하셨습니다.");
			System.out.println("============================");
			return true;
		}	
	}
	public void sendmessage(CheckTime time) {
		if(time.get_minute() >= 5) {
				System.out.println("==========================");
				System.out.println("======처음 주문한 메뉴======");
			for(int i = 0; i< 10; i++) {
				if(menu_arri[i]!=0) {
					System.out.println(menu[i].getName()+" : "+menu_arri[i]+"개");
				}
				
			}
			System.out.println("==========================");
			System.out.println("메뉴가 도착 전에 제조가 완료됩니다.");
			System.out.println("==========================");
			}
	}
	public void send_addmessage(CheckTime time) {
		if(time.get_minute() >= 5) {
				System.out.println("==========================");
				System.out.println("======추가 주문한 메뉴======");
			for(int i = 0; i< 10; i++) {
				if(menu_arri[i]!=0) {
					System.out.println(menu[i].getName()+" : "+menu_arri[i]+"개");
				}
				
			}
			System.out.println("==========================");
			System.out.println("메뉴가 도착 전에 제조가 완료됩니다.");
			System.out.println("==========================");
			}
	}
}

