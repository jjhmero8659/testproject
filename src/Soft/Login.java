package Soft;

import java.util.Scanner;

public class Login {
	int select_first = 0;
	Scanner sc = new Scanner(System.in);
	public Login() {
		String[] CusInfo = new String[3];
		System.out.println("메뉴를 선택 해주세요");
		System.out.println("1. 회원 가입 2.나가기");
		while(true) {
			System.out.print("입력 : ");
			select_first = sc.nextInt();
			if(select_first == 1) {//회원가입
				CusInfo[0] = joinmembership_Name();
				CusInfo[1] = joinmembership_ID();
				CusInfo[2] = joinmembership_PW();
				customer_login(CusInfo[1],CusInfo[2]);
				return ;
			}
			else if(select_first == 2) {
				System.out.println("프로그램을 종료합니다.");
				return;
				
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}	
		}

	}
	public int select_fnum() {
		if(select_first == 1) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public String joinmembership_ID() {
		System.out.print("ID를 입력해주세요 :");
		String ID = null;
	while(true) {
		try {
			ID = sc.next();
		}
		catch(Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력 해주세요");
		}
		if(ID != null)
			return ID;
	}
		
		
		
	}
	public String joinmembership_Name() {
		System.out.println("=====회원가입 을 선택 하셨습니다=====");
		System.out.print("이름을 입력해주세요 :");
		String Name = null;
		while(true) {
			try {
				Name = sc.next();
			}
			catch(Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력 해주세요");
			}
			if(Name != null)
				return Name;
		}
	}
	public String joinmembership_PW() {
		System.out.print("Password를 입력해주세요 :");
		String Password = null;
		while(true) {
			try {
				Password = sc.next();
			}
			catch(Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력 해주세요");
			}
			if(Password != null)
				return Password;
		}
	}
	public void customer_login(String ID,String PW) {
		System.out.println("=====로그인 화면 입니다=====");
		while(true) {
			System.out.print("ID를 입력해주세요 :");
			String Cus_ID = sc.next();
			System.out.print("Password를 입력해주세요 :");
			String Cus_PW = sc.next();
			if(Cus_ID.equals(ID) && Cus_PW.equals(PW)) {
				System.out.println("로그인에 성공하였습니다.");
				return;
			}
			else {
				System.out.println("로그인에 실패 하였습니다.\n");
				
			}	
		}
		
	}
	
}
