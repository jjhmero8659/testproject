package Soft;

import java.util.Scanner;

public class Cafe1 {
	Menu[] menu = new Menu[5];
	private int total = 0;
	String[] menu_arr = new String[10];
	int[] menu_arri = new int[10];
	public Cafe1() {
		menu[0] = new Menu("�Ƹ޸�ī��",1000);
		menu[1] = new Menu("ī��� ",2000);
		menu[2] = new Menu("�����̵�",2000);
		menu[3] = new Menu("���⽺����",2500);
		menu[4] = new Menu("������Ƽ",2500);
		
	}
	public void menu_show() {
		System.out.println("=====����Ʈ���� Cafe�Դϴ�====");
		System.out.println("�޴��� ����ּ���");
		for(int i =0; i<5; i++) {
			System.out.printf("%d. %s  %d\n",i+1,menu[i].getName(),menu[i].getPrice());
		}
	}
	public int select_menu() {
			Scanner scan = new Scanner(System.in);
			String select = null;
			while(true) {
					System.out.print("�Է�(�ֹ��� �ߴ��Ϸ��� q�� �Է����ּ���) :");
					try {
					select = scan.nextLine();
					if((select.equals("q")||select.equals("Q"))==false) {
						menu_arri[Integer.parseInt(select)-1]++;
						System.out.printf("%s �ֹ�!\n",menu[Integer.parseInt(select)-1].getName());
						total += menu[Integer.parseInt(select)-1].getPrice();
					}
					else if((select.equals("q")||select.equals("Q"))==true) {
						System.out.println("�ֹ��� �ߴ��ϰڽ��ϴ�.");	
						break;
					}
					}
					catch(Exception e) {
						System.out.println("�Է��� �߸��Ǿ����ϴ�.");
					}
				}
			for(int i =0; i<5; i++) {
				System.out.printf("%s :%d\n",menu[i].getName(),menu_arri[i]);
			}
			System.out.println("�� ���� :"+total);
			return total;
	}
	public int get_total() {
		return total;
	}
	public boolean refuse(Cafe1 cafe1,Payment pay) {
		System.out.println("======����Ʈ���� ���� Cafe======");
		System.out.println("�ֹ��� �����Ͻðڽ��ϱ�? (Y/N) :");
		String refuse = null;
		Scanner scan = new Scanner(System.in);
		try {
			refuse = scan.nextLine();
		}
		catch(Exception e) {
			System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
		}
		if((refuse.equals("y")||refuse.equals("Y"))==true) {
			System.out.println("�ֹ��� ���� �ϼ̽��ϴ�.");
			System.out.println("============================");
			System.out.println("ī���� �������� ���� �ֹ��� �����Ǿ����ϴ�.");
			System.out.println("�ݾ��� ��ȯ �˴ϴ�.");
			System.out.println(cafe1.get_total());
			return false;
		}
		else {
			System.out.println("�ֹ��� ���� �ϼ̽��ϴ�.");
			System.out.println("============================");
			return true;
		}	
	}
}

