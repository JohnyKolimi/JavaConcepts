package JavaProject.JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Johnyhussain";
	
		char[] nameAsChar=name.toCharArray();
		
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
	}

}
