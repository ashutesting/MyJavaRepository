package StringAllExamples;

public class Split_String 
{
	public static void main(String[] args) 
	{
		
		String s1= "My Name is Ashish Soni" ;
		//String s2= s1.toUpperCase();
		//System.out.println(s2);
		String[] all= s1.split("\\s");
		int l=all.length;
		System.out.println(l);
		for(String word: all)
		{
			System.out.println(word);
			
		}
		
		
	}

}
