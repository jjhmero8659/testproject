package home1;

import java.util.Arrays;
import java.util.Iterator;

public class Practice01 {
public static void main(String[] args) {
	int[] arr = new int[9];
	int max=9,min=1;
	for(int i = 0; i < arr.length; i++) {
		arr[i] = (int)(Math.random()*(max-min+1)+min);
		System.out.println(i);
		for(int j=0; j<i; j++)
		{
			if(arr[i]==arr[j])
			{
			i--;
			break;
			}
		}
	}
	
	System.out.println(Arrays.toString(arr));
}
}
