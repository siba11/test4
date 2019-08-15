import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","/Users/madhuri/Downloads/chromedriver"	);
		
WebDriver driver=new ChromeDriver();
//driver.get("www.google.com");

driver.get("http://facebook.com");
String pagtitle = driver.getTitle();
driver.findElement(By.xpath("//*[@id='email']")).sendKeys("madhurinaresh@gmail.com");
driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("facebook2018");
driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
System.out.print(pagtitle);

driver.close();
driver.quit();

	}
}
