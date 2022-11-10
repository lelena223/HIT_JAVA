package Buoi2;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int dem,max;
		dem=max=1;
		for(int i=1;i<n;i++)
		{

			if(a[i-1] < a[i])
			{
				++dem;
				if(max<dem)
				{
					max=dem;
				}
			}
			else
			{
				dem=1;
			}
		}
		System.out.print(max);
	}

}
