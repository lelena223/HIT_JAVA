package Buoi2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do{
			System.out.print("Nhap so phan tu cua mang: ");
			n = sc.nextInt();
		}while(n<2);
		
		int[] a=new int[n];
		int[] dem=new int[100];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			dem[a[i]]++;
		}
		for(int i=0;i<100;i++){
			int ok =1;
			for(int j=0;j<i;j++){
				if(a[i]==a[j]){
					ok=0;
					break;
				}
			}
			if(ok==1){
			System.out.println(a[i] + ":" + dem[a[i]]);
			}

		}
	}
}