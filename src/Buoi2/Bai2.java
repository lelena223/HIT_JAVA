//package Buoi2;
//
//import java.util.Scanner;
//
//public class Bai2 
//{
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhap n: ");
//		int n = sc.nextInt();
//		int[] a =new int[n];
//		for(int i=1;i<n;i++)
//		{
//			a[i] = sc.nextInt();
//		}
//		int dem=0;
//		int tmp;
//		for(int i=1;i<n;++i)
//		{
//			int thieu=a[i-1]+1;
//			if(thieu != a[i])
//			{
//				System.out.print(thieu + " ");
//				dem++;
//			}
//		}
//		if(dem==0)
//		{
//			System.out.print("YES");
//		}
//	}
//}