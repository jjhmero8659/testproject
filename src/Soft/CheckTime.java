package Soft;

import java.util.Scanner;

public class CheckTime {
	int minute = 0;
	public boolean check_time() {
		System.out.print("�������� �ҿ�Ǵ� Minutes �� ���ڸ� �Է����ּ��� : ");
		Scanner scan = new  Scanner(System.in);
		while(minute == 0)
		{
			try {
				minute = scan.nextInt();
			}
			catch(Exception e){
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
		}
		if(minute > 10) {
			System.out.println("�Էµ� �ð��� �ִ� �ð� 10���� �ʰ��մϴ�.");
			System.out.println("10���� �ʰ��� �ð��� �ֹ��� ���� �ʽ��ϴ�.");
			return false;
		}
		else{
			System.out.println("�ð� �Է��� �Ϸ� �Ǿ����ϴ�.");
			return true;
		}
	}
}
