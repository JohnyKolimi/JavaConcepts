package JavaProject.JavaConcepts;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Hellow World!";
		
		// Using String and charAt() method
		
//		String rev="";
//		
//		for(int i=input.length()-1;i>=0;i--)
//		{
//			rev=rev+input.charAt(i);
//		}
//		
//		System.out.println(rev);
		
		
		// Using StringBuffer class and reverse function
		
		StringBuffer sb=new StringBuffer(input);
		
		System.out.println(sb.reverse());
		
	}

}

/* String is immutable object
 * 
 * StringBuffer is mutable object
 * 
 */
