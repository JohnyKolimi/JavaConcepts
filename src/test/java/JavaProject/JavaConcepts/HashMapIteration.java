package JavaProject.JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> map1=new HashMap<String,Integer>();
		
		map1.put("Java", 1);
		map1.put("CSharp", 2);
		map1.put("php", 3);
		map1.put("Ruby", 4);
		
		System.out.println(map1);
		for(Map.Entry<String, Integer> mapitem:map1.entrySet())
		{
			System.out.println("Key="+mapitem.getKey()+" Value="+mapitem.getValue());
		}
	}

}
