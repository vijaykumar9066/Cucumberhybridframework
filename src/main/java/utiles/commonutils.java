package utiles;

import java.util.Date;

public class commonutils {
	
	public static final int IMPLICIT_WAIT_TIME=10;
	
	public static final int PAGE_LOAD_TIME=15;

	public static final int  EXPLICIT_WAIT_BASIC_TIME=20;
	
	public static String getEmailwithTimeStamp()
	{
		Date date = new Date();
		return "vijaykumar"+date.toString().replace(" ", "_").replace(":","_")+"@gmail.com";
	}

}
