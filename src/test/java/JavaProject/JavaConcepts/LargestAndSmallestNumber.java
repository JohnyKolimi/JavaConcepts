package JavaProject.JavaConcepts;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {100,-67,98,0,14};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
		}
		
		System.out.println("\n Given array:"+Arrays.toString(numbers));
		System.out.println("Largest number is::"+largest);
		System.out.println("Smallest number is::"+smallest);
	}

}
