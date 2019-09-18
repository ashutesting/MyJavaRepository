package PrimeNumer;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		int i,n;
		int flag=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter Number:  ");
		int number= s.nextInt();
		n= number/2;
		for(i=2; i<=n; i++)
		{
			if(number%i==0)
			{
			System.out.println("This number not a prime number ");
			flag=1;
			break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Number is Prime number");
		}
	}
}


