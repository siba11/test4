import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logintogmail extends Accesstogmail {
	private String username;
	  private String password;
	  private String url;
	@Override
	void initiateChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/madhuri/Downloads/chromedriver"	);

		//System.setProperty("webdriver.chrome.driver", "user.dir");
		WebDriver driver=new ChromeDriver();
		}

	@Override
	//void userlogindetails(WebDriver driver, String username, String password) {
	void userlogindetails() {
	    
		logintogmail logind=new logintogmail();
		WebDriver driver=new ChromeDriver();
		System.out.println("test");
		logind.setUrl("http://gmail.com");
		logind.setUsername("madhuri");
		logind.setPassword("madhuri");
		System.out.println(logind.getUrl());
		driver.get(logind.getUrl());
		System.out.println("test");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(logind.username);
	     driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();  
	     WebDriverWait driverwait=new WebDriverWait(driver,10000);
     driverwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("password"))));


//xpath("//*[@id=\"]")
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(logind.password);
    System.out.println(driver);
   driver.quit();
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
		
	}

