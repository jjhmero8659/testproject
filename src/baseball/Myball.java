package baseball;

import java.util.Scanner;

public class Myball {
	private Scanner sc;
	private int[] my_arr;
	
	Myball(int LEN){
		sc = new Scanner(System.in);
		my_arr = new int[LEN];
	}
	
	void scan_randoms() {
		for(int i = 0; i < my_arr.length; i++) {
			System.out.printf("��%d :",i+1);
			my_arr[i] = sc.nextInt();
			for(int j = 0; j < i; j ++) {
				if(my_arr[i] == my_arr[j]) {
					System.out.println("�ߺ��Ǿ����ϴ�.");
					i--;
					break;
				}
			}
		}
	}
	int get_scrandom(int i) {
		return my_arr[i];
	}
}
