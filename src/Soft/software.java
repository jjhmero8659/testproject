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
		
		if(selectcafe.Select_Cafe() == 1) {
			Cafe1 cafe1 = new Cafe1();
			cafe1.menu_show();
			if(cafe1.select_menu()!=0) {
				if(check.check_time()==false) {
					return;
				}
				reserve.reserve();
				if(payment.check_cusmoney1(cafe1)==true) {
					payment.pay_cafe1(cafe1);
					if(cafe1.refuse(cafe1, payment)==true) {
						Cafe1 cafe_1 = new Cafe1();
						Payment pay_1 = new Payment();
						if(add.addmenu(cafe_1, reserve)==true) {
						if(pay_1.check_cusmoney1(cafe_1)==true) {
							pay_1.pay_cafe1(cafe_1);
							System.out.println("이용해주셔서 감사합니다.");
							SendMessage message = new SendMessage(cafe1, check);
							return;
						}
						else {
							System.out.println("이용해주셔서 감사합니다.");
							SendMessage message = new SendMessage(cafe1, check);
							return;
						}
						}
					}
					else {
						System.out.println("프로그램이 종료됩니다.");
					}
				}
				else {
					return;
				}	
			}
			else {
				System.out.println("주문한 메뉴가 없습니다. 프로그램을 종료합니다.");
				return;
			}
		}
		//카페 2
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
							System.out.println("이용해주셔서 감사합니다.");
							
							return;
						}
						else {
							System.out.println("이용해주셔서 감사합니다.");
							return;
						}
						}
					}
					else {
						System.out.println("프로그램이 종료됩니다.");
					}
				}
				else {
					return;
				}	
			}
			else {
				System.out.println("주문한 메뉴가 없습니다. 프로그램을 종료합니다.");
				return;
			}
			}
		}
		
	}
}
		
	

