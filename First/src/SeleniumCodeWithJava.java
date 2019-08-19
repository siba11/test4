import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumCodeWithJava {
	

	public static void main(String[] arg) throws InterruptedException {
		//get the path of the chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/madhuri/Downloads/chromedriver");
		//initiate the chrome driver
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("madhuri");
	     //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
     //Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("pass");
    System.out.println(driver);
		//Userid.sendKeys("madhur");
     //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
     
     //Passid.sendKeys("pass");

		Accesstogmail logintogmail=new Accesstogmail("spamland101","test123");
		
		logintogmail.Login(driver);
		driver.quit();
		
	}
	//public class accesstogmail(String userid,String Password) {
	
}
