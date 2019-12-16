package StringAllExamples;

import java.util.Scanner;

//Java Program to tOGGLE each word in String
public class tOOGLE_Word 
{
	public static void tOOGLE(String s)
	{
		System.out.println("Main string is :" + s);
		String[] word= s.split(" ");
		String temp= "";
		for(String w: word)
		{
			//w.toUpperCase();
			String first= w.substring(0,1);
			//first.toLowerCase();
			String after_first= w.substring(1);
			after_first.toUpperCase();
			temp= temp+first.toLowerCase()+after_first.toUpperCase() + " ";
			
		}
		System.out.println("tOOGLE string is : " + temp );
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter string for tOOGLE: ");
		String input= s.nextLine();
		tOOGLE_Word.tOOGLE(input);
		
	}

}
