package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {
	public static Properties CONFIG=null;
	public static Properties OR=null;
	public static WebDriver driver=null;
	public static EventFiringWebDriver dr=null;
	
	
	public void initialize() throws IOException {
		
		//config property file
		if(CONFIG==null) {
		CONFIG= new Properties();
		FileInputStream fn=new FileInputStream("/Users/madhuri/git/test4/First/src/util/config.properties");
		CONFIG.load(fn);
		//OR property file
		OR= new Properties();
		FileInputStream fn1=new FileInputStream("/Users/madhuri/git/test4/First/src/util/OR.properties");
		OR.load(fn1);
		System.setProperty("webdriver.browser.driver", "driverlocation");
		
		if(CONFIG.getProperty("browser").equals("chrome")){
			driver=new ChromeDriver();
			
		}
		dr=new EventFiringWebDriver(driver);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	}


public static WebElement getObject(String xpathVal) {
		try {
	return driver.findElement(By.xpath(xpathVal));
	} catch (Throwable t) {
		
	}
		return null;
	
}
}
