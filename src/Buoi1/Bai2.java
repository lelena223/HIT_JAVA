package Buoi1;

import java.util.Scanner;

public class Bai2 {
	 public static void main(String[] args)
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.print("Nhap lan luot cac so a,b,c,d: ");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 int d = sc.nextInt();
		 if(a>b&&a>c&&a>d)
		 {
			 if(b>=c&&b>=b)
			 {
				 System.out.print(b+" la so lon thu 2.");
			 }
			 else if(c>=b&&c>=d)
			 {
				 System.out.print(c+" la so lon thu 2.");
			 }
			 else
			 {
				 System.out.print(d+" la so lon thu 2.");
			 }
		 }
		 else if(b>a&&b>c&&b>d)
		 {
			 if(a>=c&&a>=d)
			 {
				 System.out.print(a+" la so lon thu 2.");
			 }
			 else if(c>=a&&c>=d)
			 {
				 System.out.print(c+" la so lon thu 2.");
			 }
			 else
			 {
				 System.out.print(d+" la so lon thu 2.");
			 }
		 }
		 else if(c>b&&c>a&&c>d)
		 {
			 if(b>=a&&b>=d)
			 {
				 System.out.print(b+" la so lon thu 2.");
			 }
			 else if(d>=b&&c>=d)
			 {
				 System.out.print(d+" la so lon thu 2.");
			 }
			 else
			 {
				 System.out.print(a+" la so lon thu 2.");
			 }
		 }
		 else if(d>a&&d>b&&d>c)
		 {
			 if(a>=b&&a>=c)
			 {
				 System.out.print(a+" la so lon thu 2.");
			 }
			 else if(b>=c&&b>=a)
			 {
				 System.out.print(b+" la so lon thu 2.");
			 }
			 else
			 {
				 System.out.print(c+" la so lon thu 2.");
			 }
		 }
		 else if(a==b&&a==c&&a==d)
		 {
			 System.out.println("Khong ton tai so lon thu 2");
		 }

		 else if(a>b&&a>=c&&a>=d)
			 {
				 System.out.println(b+" la so lon thu 2.");
			 }
		 else if(a>=b&&a>c&&a>=d)
			 {
				 System.out.println(c+" la so lon thu 2.");
			 }
		 else if(a>=b&&a>=c&&a>d)
			 {
				 System.out.println(d+" la so lon thu 2.");
			 }

		 else if(b>a&&b>=c&&b>=d)
			 {
				 System.out.println(a+" la so lon thu 2.");
			 }
		 else if(b>=a&&b>c&&b>=d)
			 {
				 System.out.println(c+" la so lon thu 2.");
			 }
		 else if(b>=a&&b>=c&&b>d)
			 {
				 System.out.println(d+" la so lon thu 2.");
			 }

		 else if(c>b&&c>=a&&c>=d)
			 {
				 System.out.println(b+" la so lon thu 2.");
			 }
		 else if(c>=b&&c>a&&c>=d)
			 {
				 System.out.println(a+" la so lon thu 2.");
			 }
		 else if(c>=b&&c>=a&&c>d)
			 {
				 System.out.println(d+" la so lon thu 2.");
			 }

		 else if(d>a&&d>=b&&d>=c)
			 {
				 System.out.println(a+" la so lon thu 2.");
			 }
		 else if(d>=a&&d>b&&d>=c)
			 {
				 System.out.println(b+" la so lon thu 2.");
			 }
		 else if(d>=a&&d>=b&&d>c)
			 {
				 System.out.println(c+" la so lon thu 2.");
			 }
	 }
	}
