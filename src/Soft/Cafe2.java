package Soft;

import java.util.Scanner;

public class Cafe2 {
	Menu[] menu = new Menu[5];
	int total = 0;
	String[] menu_arr = new String[10];
	int[] menu_arri = new int[10];
	public Cafe2() {
		menu[0] = new Menu("�Ƹ޸�ī��",1000);
		menu[1] = new Menu("ī��� ",2000);
		menu[2] = new Menu("�����̵�",2000);
		menu[3] = new Menu("���⽺����",2500);
		menu[4] = new Menu("������Ƽ",2500);
		
	}
	public void menu_show() {
		System.out.println("=====���� Cafe�Դϴ�====");
		System.out.println("�޴��� ����ּ���");
		for(int i =0; i<5; i++) {
			System.out.printf("%d. %s  %d\n",i+1,menu[i].getName(),menu[i].getPrice());
		}
	}
	public void select_menu() {
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
	}
}
