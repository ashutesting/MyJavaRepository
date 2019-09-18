package EVEN_ODD;

import java.util.Scanner;

public class EvenorOdd  
{
	
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Pelase Enter Number");
		Scanner s= new Scanner(System.in);
		n= s.nextInt();
		if(n%2==0)
		{
			System.out.println("Event Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
