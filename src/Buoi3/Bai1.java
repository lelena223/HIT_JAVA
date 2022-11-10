package Buoi3;

import java.util.Scanner;

public class Bai1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String str = sc.nextLine();
		int[] dem = new int[256];
		for(int i=0;i<str.length();i++){
				dem[str.charAt(i)]++;
			}

		for (int i = 0; i < str.length(); i++) {
			if (dem[str.charAt(i)] != 0 && str.charAt(i) != ' ') {
				System.out.println(str.charAt(i) + ": " + dem[str.charAt(i)]);
				dem[str.charAt(i)] = 0;
			}

		}
		
	}
}