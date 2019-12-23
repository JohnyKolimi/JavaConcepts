package JavaProject.JavaConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"java","csharp","cbol","ruby","java","cbol"};
		

		Set<String> store=new HashSet<String>();
		
		for(String name:names)
		{
			if(store.add(name)== false)
			{
				System.out.println("Duplicate element is: "+name);
			}
		}


		Map<String, Integer> count=new HashMap<String, Integer>();
		
		for(String s:names)
		{
			if(count.containsKey(s))
			{
				count.put(s, count.get(s)+1);
			}
			else
			{
				count.put(s, 1);
			}
				
		}

		System.out.println(count);

	}

}
