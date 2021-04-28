package home1;

public class Practice02 {
public static void main(String[] args) {
	int[] arr = new int[9];
	int max = 9;
	int min = 1;
	// 1~9 랜덤으로 값을 뽑아 배열에 집어넣기
	// 랜덤값 겹치지 않게 배열에 집어넣기
	for(int i=0; i<arr.length; i++) {
		arr[i] = (int)(Math.random() * (max - min + 1) + min);
		for(int z=0; z<i; z++) { // z<=i-1
			if(arr[i] == arr[z]) {
				i--;
				break;
			}
		}
	}

	for(int val : arr) {
		System.out.print(val + ", ");
	}
}
}
