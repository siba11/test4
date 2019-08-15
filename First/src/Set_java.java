import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Set_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	in set no duplicate values
		//in set there are no indexs
		WebDriver driver= new FirefoxDriver();
Set<String> s=new HashSet<String>();
s.add("Naresh");
s.add("madhu");
s.add("Sindhu");
s.add("Balaji");
Iterator it=  s.iterator();
it.next();//select next
  //or can use 
  //while(it.HashNext())	
Set<String> windid=driver.getWindowHandles();
Iterator<String> IT= windid.iterator();
String mainwindow=IT.next();
String Firstpopup=IT.next();
System.out.println("The tol number of windows"+windid.size());
System.out.println("the first window id "+IT.next());

driver.switchTo().window(Firstpopup);
driver.close();
	}
	
}
	