package utilities;

public class Emailer {


	public static String server="smtp.gmail.com";
	public static String from = "stefown12@gmail.com";
	public static String password = "Mustang2014";
	public static String[] to ={"stefown12@gmail.com"};
	public static String subject = "Test Report";
	
	public static String messageBody ="TestMessage";
	public static String attachmentPath=System.getProperty("user.dir")+"//Reports.zip";
	public static String attachmentName="reports.zip";
	
	
}
