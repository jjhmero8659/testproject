package Soft;

public class software {
	public static void main(String[] args) {
		Login login = new Login();
		if(login.select_fnum() == 1) {
		SelectCafe selectcafe = new SelectCafe();
		if(selectcafe.Select_Cafe() == 1) {
			Cafe1 cafe1 = new Cafe1();
			cafe1.menu_show();
			cafe1.select_menu();
		}
		else if(selectcafe.Select_Cafe() == 2) {
			System.out.println("Cafe2 error");
			Cafe2 cafe2 = new Cafe2();
			cafe2.menu_show();
			cafe2.select_menu();
		}
		
		}
	}
	
}
