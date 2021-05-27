package lab_java;

import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		num=sc.nextInt();
		int CurrentDigit=num%10;
		num=num/10;
		while(num>0)
		{
			if(CurrentDigit<=num%10)
				flag=true;
			break;
			
		
}
		CurrentDigit=num%10;
		num=num/10;
		
	
	if(flag) {
		System.out.println("not an increasing order");
	}
	else
	{
		System.out.println(" an increasing order");
	
	}
	sc.close();
}
}