package StringAllExamples;

public class tOOGLE_Reverse 
{
	public static void main(String[] args) 
	{
		String s= "My name is ashish";
		String[] word= s.split(" ");
		String temp= "";
		for(String w: word)
		{
			StringBuffer sb= new StringBuffer(w);
			sb.reverse();
			String first= sb.substring(0,1);
			String afterfirst= sb.substring(1);
			temp= temp+ first.toLowerCase()+ afterfirst.toUpperCase() + " ";
						
		}
		System.out.println(temp);
		
		
	}

}
