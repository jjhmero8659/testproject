package Soft;

public class software {
	public static void main(String[] args) {
		Login login = new Login();
		
		CheckTime check = new CheckTime();
		Payment payment = new Payment();
		Addmenu add = new Addmenu();
		Reservationseats reserve = new Reservationseats();
		if(login.select_fnum() == 1) {
		SelectCafe selectcafe = new SelectCafe();
		
		if(selectcafe.Select_Cafe() == 1) {//ī�伱��
			Cafe1 cafe1 = new Cafe1();
			cafe1.menu_show();//�޴���
			if(cafe1.select_menu()!=0) {
				if(check.check_time()==false) {//�ɸ��� �ð� ����
					return;
				}
				reserve.reserve();//�¼� ����
				if(payment.check_cusmoney1(cafe1)==true) {//�� ���� ���
					payment.pay_cafe1(cafe1); // ī��1���� ���� ���
					if(cafe1.refuse(cafe1, payment)==true) { //ī��1���� �ֹ� ����
						Cafe1 cafe_1 = new Cafe1();
						Payment pay_1 = new Payment();
						if(add.addmenu(cafe_1, reserve)==true) {//�߰� �ֹ� �ޱ�
						if(pay_1.check_cusmoney1(cafe_1)==true) {//�߰��ֹ��� �޴��ݾ� �����ݾ� ���
							pay_1.pay_cafe1(cafe_1); //�߰� �ݾ� ���
							System.out.println("�̿����ּż� �����մϴ�.");
							cafe1.sendmessage(check); //�޴� �Ϸ� �޽���
							cafe_1.send_addmessage(check);
							return;
						}
						else {
							System.out.println("�̿����ּż� �����մϴ�.");
							return;
						}
						
						}
						else {//�߰��ֹ� �����ʱ� ����
							cafe1.sendmessage(check);
						}
					}
					else { //ī�信�� �ֹ� ������ �߻�
						System.out.println("���α׷��� ����˴ϴ�.");
					}
				}
				else {//1�������� �� ���� �����
					return;
				}	
			}
			else {
				System.out.println("�ֹ��� �޴��� �����ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
		}
		//ī�� 2
		else{
			Cafe2 cafe2 = new Cafe2();
			cafe2.menu_show();
			if(cafe2.select_menu()!=0) {
				if(check.check_time()==false) {
					return;
				}
				reserve.reserve();
				if(payment.check_cusmoney2(cafe2)==true) {
					payment.pay_cafe2(cafe2);
					if(cafe2.refuse(cafe2, payment)==true) {
						Cafe2 cafe_2 = new Cafe2();
						Payment pay_2 = new Payment();
						if(add.addmenu2(cafe_2, reserve)==true) {
						if(pay_2.check_cusmoney2(cafe_2)==true) {
							pay_2.pay_cafe2(cafe_2);
							System.out.println("�̿����ּż� �����մϴ�.");
							
							return;
						}
						else {
							System.out.println("�̿����ּż� �����մϴ�.");
							return;
						}
						}
					}
					else {
						System.out.println("���α׷��� ����˴ϴ�.");
					}
				}
				else {
					return;
				}	
			}
			else {
				System.out.println("�ֹ��� �޴��� �����ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			}
		}
		
	}
}
		
	

