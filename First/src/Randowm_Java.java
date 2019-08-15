import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Randowm_Java {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/madhuri/Downloads/chromedriver");
		WebDriver driver;
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.americangolf.co.uk/");
		WebElement golfclub=driver.findElement(By.xpath("//*[@id=\"header-top-wrapper\"]/div/div[2]/div/a/div/div/img"));
	System.out.println("number of golfclub"+golfclub.getSize())	;
	Actions act= new Actions(driver);
	act.moveToElement(golfclub).build().perform();
	WebDriverWait wait= new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\'main\']/div/div[1]/h1"))));
	Random r=new Random();
	r.nextInt();//- select the random
	
	
	
	}

}
	