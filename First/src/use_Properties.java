import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class use_Properties {

	public static void main(String[] args) throws IOException {
		Properties pf= new Properties();
		FileInputStream fis= new FileInputStream("/Users/madhuri/eclipsewk/First/src/Family.properties");
				//(System.getProperty("user.dir")+"/First/src/Family.properties");
   pf.load(fis);
   System.out.println(pf.getProperty("name"));
   
   
	}
	
}
	