
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/madhuri/Downloads/chromedriver"	);
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.qtpselenium.com/contact-us");
		WebElement cname=driver.findElement(By.xpath("//*[@id='exampleInputEmail3']"));
		cname.sendKeys("madhuri");
		WebElement cemail=driver.findElement(By.name("email"));
		cemail.sendKeys("madhuri@gmail.com");
		WebElement cdropdown=driver.findElement(By.name("country_id"));
		Select s=new Select(cdropdown);
		s.selectByValue("10");
		List<WebElement> dropcount=s.getOptions();
		System.out.println("the size of the dropdown"+dropcount.size() );
		for(WebElement e : dropcount){
				System.out.println(e.getText());
				takeScreenShot();
		
		}
		//driver.quit();

			
	}
	public static void takeScreenShot() {			
		File srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File(System.getProperty("user.dir")+"Radio.jpg"));
				
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
				
		
		
	}

}
	