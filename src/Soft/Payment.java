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
			System.out.print("���� �����ϰ� �ִ� �ݾ��� �Է����ּ��� :");
			money = scan.nextLine();
			cus_money = Integer.parseInt(money);
			if(cus_money < cafe1.get_total()) {
				System.out.println("�ֹ��� �޴����� ������ �ݾ��� �����մϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				result = false;
			}
			}
			catch(Exception e){
				System.out.println("�ݾ� �Է��� �߸��Ǿ����ϴ�.");
			}
		}
		return result;
	}
	
	
	public boolean check_cusmoney2(Cafe2 cafe2){
		boolean result = true;
		while(cus_money == 0) {
			try {
			System.out.print("���� �����ϰ� �ִ� �ݾ��� �Է����ּ��� :");
			money = scan.nextLine();
			cus_money = Integer.parseInt(money);
			if(cus_money < cafe2.get_total()) {
				System.out.println("�ֹ��� �޴����� ������ �ݾ��� �����մϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				result = false;
			}
			}
			catch(Exception e){
				System.out.println("�ݾ� �Է��� �߸��Ǿ����ϴ�.");
			}
		}
		return result;
	}
	public int pay_cafe1(Cafe1 cafe1) {
		if(cus_money > cafe1.get_total()) {
			System.out.print("�ֹ��� �޴��� ������ ������ �Ž����� �Դϴ�. :");
			System.out.println(cus_money - cafe1.get_total());
		}
		return 0;
	}
	public int pay_cafe2(Cafe2 cafe2) {
		if(cus_money > cafe2.get_total()) {
			System.out.print("�ֹ��� �޴��� ������ ������ �Ž����� �Դϴ�. :");
			System.out.println(cus_money - cafe2.get_total());
		}
		return 0;
	}
	
}
