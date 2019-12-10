package StringAllExamples;

import java.util.Scanner;

public class PalindromeString 
{
	public PalindromeString(String input)
	{
		String reverse="";
		System.out.println("Initial String is: "+input);
		for(int i=input.length()-1; i>=0; i--)
		{
			reverse= reverse+input.charAt(i);
			
		}
		
		System.out.println("Reverse of string is :"+reverse);
		
		if(reverse.equals(input))
		{
			System.out.println("String is palindrome");
		}
		else
		{
		System.out.println("Not Palindrome");
		}
	
		
	}
	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter String to check palindrome");
		String input= s.nextLine();
		PalindromeString ob= new PalindromeString(input);
		
		
		
	}

}
