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
			System.out.print("도착까지 소요되는 Minutes 를 숫자만 입력해주세요 : ");
			try {
				minute = scan.nextLine();
				i_minute = Integer.parseInt(minute);
			}
			catch(Exception e){
				System.out.println("입력이 잘못되었습니다.");
				minute = "0";
			}
		}
		if(i_minute > 10) {
			System.out.println("입력된 시간이 최대 시간 10분을 초과합니다.");
			System.out.println("10분을 초과된 시간은 주문을 받지 않습니다.");
			result = false;
		}
		else{
			System.out.println("시간 입력이 완료 되었습니다.");
			System.out.println("==========================");
			result = true;
		}
		return result;
		
	}
}
