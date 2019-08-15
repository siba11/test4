

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/madhuri/Downloads/chromedriver");
		
		WebDriver driver;
		
		driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
List<WebElement> radiobox=driver.findElements(By.name("sex"));
System.out.println("total radioboxes"+radiobox.size());
radiobox.get(0).click();
System.out.println("first radioboxe"+radiobox.get(0).getTagName());
System.out.println("first radioboxe"+radiobox.get(0).getAttribute("selected"));
driver.quit();
	}

}
