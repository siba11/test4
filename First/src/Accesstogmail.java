
public abstract class Accesstogmail{
//private String username;
//private String password;
//private String url;
//WebDriver driver;
	
	public void execute() {
		initiateChromeBrowser();
		userlogindetails();
		//userlogindetails(url,username, password);
	}
	abstract void initiateChromeBrowser();
	abstract void userlogindetails();
	//abstract void userlogindetails(String url,String username,String password);
}
	
