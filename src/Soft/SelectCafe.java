package Soft;

import java.util.Scanner;

public class SelectCafe {
	public int Select_Cafe() {
		System.out.println("test");
		System.out.println("���Ͻô� ī�並 ������ �ּ���");
		System.out.println("1.����Ʈ���� Cafe 2.���� Cafe");
		Scanner scan = new Scanner(System.in);
		int select = 0;
		while(true) {
			try{
				System.out.print("�Է� :");
				select = scan.nextInt();
				System.out.println(select);
			}
			catch(Exception e) {
				System.out.println("�Է��� �߸��Ǿ����ϴ�. �ٽ� �Է����ּ���");
			}
			if(select == 1) {
				break;
			} 
			else if(select == 2){				
				break;
			}
			else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
		return select;
	}
}
