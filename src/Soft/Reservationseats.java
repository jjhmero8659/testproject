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
		System.out.println("좌석을 예매 하시겠습니까?(Y/N)");
		try {
			select = scan.nextLine();
		}
		catch(Exception e) {
			System.out.println("입력이 잘못 되었습니다.");
		}
		if((select == "y" || select == "Y")==true) {
			System.out.println("좌석 예매를 선택 하셨습니다.");
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
		System.out.println("현재 비어 있는 좌석의 번호는 :"+sits_empty[0]+", "+sits_empty[1]+", "+sits_empty[2]);
		while(true) {
			try {
				System.out.println("좌석을 입력해주세요");
				scan.nextInt();
			}
			catch(Exception e) {
				System.out.println("입력이 잘못되었습니다.");
			}
		}
	}
	public int select_sit() {
		
		
		return 0;
	}
}
