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
		
		if(selectcafe.Select_Cafe() == 1) {//카페선택
			Cafe1 cafe1 = new Cafe1();
			cafe1.menu_show();//메뉴판
			if(cafe1.select_menu()!=0) {
				if(check.check_time()==false) {//걸리는 시간 측정
					return;
				}
				reserve.reserve();//좌석 예약
				if(payment.check_cusmoney1(cafe1)==true) {//고객 현금 계산
					payment.pay_cafe1(cafe1); // 카페1에서 현금 계산
					if(cafe1.refuse(cafe1, payment)==true) { //카페1에서 주문 접수
						Cafe1 cafe_1 = new Cafe1();
						Payment pay_1 = new Payment();
						if(add.addmenu(cafe_1, reserve)==true) {//추가 주문 받기
						if(pay_1.check_cusmoney1(cafe_1)==true) {//추가주문한 메뉴금액 소지금액 통과
							pay_1.pay_cafe1(cafe_1); //추가 금액 계산
							System.out.println("이용해주셔서 감사합니다.");
							cafe1.sendmessage(check); //메뉴 완료 메시지
							cafe_1.send_addmessage(check);
							return;
						}
						else {
							System.out.println("이용해주셔서 감사합니다.");
							return;
						}
						
						}
						else {//추가주문 받지않기 선택
							cafe1.sendmessage(check);
						}
					}
					else { //카페에서 주문 거절시 발생
						System.out.println("프로그램이 종료됩니다.");
					}
				}
				else {//1번쨰에서 고객 현금 불통과
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
		
	

