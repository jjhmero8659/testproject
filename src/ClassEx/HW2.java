package ClassEx;

import java.io.File; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class HW2 {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);	
		System.out.print("두개의 파일이름: ");
		String fname1 = sc.next();
		String fname2 = sc.next();// 파일 이름을 입력
		System.out.print("Shingle의 수:");
		int shingle = sc.nextInt();
		ArrayList<String> list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList();
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		HashMap<String, Integer> map3 = new HashMap<String, Integer>();
		HashMap<String, Integer> map4 = new HashMap<String, Integer>();
		try {
			sc = new Scanner(new File(fname1));
			while (sc.hasNext()) {
				list1.add(sc.next());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("파일 오류 발생");
		}
		try {
			sc = new Scanner(new File(fname2));
			while (sc.hasNext()) {
				list2.add(sc.next());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("파일 오류 발생");
		}
		ArrayList<String> A = new ArrayList();
		ArrayList<String> B = new ArrayList();
		ArrayList<String> A1 = new ArrayList();
		ArrayList<String> B1 = new ArrayList();
		int one = 0;
		boolean icheck=true;
		ArrayList<String> cal = new ArrayList();
		String cal2 = new String();
		while(true){
				for(int i = one; i < shingle+one; i++){
					try {
					A.add(list1.get(i));
					}
					catch(Exception e) {
						icheck=false;
						break;
					}
				}
				if(icheck==false)
					break;
				cal2 = String.join("",A);
				if(map1.containsKey(cal2)==true && icheck==true) {
					map1.put(cal2, map1.get(cal2)+1);
					map4.put(cal2, map4.get(cal2)+1);
				}
				else if(icheck==true) {
					map1.put(cal2, 1);
					map4.put(cal2, 1);
				}
				if(A1.contains(cal2)!=true && icheck==true) {
					A1.add(cal2);
					cal.add(cal2);
				}
				A.removeAll(A);
			one++;	
		}
		String arr[] = new String[list1.size()];
		icheck = true;
		int two = 0;
		int cnt=0;
		while(true){
				for(int i = 0+two; i < shingle+two; i++){
					try {
						B.add(list2.get(i));
					}
					catch(Exception e) {
						icheck=false;
						break;
					}
				}
				if(icheck==false)
					break;
				cal2 = String.join("",B);
				if(map2.containsKey(cal2)==true) {
					map2.put(cal2, map2.get(cal2)+1);
					cnt++;
				}
				else{
					map2.put(cal2, 1);
					arr[two-cnt] = cal2;
				}
				if(B1.contains(cal2)!=true) {
					B1.add(cal2);
				}
				B.removeAll(B);
			two++;
		}	

		double total=0,total2=0;
		for(int i = 0; arr[i]!=null; i++) {
			if(map4.containsKey(arr[i])) {
				if(map4.get(arr[i]) < map2.get(arr[i])) {
					map4.put(arr[i], map2.get(arr[i]));
				}
			}
			else {
				map4.put(arr[i], map2.get(arr[i]));
			}
		}
		
		for (Integer num : map4.values()) {
			total += num;
		}
		map3.clear();
		for (int idx=0; idx<map1.size(); idx++){
			if(map1.containsKey(arr[idx])) {
				if((map1.get(arr[idx])>map2.get(arr[idx]))) {
					map3.put(arr[idx], map2.get(arr[idx]));
				}
				else{
					map3.put(arr[idx], map1.get(arr[idx]));
				}
			}
		}

		for (Integer num : map3.values()) {
			total2 += num;
		}
		A1.addAll(B1);
		double hap = A1.stream().distinct().collect(Collectors.toList()).size();
		cal.retainAll(B1);
		double cha = cal.size();
		System.out.println("문자열 집합을 이용한 유사도 = "+cha/hap);
		System.out.println("문자열 map을 이용한 유사도 = "+total2/total);
		
}
}
//d1.txt d2.txt
//f1.txt f2.txt
//h.java t.java


