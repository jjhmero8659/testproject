package Soft;

import java.util.Scanner;

public class Reservationseats {
	private int max = 10;
	private int min = 1;
	int[] sits = new int[10];
	int[] sits_empty = new int[3];
	Scanner scan = new Scanner(System.in);
	String select = null;
	
	public Reservationseats() {
		for(int i=0; i<10; i++) {
			sits[i] = i;
		}
	}
	
	public void reserve(){
	while(true) {
		System.out.println("�¼��� ���� �Ͻðڽ��ϱ�?(Y/N)");
		try {
			select = scan.nextLine();
		}
		catch(Exception e) {
			System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
		}
		if((select == "y" || select == "Y")==true) {
			System.out.println("�¼� ���Ÿ� ���� �ϼ̽��ϴ�.");
			rand_sits();
		}
		else if((select == "n" || select == "N")==true) {
			break;
		}
	}
	}
	
	public void rand_sits(){
		for(int i=0; i<2; i++) {
			for(int j = i; j<3; j++) {
				sits_empty[i] = (int) (Math.random()*(max-min)+min);
				if(sits_empty[j] == sits_empty[i]) {
					i--;
				}
			}
			
		}
		System.out.println("���� ��� �ִ� �¼��� ��ȣ�� :"+sits_empty[0]+", "+sits_empty[1]+", "+sits_empty[2]);
		while(true) {
			try {
				System.out.println("�¼��� �Է����ּ���");
				scan.nextInt();
			}
			catch(Exception e) {
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
		}
	}
	public int select_sit() {
		
		
		return 0;
	}
}
