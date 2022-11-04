package Buoi1;

import java.util.Scanner;

public class Bai4 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		do 
		{
			System.out.print("Nhap so nguyen n: ");
			n = sc.nextInt();
		}while(n <= 0);
		int[] arr = new int[100];
		int i=1;
		int dem=0;
		while(n%10 != 0)
		{
			arr[i] = n%10;
			n = n/10;
			i++;
			dem++;
		};		
		int dem1=0;
		for(int j=dem;j>=1;j--)
		{
			double x= Math.sqrt(arr[j]);
			if(x*x==arr[j])
			{
				System.out.print(arr[j] + " ");
				dem1++;
			}
		}
		if (dem1==0)
		{
			System.out.println("NO");
		}

	}	
}
