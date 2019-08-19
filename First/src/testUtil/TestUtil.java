package testUtil;



import tests.TestBase;

public class TestUtil extends TestBase{
	public static void doLogin(String username,String password) {
		getObject(OR.getProperty("useeridFieldxpath")).sendKeys(CONFIG.getProperty("username"));
		getObject(OR.getProperty("passwordFieldxpath")).sendKeys(CONFIG.getProperty("password"));

	}
	
}