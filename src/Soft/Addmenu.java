package Soft;

import java.util.Scanner;

public class Addmenu {
	Scanner scan = new Scanner(System.in);
	private String select = null;
	public boolean addmenu(Cafe1 cafe1,Reservationseats reserve) {//cafe1 기준
		while(true) {
			System.out.print("추가 주문 하시겠습니까?(Y/N) :");
			try{
				select = scan.nextLine();
			}
			catch(Exception e) {
				
			}
			if((select.equals("y") || select.equals("Y"))) {
				System.out.println("추가주문을 선택 하셨습니다.");
				cafe1.menu_show();
				if(cafe1.select_menu()!=0) {//주문가격이 0이 아닐때
					if(reserve.get_checksit() == false) {
						reserve.reserve();
					}
				}
				else {
					System.out.println("주문한 메뉴가 없습니다. 프로그램을 종료합니다.");
					return false;
				}
				return true;
			}
			else if((select.equals("n") || select.equals("N"))) {
				System.out.println("이용해 주셔서 감사합니다.");
				return false;
			}
			else {
				System.out.println("입력이 잘못 되었습니다.");
			}
		}
	}
	
	public boolean addmenu2(Cafe2 cafe2,Reservationseats reserve) {//cafe1 기준
		while(true) {
			System.out.print("추가 주문 하시겠습니까?(Y/N) :");
			try{
				select = scan.nextLine();
			}
			catch(Exception e) {
				
			}
			if((select.equals("y") || select.equals("Y"))) {
				System.out.println("추가주문을 선택 하셨습니다.");
				cafe2.menu_show();
				if(cafe2.select_menu()!=0) {//주문가격이 0이 아닐때
					if(reserve.get_checksit() == false) {
						reserve.reserve();
					}
				}
				else {
					System.out.println("주문한 메뉴가 없습니다. 프로그램을 종료합니다.");
					return false;
				}
				return true;
			}
			else if((select.equals("n") || select.equals("N"))) {
				System.out.println("이용해 주셔서 감사합니다.");
				return false;
			}
			else {
				System.out.println("입력이 잘못 되었습니다.");
			}
		}
	}

}
