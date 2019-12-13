package StringAllExamples;

public class reverse1 
{
	public static void main(String[] args) 
	{
		String s= "My name is ashish";
		String[] word= s.split("\\s");
		String r= " ";
	   for(String w: word)
	   {
		   //StringBuffer sb= new StringBuffer(w);
		  // StringBuffer s1= sb.reverse();
		   
		   int l= w.length();
		   for(int i=l-1; i>=0; i--)
		   {
			   char s1=w.charAt(i);
		       r= r+s1+"";
		   }
		   
		
	   }
	   System.out.println(r);
	  
		
	}

}
