package Soft;

public class SendMessage {
	int[] cnt = new int[10];
	public SendMessage(Cafe1 cafe1,CheckTime time) {
		if(check_min1(time) == true) {
			System.out.println("==========================");
		for(int i = 0; i< 10; i++) {
			if(cafe1.menu_arri[i]!=0) {
				System.out.println(cafe1.menu[i].getName()+" : "+cafe1.menu_arri[i]+"개 나왔습니다~");
			}
		}
		}
	}
	public boolean check_min1(CheckTime time){
		if(time.minute > 5)
			return true;
		else
			return false;
	}
}
