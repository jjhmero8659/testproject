package software;


import java.util.Scanner;

public class Customer {
	public Menu order(DrinkItem dk) {//�޴��ֹ�
		dk.showItem();
		String number;
		int inumber;
		Scanner scan = new Scanner(System.in);
		Menu menu = null;
		while(menu == null) {
			
			System.out.print("���Ḧ ���� �� �ּ��� :");
			try{
				number = scan.next();
				inumber = Integer.parseInt(number);
				menu = dk.choose(inumber-1);
			}
			catch(Exception e) {
				System.out.print("�Է��� �߸� �Ǿ����ϴ�.\n�ٽ��Է����ּ���");
			}
			System.out.print("���Ḧ ���� �� �ּ��� :");
			try{
				number = scan.next();
				inumber = Integer.parseInt(number);
				menu = dk.choose(inumber-1);
			}
			catch(Exception e) {
				System.out.print("�Է��� �߸� �Ǿ����ϴ�.\n�ٽ��Է����ּ���");
			}
			
		}
		scan.close();
		return menu;//�޴� ��ȯ
	}
	
	
		
	
	void drinkCoffee(Coffee coffee) {
		String name = coffee.getName();
		System.out.println(name+"(��)�� ���Ŵ�.");
		
	}
}
