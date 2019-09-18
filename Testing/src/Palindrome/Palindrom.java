package Palindrome;

import java.util.Scanner;

//Palindrome means 121, 131, 232 
public class Palindrom 
{
	public static void main(String[] args) 
	{
		int number;
		int sum=0;
		System.out.println("enter number");
		Scanner s= new Scanner(System.in);
		number =s.nextInt();
		int temp= number;
		
		while(number>0)
		{
			int rem=number%10;
			sum= sum*10+rem;
			number=number/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	}

}
