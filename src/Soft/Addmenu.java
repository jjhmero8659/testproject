package Soft;

import java.util.Scanner;

public class Addmenu {
	Scanner scan = new Scanner(System.in);
	private String select = null;
	public boolean addmenu(Cafe1 cafe1,Reservationseats reserve) {//cafe1 ����
		while(true) {
			System.out.print("�߰� �ֹ� �Ͻðڽ��ϱ�?(Y/N) :");
			try{
				select = scan.nextLine();
			}
			catch(Exception e) {
				
			}
			if((select.equals("y") || select.equals("Y"))) {
				System.out.println("�߰��ֹ��� ���� �ϼ̽��ϴ�.");
				cafe1.menu_show();
				if(cafe1.select_menu()!=0) {//�ֹ������� 0�� �ƴҶ�
					if(reserve.get_checksit() == false) {
						reserve.reserve();
					}
				}
				else {
					System.out.println("�ֹ��� �޴��� �����ϴ�. ���α׷��� �����մϴ�.");
					return false;
				}
				return true;
			}
			else if((select.equals("n") || select.equals("N"))) {
				System.out.println("�̿��� �ּż� �����մϴ�.");
				return false;
			}
			else {
				System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
			}
		}
	}
	
	public boolean addmenu2(Cafe2 cafe2,Reservationseats reserve) {//cafe1 ����
		while(true) {
			System.out.print("�߰� �ֹ� �Ͻðڽ��ϱ�?(Y/N) :");
			try{
				select = scan.nextLine();
			}
			catch(Exception e) {
				
			}
			if((select.equals("y") || select.equals("Y"))) {
				System.out.println("�߰��ֹ��� ���� �ϼ̽��ϴ�.");
				cafe2.menu_show();
				if(cafe2.select_menu()!=0) {//�ֹ������� 0�� �ƴҶ�
					if(reserve.get_checksit() == false) {
						reserve.reserve();
					}
				}
				else {
					System.out.println("�ֹ��� �޴��� �����ϴ�. ���α׷��� �����մϴ�.");
					return false;
				}
				return true;
			}
			else if((select.equals("n") || select.equals("N"))) {
				System.out.println("�̿��� �ּż� �����մϴ�.");
				return false;
			}
			else {
				System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
			}
		}
	}

}
