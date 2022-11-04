package Buoi1;

public class Bai3 {
	public static void main(String[] args)
	{
		System.out.println("Trau = 100, co = 100.");
		System.out.println("Trau dung an 5: 5x, trau nam an 3: 3y, lu khu trau gia 3 con 1 bo: z/3");
		for(int i=1;i<=100;i++)
		{
			for (int j=1;j<=100;j++)
			{
				for(int k=1;k<=100;k++)
				{
					if(5*i + 3*j + k/3 == 100 && i + j + k == 100 && k%3 == 0)
					{
						System.out.println("So trau dung la: "+i);
						System.out.println("So trau nam la: "+j);
						System.out.println("So trau gia la: "+k);
					}
				}
			}
		}
	}
}