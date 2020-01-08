package JavaProject.JavaConcepts;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5;
		int y=10;
		
		//with using thisd var t
		
//		int t;
//		t=x;
//		x=y;
//		y=t;
			
		//without using third var
		
//		x=x+y;
//		y=x-y;
//		x=x-y;
		
		//using XOR operator
  		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println(x);
		System.out.println(y);
	}

}
