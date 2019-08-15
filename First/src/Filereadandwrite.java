import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereadandwrite {

	public static void main(String[] args) throws IOException {
		//Create a file
		//write in it
		//read it
		File f=new File("/Users/madhuri/Downloads/sampledata.txt");
      f.createNewFile();
      //write in a file
      FileWriter fw=new FileWriter("/Users/madhuri/Downloads/sampledata.txt");
      BufferedWriter bw=new BufferedWriter(fw);
      bw.write("Hallo who are you");
      bw.newLine();
      char[] cbuf= {'N','M','S','B'};
      bw.write(cbuf);
      bw.flush();
      //read
      FileReader frr= new FileReader("/Users/madhuri/Downloads/sampledata.txt");
      BufferedReader fr=new BufferedReader(frr);
      fr.readLine();
      System.out.println(fr.readLine());
      
      System.out.println(fr.readLine()); 
      
     
	}

}
