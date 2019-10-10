package Collection;

import java.util.HashSet;
//Hashset-- Duplicate Element Not allow and Not maintain order
public class Set 
{
	public static void main(String[] args)
	{
		HashSet<String> hs= new HashSet<String>();
		hs.add("Ashish");
		hs.add("Dilip");
		hs.add("Kharag");
		hs.add("ZOZO");
		hs.add("Ashish"); //Not Allow duplicate
		hs.add("Sandy");
		hs.add("Dilip"); // Duplicate
		
		for(String i: hs)
		{
			System.out.println(i);
		}
	}

}
