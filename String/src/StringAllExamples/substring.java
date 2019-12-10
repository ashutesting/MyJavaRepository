package StringAllExamples;

public class substring 
{
	public static void main(String[] args) 
	{
		String s= "Ashish Soni";
		String s2= s.substring(5, 8);
		System.out.println(s2);
		System.out.println(s.substring(4));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		//System.out.println(s.trim());
		System.out.println(s.startsWith("As"));
		System.out.println(s.endsWith("ni"));
	}

}
