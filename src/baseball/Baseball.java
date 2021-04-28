package baseball;

import java.util.Iterator;

public class Baseball {
	private int max = 9;
	private int min = 1;
	private int[] arr;
	Baseball(int LEN) {
		arr = new int[LEN];
	}
	
	void com_randoms() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * (max - min + 1) + min);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
	}
	int arrlength() {
		return arr.length;
	}
	int get_random(int i) {
		return arr[i];
	}
	
	
}
