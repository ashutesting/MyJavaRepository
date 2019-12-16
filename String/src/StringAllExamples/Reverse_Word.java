package StringAllExamples;

import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Reverse_Word 
{
	public static void reverse_each_word(String input)
	{
		System.out.println("My given string is: "+ input);
		String[] splitword= input.split(" ");
		String Reverse_String= " ";
		
		for(String w: splitword)
		{
			StringBuffer sb= new StringBuffer(w);
			
			Reverse_String= Reverse_String+ sb.reverse() + " ";
			
		}
		System.out.println("Reverse String by word is :" +Reverse_String);
		
		
	}
	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.nextLine();
		Reverse_Word.reverse_each_word(input);
		
	}

}
