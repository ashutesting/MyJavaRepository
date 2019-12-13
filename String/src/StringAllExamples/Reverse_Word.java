package StringAllExamples;

import java.util.Scanner;

public class Reverse_Word 
{
	public static void reverse_each_word(String input)
	{
		System.out.println("My given string is: "+ input);
		String[] splitword= input.split(" ");
		int length= splitword.length;
		for(int i=0; i<=length-1; i++)
		{
			
            String partial= splitword[i];
            String reverse= " ";
			for(int j=partial.length()-1; j>=0; j--)
			{
				
				reverse= reverse+partial.charAt(j);
				System.out.println(reverse);
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.nextLine();
		Reverse_Word.reverse_each_word(input);
		
	}

}
