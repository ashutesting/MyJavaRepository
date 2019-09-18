package PrimeNumer;

import java.util.Scanner;

public class NumberSwapping1 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int a, b, temp;
		System.out.println("Enter Value of a:  ");
		a= s.nextInt();
		System.out.println("Enter Value of b:  ");
		b= s.nextInt();
		
		temp=a;
		a=b;
		b= temp;
		
		System.out.println("After Swapping value of a= " +a);
		System.out.println("After Swapping value of b= " +b);
		
		
	}

}
