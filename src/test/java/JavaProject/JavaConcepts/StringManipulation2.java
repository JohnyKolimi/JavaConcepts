package JavaProject.JavaConcepts;

public class StringManipulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="The rains have started here";
		String str1="The rains Have started here";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("v"));
		System.out.println(str.indexOf("rains"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf("s", str.indexOf("s")+1));
		
		// String comparison 
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring
		System.out.println(str.substring(1,5));
		
		//trim
		String str2="  Hellow world!  ";
		System.out.println(str2.trim());
		System.out.println(str2.replace(" ", ""));
		
		//split
		
		String test="Hello_worl_Test_scenario";
		String[] test1= test.split("_");
		System.out.println(test1.length);
		
		for(int i=0;i<test1.length;i++)
		{
			System.out.println(test1[i]);
		}
		
		String x="Hellow";
		String y="World";
		int a=100;
		int b=200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));


			
	}

}
