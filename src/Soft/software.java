package Soft;

public class software {
	public static void main(String[] args) {
		Login login = new Login();
		CheckTime check = new CheckTime();
		Payment payment = new Payment();
		Reservationseats reserve = new Reservationseats();
		if(login.select_fnum() == 1) {
		SelectCafe selectcafe = new SelectCafe();
		
		if(selectcafe.Select_Cafe() == 1) {
			Cafe1 cafe1 = new Cafe1();
			cafe1.menu_show();
			if(cafe1.select_menu()!=0) {
				check.check_time();
				reserve.reserve();
				
				payment.check_cusmoney1(cafe1);
				payment.pay_cafe1(cafe1);
				if(cafe1.refuse(cafe1, payment)==true) {
					
				}
				else {
					System.out.println("프로그램이 종료됩니다.");
				}
			}
			else {
				System.out.println("주문한 메뉴가 없습니다. 프로그램을 종료합니다.");
				return;
			}
		}
		else{
			Cafe2 cafe2 = new Cafe2();
			cafe2.menu_show();
			if(cafe2.select_menu()!=0) {
				check.check_time();
				payment.check_cusmoney2(cafe2);
				payment.pay_cafe2(cafe2);
			}
			else {
				System.out.println("주문한 메뉴가 없습니다. 프로그램을 종료합니다.");
				return;
			}
			
			}
		}
		
		}
		
}
	

