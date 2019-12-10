package StringAllExamples;

import java.util.Scanner;

public class ReverseString 
{
	
	public static void stringreverse(String input)
	{
		String reverse="";
		int len=input.length();
		System.out.println("String before reverse is :" + input );
		for(int i=len-1; i>=0; i--)
		{
			reverse= reverse+input.charAt(i);
			
		}
		System.out.println("Reverse of the string is : "+reverse);
		
		
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter string to reverse");
		Scanner str= new Scanner(System.in);
		String input = str.nextLine();
		stringreverse(input);
		
	}

}
