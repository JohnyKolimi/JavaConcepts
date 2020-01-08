package JavaProject.JavaConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date dt=new Date();
		System.out.println(dt.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss zzz");
		
		System.out.println(sdf.format(dt));
	}

}
