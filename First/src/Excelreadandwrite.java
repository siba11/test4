import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Excelreadandwrite {
	public void readExcelfile(String filePath,String fileName,String sheetName) throws IOException {
		//create an object of file class to oepn XLSX
		//File file=new File("/Users/madhuri/Downloads/sampledata.xlsx");
		File file= new File("/Users/madhuri/eclipsewk/First/src/Testdatasimple1.xls");
		//to create an object FileInputStream to read an Excel file
		FileInputStream inputstream=new FileInputStream(file);
		Workbook newworkbook=null;
		//find the extension of file by using splitting functionality
		String fileextensiontype=fileName.substring(fileName.indexOf("."));
		//check the condition if the file is .xlxs
		if(fileextensiontype.equals(".xlsx")) {
	
		newworkbook=new XSSFWorkbook(inputstream);
}
		else if(fileextensiontype.equals(".xls")) {
		newworkbook=new HSSFWorkbook(inputstream);
		
           }
	
//read excel sheet by sheetname
		
		Sheet Firstsheet=newworkbook.getSheet(sheetName);
	//get the row count
		
	int rowcount=Firstsheet.getLastRowNum()-Firstsheet.getFirstRowNum();
	//create a loop to get all the rows
	for(int i=0;i<rowcount;i++) {
				Row row=Firstsheet.getRow(i);
				//get 
				for (int j = 0; j < row.getLastCellNum(); j++) {

		            //Print Excel data in console

		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

		        }

		        System.out.println();
	
		
	}
	}
	    	
	public static void main(String[] args) throws InterruptedException, IOException {	
		//String[] valurTowrite= {"madhuri","Naresh","Sindhu","Balaji"};
		//create an object of the current class
		Excelreadandwrite 	objExcelFile=new Excelreadandwrite();
	    //Write the file using file name, sheet name and the data to be filled
		String filePath=System.getProperty("user.dir"+"/First/src/");
		String fileName="Testdatasimple1.xls";

		objExcelFile.readExcelfile(filePath, fileName, "Testdatasimple");
				
	}
		
	
}
			