package PrimeNumer;

import java.util.Scanner;

public class Number_Swapping_Without_third 
{
	public static void main(String[] args) 
	{
		int a, b;
		System.out.println("Please Enter value of a and b");
		Scanner s= new Scanner(System.in);
		a= s.nextInt();
		b= s.nextInt();
		System.out.println("Before Swapping Value of a= " +a  +  "  Value of b= " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping Value of a= " +a  + " and Value of b= " +b);
		
		
	}

}
