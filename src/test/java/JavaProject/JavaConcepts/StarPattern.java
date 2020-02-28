package JavaProject.JavaConcepts;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=8;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
