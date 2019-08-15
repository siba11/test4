import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/madhuri/Downloads/chromedriver");
		WebDriver driver;
		driver=new ChromeDriver();
		
driver.get("https://www.southwest.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait waitt= new WebDriverWait(driver,10);
//waitt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\'brand\']/img"))));
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div[1]/button")).click();
driver.findElement(By.xpath("//*[@id=\"FlyoutTrigger_5\"]/div/div/div[1]/div/div[1]/div[1]/ul[1]/li[2]/a")).click();
//List<WebElement> allcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
List<WebElement> allradio=driver.findElements(By.name("tripType"));
System.out.println("all check boxes"+allradio.size());
for(int i=0;i<allradio.size();i++) {
//String wid=allradio.get(i).getAttribute("value");
	System.out.println("checkbox name" + allradio.get(i).getAttribute("value"));
	/*driver.findElement(By.id(wid)).click();
	driver.findElement(By.id(wid)).getAttribute("selected"); */
	allradio.get(i).click();
	allradio.get(i).getAttribute("selected");
	
	
	
	
}
			
	}

}
