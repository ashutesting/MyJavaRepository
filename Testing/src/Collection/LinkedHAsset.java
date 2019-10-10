package Collection;

import java.util.LinkedHashSet;
// LinkedHashset-- Maintain Order and Duplicate Not allow
public class LinkedHAsset 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> ls= new LinkedHashSet<>();
		ls.add(10);
		ls.add(20);
		ls.add(21);
		ls.add(25);
		ls.add(30);
		ls.add(20);
		ls.add(11);
	int s=	ls.size();
	System.out.println("Size is : " +s);
	
	for(Integer i: ls)
	{
		System.out.println(i);
	}
	}

}
