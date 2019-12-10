package StringAllExamples;

public class charat 
{

	public static void main(String[] args) {
		String s1= "Java is a Programming Language, java is also used for selenium automation. Java is Platform for many tools";
		int l= s1.length();
		/*
		for(int x=0; x<=l-1; x++)
		{
			System.out.println(s1.charAt(x));
		}
		
		System.out.println(l);
		System.out.println(s1.charAt(11));
		*/
		String s2= s1.replace("java", "ashish");
		System.out.println(s2);
		
		
		
		
	}
}
