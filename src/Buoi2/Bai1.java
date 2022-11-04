package Buoi2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
			System.out.print("Nhap so phan tu cua mang: ");
			n = sc.nextInt();
		}while(n<2);
		int[] arr=new int[n];
		int[] dem=new int[100];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
			dem[arr[i]]++;
		}
		System.out.println();
		for (int i = 0; i < 100; i++) 
		{
			System.out.println(arr[i] +":"+ dem[arr[i]]);
		}
		
	}
}
