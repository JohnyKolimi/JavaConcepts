package JavaProject.JavaConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Johnyhussain";
	
		char[] nameAsChar=name.toCharArray();
		
		// Using HashMap
		
		Map<Character, Integer> count=new HashMap<Character, Integer>();
		
		for(char c:nameAsChar)
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else
			{
				count.put(c, 1);
			}
		}

		System.out.println(count);
		
		//Using HashSet
		
		Set<Character> count1=new HashSet<Character>();
		for(char c:nameAsChar)
		{
			if(count1.add(c)==false)
			{
				System.out.println("Duplicate chatacter is :"+c);
			}
		}
		
		
	}

}
