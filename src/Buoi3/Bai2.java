package Buoi3;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String s1 = sc.nextLine();
		System.out.print("Nhap chuoi con: ");
		String s2 = sc.nextLine();
		int max = 0;
		for(int i=0;i<s2.length();i++){
			for(int j=i+1;j<s2.length();j++){
				String s = s2.substring(i,j-1);
                if(s1.contains(s)){
                    max = Math.max(max,s.length());
                }
			}
		}
		System.out.print(max);
	}
}
