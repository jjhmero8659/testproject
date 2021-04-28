package Soft;

import java.util.Scanner;

public class SelectCafe {
	public int Select_Cafe() {
		System.out.println("test");
		System.out.println("원하시는 카페를 선택해 주세요");
		System.out.println("1.소프트웨어 Cafe 2.설계 Cafe");
		Scanner scan = new Scanner(System.in);
		int select = 0;
		while(true) {
			try{
				System.out.print("입력 :");
				select = scan.nextInt();
				System.out.println(select);
			}
			catch(Exception e) {
				System.out.println("입력이 잘못되었습니다. 다시 입력해주세요");
			}
			if(select == 1) {
				break;
			} 
			else if(select == 2){				
				break;
			}
			else{
				System.out.println("입력이 잘못되었습니다. 다시 입력해주세요");
			}
		}
		return select;
	}
}
