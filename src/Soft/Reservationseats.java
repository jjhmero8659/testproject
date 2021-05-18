package Soft;

import java.util.Scanner;

public class Reservationseats {
	private int max = 10;
	private int min = 1;
	private boolean check_sit;
	private int cus_sit=0;
	private String scus_sit=null;
	private int[] sits = new int[10];
	private int[] sits_empty = new int[3];
	Scanner scan = new Scanner(System.in);
	private String select = null;
	
	public Reservationseats() {
		for(int i=0; i<10; i++) {
			sits[i] = i;
		}
	}
	public boolean get_checksit() {
		return check_sit;
	}
	
	public boolean reserve(){
	while(true) {
		System.out.print("좌석을 예매 하시겠습니까?(Y/N) :");
		try {
			select = scan.nextLine();
		}
		catch(Exception e) {
			System.out.println("입력이 잘못 되었습니다.");
		}
		if((select.equals("y") || select.equals("Y"))==true) {
			System.out.println("좌석 예약을 선택 하셨습니다.");
			rand_sits();
			check_sit = true;
			return true;
		}
		else if((select.equals("n") || select.equals("N"))==true) {
			check_sit = false;
			return false;
		}
	}
	}
	
	public int rand_sits(){
		for(int i=0; i<2; i++) {
			sits_empty[i] = (int) (Math.random()*(max-min)+min+1);
			for(int j = 0; j<i; j++) {
				if(sits_empty[j] == sits_empty[i]) {
					i--;
					break;
				}
			}
			
		}
		System.out.println("==========================");
		System.out.println("현재 비어 있는 좌석의 번호는 :"+sits_empty[0]+", "+sits_empty[1]);
		while(true) {
			try {
				System.out.print("좌석을 입력해주세요 :");
				scus_sit = scan.nextLine();
				cus_sit = Integer.parseInt(scus_sit);
			}
			catch(Exception e) {
				System.out.println("입력이 잘못되었습니다.");
			}
			if((cus_sit == sits_empty[0]||cus_sit == sits_empty[1])) {
				System.out.println("좌석을 예약 하였습니다.");
				System.out.println("==========================");
				return cus_sit;
			}
			else {
				System.out.println("비어있는 좌석의 번호가 아닙니다.");
			}
		}
	}
	
}
