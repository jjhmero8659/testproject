package Soft;

import java.util.Scanner;

public class Payment {
	int cus_money = 0;
	Scanner scan = new Scanner(System.in);
	public void check_cusmoney1(Cafe1 cafe1){
		while(cus_money == 0) {
			try {
			System.out.print("���� �����ϰ� �ִ� �ݾ��� �Է����ּ��� :");
			cus_money = scan.nextInt();
			if(cus_money < cafe1.get_total()) {
				System.out.println("�ֹ��� �޴����� ������ �ݾ��� �����մϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			}
			catch(Exception e){
				System.out.println("�ݾ� �Է��� �߸��Ǿ����ϴ�.");
			}
		}
	}
	public void check_cusmoney2(Cafe2 cafe2){
		while(cus_money == 0) {
			try {
			System.out.print("���� �����ϰ� �ִ� �ݾ��� �Է����ּ��� :");
			cus_money = scan.nextInt();
				if(cus_money < cafe2.get_total()) {
					System.out.println("�ֹ��� �޴����� ������ �ݾ��� �����մϴ�.");
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}
			catch(Exception e){
				System.out.println("�ݾ� �Է��� �߸��Ǿ����ϴ�.");
			}
				
		}
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
