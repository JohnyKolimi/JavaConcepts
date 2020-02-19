package JavaProject.JavaConcepts;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABCDEF";
		
		String str3="uyytdtugdfcbvvlpoiutyurwteadx";
		
		String str1=str.substring(1,4);
		System.out.println(str1);
		
		String str2=str.substring(0,3);
		System.out.println(str2);
		if(str3.length()>3)
		{
		int midx=str3.length()/2;
		
		System.out.println(str3.substring(midx-1, midx+2));
		}
		
		
	}

}
