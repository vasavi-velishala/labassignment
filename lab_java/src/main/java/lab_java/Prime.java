package lab_java;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int start=sc.nextInt();
		System.out.println("enter ending number");
		int end=sc.nextInt();
		System.out.println("prime numbers in between");
		
		int count;
		for(int i=start;i<=end;i++)
		{
			count=0;
			for(int j=1;j<=i;j++) {
			if(i%j==0)
				count=count+1;
			
		}
		if(count==2)
			System.out.println(i);
		}
		sc.close();
	}
}
