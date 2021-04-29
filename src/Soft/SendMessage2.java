package Soft;

public class SendMessage2 {
	int[] cnt = new int[10];
	public SendMessage2(Cafe2 cafe2,CheckTime time) {
		if(check_min2(time) == true) {
			System.out.println("==========================");
		for(int i = 0; i< 10; i++) {
			if(cafe2.menu_arri[i]!=0) {
				System.out.println(cafe2.menu[i].getName()+" : "+cafe2.menu_arri[i]+"°³");
			}
		}
		}
	}
	public boolean check_min2(CheckTime time){
		if(time.minute > 5)
			return true;
		else
			return false;
	}
}
