package Soft;

import java.util.Scanner;

public class Payment {
	private String money;
	private int cus_money = 0;

	Scanner scan = new Scanner(System.in);
	public boolean check_cusmoney1(Cafe1 cafe1){
		boolean result = true;
		while(cus_money == 0) {
			try {
			System.out.print("현재 보유하고 있는 금액을 입력해주세요 :");
			money = scan.nextLine();
			cus_money = Integer.parseInt(money);
			if(cus_money < cafe1.get_total()) {
				System.out.println("주문한 메뉴보다 보유한 금액이 부족합니다.");
				System.out.println("프로그램을 종료합니다.");
				result = false;
			}
			}
			catch(Exception e){
				System.out.println("금액 입력이 잘못되었습니다.");
			}
		}
		return result;
	}
	
	
	public boolean check_cusmoney2(Cafe2 cafe2){
		boolean result = true;
		while(cus_money == 0) {
			try {
			System.out.print("현재 보유하고 있는 금액을 입력해주세요 :");
			money = scan.nextLine();
			cus_money = Integer.parseInt(money);
			if(cus_money < cafe2.get_total()) {
				System.out.println("주문한 메뉴보다 보유한 금액이 부족합니다.");
				System.out.println("프로그램을 종료합니다.");
				result = false;
			}
			}
			catch(Exception e){
				System.out.println("금액 입력이 잘못되었습니다.");
			}
		}
		return result;
	}
	public int pay_cafe1(Cafe1 cafe1) {
		if(cus_money > cafe1.get_total()) {
			System.out.print("주문한 메뉴의 가격을 제외한 거스름돈 입니다. :");
			System.out.println(cus_money - cafe1.get_total());
		}
		return 0;
	}
	public int pay_cafe2(Cafe2 cafe2) {
		if(cus_money > cafe2.get_total()) {
			System.out.print("주문한 메뉴의 가격을 제외한 거스름돈 입니다. :");
			System.out.println(cus_money - cafe2.get_total());
		}
		return 0;
	}
	
}
