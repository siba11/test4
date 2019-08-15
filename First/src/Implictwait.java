import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implictwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/madhuri/Downloads/chromedriver");
		
		WebDriver driver;
		
		driver= new ChromeDriver();
driver.get("https://portfolio.rediff.com/portfolio-login");
//Thread.sleep(3000);- wait 3 seconda 
driver.findElement(By.id("useremail")).sendKeys("madhuri@test.com");
driver.findElement(By.id("emailsubmit")).click();
//explict wait
WebDriverWait wait= new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userpass"))));
driver.findElement(By.id("userpass")).sendKeys("test1234");

	}

}
