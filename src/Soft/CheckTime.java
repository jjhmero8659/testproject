package Soft;

import java.util.Scanner;

public class CheckTime {
	private String minute = "0";
	private int i_minute;
	
	public int get_minute() {
		return i_minute;
	}
	public boolean check_time() {
		boolean result;
		Scanner scan = new  Scanner(System.in);
		while(minute == "0")
		{
			System.out.print("�������� �ҿ�Ǵ� Minutes �� ���ڸ� �Է����ּ��� : ");
			try {
				minute = scan.nextLine();
				i_minute = Integer.parseInt(minute);
			}
			catch(Exception e){
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
				minute = "0";
			}
		}
		if(i_minute > 10) {
			System.out.println("�Էµ� �ð��� �ִ� �ð� 10���� �ʰ��մϴ�.");
			System.out.println("10���� �ʰ��� �ð��� �ֹ��� ���� �ʽ��ϴ�.");
			result = false;
		}
		else{
			System.out.println("�ð� �Է��� �Ϸ� �Ǿ����ϴ�.");
			System.out.println("==========================");
			result = true;
		}
		return result;
		
	}
}
