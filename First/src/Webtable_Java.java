import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Java {
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/madhuri/Downloads/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		int rnum=getRowNumWithCellData("614.80");
		driver.quit();

	}

	
public static int getRowNumWithCellData(String data) {
	List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	System.out.println("the number os rows"+rows);
		for(int rnum=0;rnum<rows.size();rnum++) {
			WebElement row=rows.get(rnum);
			List<WebElement> Cells=row.findElements(By.tagName("td"));
			int rcells=Cells.size();
			System.out.println("the number of cells"+ rcells);
			for(int cnum=0;cnum<rcells;cnum++) {
					String Celldata=Cells.get(cnum).getText();
					System.out.println("the cell data"+Celldata);
					if (Celldata.equals(data))
						return++rnum;
			}
			
		}
		
	return -1;
	
	
	
	

		
}
}				