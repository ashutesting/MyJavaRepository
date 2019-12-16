package StringAllExamples;
//Java program to find the numbers of uppercase, lowercase, digits and special characters in a string
public class CharactersNumber 
{
	public static void main(String[] args) 
	{
		String input= "My name is Ashish Soni and i use @33 12233%$ tesTing";
		int length= input.length();
		int number_of_uppercase=0;
		int number_of_lowercase=0;
		int number_of_digits=0;
		int number_of_other_characters=0;
		System.out.println("Length of string:" +length);
		for(int i=0; i<length; i++)
		{
			char ch= input.charAt(i);
			if (Character.isUpperCase(ch))
			{
				number_of_uppercase++;
			}
			else if (Character.isLowerCase(ch)) 
			{
				number_of_lowercase++;
			}
			else if(Character.isDigit(ch))
			{
				number_of_digits++;
			}
			else
			{
				number_of_other_characters++;
			}
		}
		
		System.out.println("Number of upper case letters in string are:"+ number_of_uppercase);
		System.out.println("Number of lower case letters in string are:"+ number_of_lowercase);
		System.out.println("Number of digits in string are:"+ number_of_digits);
		System.out.println("Number of other characters in string are:"+ number_of_other_characters);
		
		
	}

}
