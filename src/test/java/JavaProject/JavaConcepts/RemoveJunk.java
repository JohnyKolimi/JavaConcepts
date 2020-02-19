package JavaProject.JavaConcepts;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="@%#%^#^$& Automation 1234";
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
		
	}

}
