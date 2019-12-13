package StringAllExamples;

import java.util.Scanner;
// A program to capitilize first letter of each word in String
public class Capitilize 
{
	public void capitilize_word(String s1)
	{
		System.out.println(s1);
		String[] word= s1.split("\\s");
		String capitilize_string= "";
		
		for(String i: word)
		{
			String first=i.substring(0,1);
			String afterfirst= i.substring(1);
			capitilize_string = capitilize_string +first.toUpperCase()+afterfirst+ " ";
		//System.out.println(i);
		}
		String S= capitilize_string.trim();
		System.out.println(S);
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter string to capatalize characters");
		String s1= s.nextLine();
		Capitilize obj= new Capitilize();
		obj.capitilize_word(s1);
		
		
		
	}

}
