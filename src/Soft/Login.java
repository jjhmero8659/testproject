package Soft;

import java.util.Scanner;

public class Login {
	int select_first = 0;
	Scanner sc = new Scanner(System.in);
	public Login() {
		String[] CusInfo = new String[3];
		System.out.println("�޴��� ���� ���ּ���");
		System.out.println("1. ȸ�� ���� 2.������");
		while(true) {
			System.out.print("�Է� : ");
			select_first = sc.nextInt();
			if(select_first == 1) {//ȸ������
				CusInfo[0] = joinmembership_Name();
				CusInfo[1] = joinmembership_ID();
				CusInfo[2] = joinmembership_PW();
				customer_login(CusInfo[1],CusInfo[2]);
				return ;
			}
			else if(select_first == 2) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
				
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
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
		System.out.print("ID�� �Է����ּ��� :");
		String ID = null;
	while(true) {
		try {
			ID = sc.next();
		}
		catch(Exception e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է� ���ּ���");
		}
		if(ID != null)
			return ID;
	}
		
		
		
	}
	public String joinmembership_Name() {
		System.out.println("=====ȸ������ �� ���� �ϼ̽��ϴ�=====");
		System.out.print("�̸��� �Է����ּ��� :");
		String Name = null;
		while(true) {
			try {
				Name = sc.next();
			}
			catch(Exception e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է� ���ּ���");
			}
			if(Name != null)
				return Name;
		}
	}
	public String joinmembership_PW() {
		System.out.print("Password�� �Է����ּ��� :");
		String Password = null;
		while(true) {
			try {
				Password = sc.next();
			}
			catch(Exception e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է� ���ּ���");
			}
			if(Password != null)
				return Password;
		}
	}
	public void customer_login(String ID,String PW) {
		System.out.println("=====�α��� ȭ�� �Դϴ�=====");
		while(true) {
			System.out.print("ID�� �Է����ּ��� :");
			String Cus_ID = sc.next();
			System.out.print("Password�� �Է����ּ��� :");
			String Cus_PW = sc.next();
			if(Cus_ID.equals(ID) && Cus_PW.equals(PW)) {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
				return;
			}
			else {
				System.out.println("�α��ο� ���� �Ͽ����ϴ�.\n");
				
			}	
		}
		
	}
	
}
