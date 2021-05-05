package Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;


public class HW2 {
	
	public static void main(String[] args) throws IOException{
		int cnt =0,cnt2=0;
		Scanner sc = new Scanner(System.in);	
		System.out.print("입력 파일 이름? ");
		String fname1 = sc.next();
		String fname2 = sc.next();// 파일 이름을 입력
		System.out.print("Shingle의 수 :");
		int shingle = sc.nextInt();
		ArrayList<String> list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList();
		int count1[] = new int[50];
		int count2[] = new int[50];
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
		System.out.println(list1.size());
		System.out.println(list2.size());
		int one = 0;
		boolean icheck=true;
		ArrayList<String> cal = new ArrayList();
		String cal2 = new String();
		while(icheck==true){
				for(int i = one; i < shingle+one; i++){
					try {
					A.add(list1.get(i));
					}
					catch(Exception e) {
						icheck=false;
						break;
					}
				}
				cal2 = String.join("",A);
				if(A1.contains(cal2)!=true && icheck==false) {
					A1.add(cal2);
					cal.add(cal2);
				}
				else {
					count1[one]++;
				}
				A.removeAll(A);
			one++;	
		}
		icheck = true;
		int two = 0;
		while(icheck==true){
				for(int i = 0+two; i < shingle+two; i++){
					try {
					B.add(list2.get(i));
					}
					catch(Exception e) {
						icheck=false;
						break;
					}
				}
				cal2 = String.join("",B);
				if(B1.contains(cal2)!=true&& icheck==false) {
					B1.add(cal2);
				}
				B.removeAll(B);
			two++;
		}	
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		for (String string : A1) {
			System.out.println(string + " ");
		}
		System.out.println();
		for (String string1 : B1) {
			System.out.println(string1 + " ");
		}
		A1.addAll(B1);//합
		double hap = A1.stream().distinct().collect(Collectors.toList()).size();
		System.out.println("합집합 : "+A1.stream().distinct().collect(Collectors.toList()).size());//지워도됨
		cal.retainAll(B1);//교
		double cha = cal.size();
		System.out.println("교집합 : "+cha);
		System.out.println("문자열 집합을 이용한 유사도 = "+cha/hap);
}
}

//d1.txt d2.txt
//f1.txt f2.txt











//int i=0;
//FileInputStream file1 = null;
//FileInputStream file2 = null;
//Scanner scan = new Scanner(System.in);
//
//System.out.print("두개의 파일 이름:");
//String file1_name = scan.next();
//String file2_name = scan.next();
//
//file1 = new FileInputStream(file1_name);
//file2 = new FileInputStream(file2_name);
//
//System.out.println("Shingle의 수:");
//String num = scan.next();
//
//BufferedInputStream f1 = new BufferedInputStream(file1);
//BufferedInputStream f2 = new BufferedInputStream(file2);
//
//
//BufferedReader br1 = new BufferedReader(new InputStreamReader(file1));
//BufferedReader br2 = new BufferedReader(new InputStreamReader(file2));
//String[] s1 = br1.readLine().split(" ");
//String[] s2 = br2.readLine().split(" ");
//
//String[] arr1 = new String[Integer.parseInt(num)];
//String[] arr2 = new String[Integer.parseInt(num)];
//
//for(i=0; i<arr1.length; i++) {
//	arr1[i] = s1[i];
//	System.out.print(arr1[i]);
//	System.out.println();
//}
//
//System.out.println(Arrays.toString(s));
//
//
	