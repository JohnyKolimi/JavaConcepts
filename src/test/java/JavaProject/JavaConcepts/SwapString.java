package JavaProject.JavaConcepts;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hellow";
		String b="World";
		
		System.out.println("Before swap");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
		a=a+b; //HellowWorld
		
//		b=a.substring(0, 6);
//		a=a.substring(6, 11);
		System.out.println(a.length());
		System.out.println(b.length());
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After swap");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
	}

}
