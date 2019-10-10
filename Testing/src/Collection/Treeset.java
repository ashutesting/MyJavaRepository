package Collection;

import java.util.TreeSet;
//Treeset-- Ascending Order and Duplicate Not allow
public class Treeset 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts= new TreeSet<>();
		ts.add("deepak");
		ts.add("rahul");
		ts.add("soni");
		ts.add("ashish");
		ts.add("soni");
		ts.add("deepak");
		
		for(String i: ts)
		{
			System.out.println(i);
		}
		
	}

}
