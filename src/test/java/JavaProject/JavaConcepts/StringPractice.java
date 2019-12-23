package JavaProject.JavaConcepts;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         String str="Welcome to Automation";
         
         String[] strarray= str.split(" ");
         String revstring="";
         
         System.out.println("No of words: "+strarray.length);
         
         for(int i=0;i<strarray.length;i++)
         {
        	 String word=strarray[i];
        	 String revword="";
        	 
        	 for(int j=word.length()-1;j>=0;j--)
        	 {
        		 revword=revword+word.charAt(j);
        	 }
        	 revstring=revstring+revword+" ";
         }
         System.out.println(revstring);
		
	}

}
