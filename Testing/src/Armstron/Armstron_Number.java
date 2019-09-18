package Armstron;

import java.util.Scanner;
//ARMSTRONG MEANS (a*a*a)+(b*b*b)+(c*c*c)=abc ex- 153
public class Armstron_Number 
{
	public static void main(String[] args) 
	{
		int number, rem, dev;
		int sum=0;
		System.out.println("Please Enter number to check number is armstrong number of not");
		Scanner s= new Scanner(System.in);
		number= s.nextInt();
		int temp= number;
		
		while(number>0)
		{
			rem= number%10;
			sum= sum+rem*rem*rem;
		    number= number/10;	
		}
		if(sum==temp)
		{
			System.out.println("Number is armstrong number");
		}
		else
		{
			System.out.println("Number is not armstrong number");
		}
		
		
		
		
	}

}
