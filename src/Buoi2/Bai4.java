package Buoi2;

import java.util.Scanner;

public class Bai4 {
	public static int Check(int x)
	{
		if(x<2)
		{
			return 0;
		}
		for(int i=2;i<Math.sqrt(x);i++)
		{
			if(x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int[] b =new int[100];
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}	
		int dem=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>10 && Check(a[i])==1)
			{
				while(a[i]%10 != 0)
				{
					b[i]=n%10;
					n=n/10;
					dem++;
				}
			}
		}
		if(dem==0)
		{
			System.out.print("NO");
		}
		else
		{
			for(int i=0;i<100;i++)
			{
				System.out.print(b[i] + " ");
			}
		}
	}
}
