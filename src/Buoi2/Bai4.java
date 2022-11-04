package Buoi2;

import java.util.Scanner;

public class Bai4 {
	public static boolean Check(int x)
	{
		if(x<2)
		{
			return false;
		}
		else 
		{
			for(int i=2;i<Math.sqrt(x);i++)
			{
				if(x % i == 0)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	public static boolean SNT(int x)
	{
		int dem=0;
		int i=0;
				while(x>0) 
				{
					int y = x%10;
					if(Check(y)==true)
					{
						i++;
					}
					x=x/10;
					dem++;
				}
			if(i==dem) 
			{
				return true;
			}
			else 
			{
				return false;
			}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int dem=0;
		for(int i=0; i<n; i++) 
		{
			if(SNT(a[i])==true && Check(a[i])==true && a[i]>10) 
			{
				System.out.print(a[i] + " ");
				dem++;
			}
		}
		if(dem==0) 
		{
			System.out.print("NO");
		}
	}
}
