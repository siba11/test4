import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filereadwriteutil { 
	public void Fileread(String filepath,String filename,String sheetname) throws IOException {
	//open xlsx file
	File file=new File("/Users/madhuri/git/test4/First/src/Testdatasimple1.xls");
	//read the file
	FileInputStream inputst=new FileInputStream(file);
	//create a workbook object
	Workbook workbook=null;
	 workbook=new HSSFWorkbook(inputst);
	//create object of sheet
	sheetname="Testdatasimple";
	Sheet sheet=workbook.getSheet(sheetname);
	int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
     for(int i=1;i<rowCount+1;i++) {
    	 //Cell cell=sheet.getRow(i).getCell(1);
    	 //cell.setCellType(Cell.CELL_TYPE_STRING);
    	 //row.getCell(j).getStringCellValue()+"|| ");
    	 //driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
    	 Row row=sheet.getRow(i);
    	 int colcount=row.getLastCellNum();
    	 Cell userid=sheet.getRow(i).getCell(0);
    	 
    	 System.out.println(userid);
    	 
    	 
    	 //System.out.println(colcount);
    	/* for(int j=0;j<colcount;j++) {
    		String cellval=new String(row.getCell(j).getStringCellValue()).toString();
    		//System.out.println(cellval);
    		if(cellval.contains("Userid")){
    			String Userid =cellval.toString();
    			System.out.println(Userid);
    		} //else { System.out.println("User Id not Found");
    	
    		}*/
    			
    	 
    	}
    	 
     }
	public void Filewrite(String filepath,String filename,String sheetname,String[] sampleData) throws IOException {
		//open xlsx file
		File file=new File("/Users/madhuri/git/test4/First/src/Testdatasimple1.xls");
		//read the file
		FileInputStream inputst=new FileInputStream(file);
		//create a workbook object
		Workbook workbook=null;
		 workbook=new HSSFWorkbook(inputst);
		//create object of sheet
		sheetname="Testdatasimple";
		Sheet sheet=workbook.getSheet(sheetname);
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row newrow=sheet.createRow(rowCount+1);
	     for(int i=0;i<newrow.getLastCellNum();i++) {
	    	 Cell newCell=newrow.createCell(i);
	    	 newCell.setCellValue(sampleData[i]);
	    	 inputst.close();
	    	 FileOutputStream outputstr=new FileOutputStream(file);
	    	 workbook.write(outputstr);
	    	 outputstr.close();
	    	 //Cell cell=sheet.getRow(i).getCell(1);
	    	 //cell.setCellType(Cell.CELL_TYPE_STRING);
	    	 //row.getCell(j).getStringCellValue()+"|| ");
	    	 //driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
	    	 //Row row=sheet.getRow(i);
	    	 //int colcount=row.getLastCellNum();
	    	 //Cell userid=sheet.getRow(i).getCell(0);
	    	 
	    	 //System.out.println(userid);
	    	 
	    	 
	    	 //System.out.println(colcount);
	    	/* for(int j=0;j<colcount;j++) {
	    		String cellval=new String(row.getCell(j).getStringCellValue()).toString();
	    		//System.out.println(cellval);
	    		if(cellval.contains("Userid")){
	    			String Userid =cellval.toString();
	    			System.out.println(Userid);
	    		} //else { System.out.println("User Id not Found");
	    	
	    		}*/
	    			
	    	 
	    	}
	    	 
	     }
	
	public static void main(String[] arg) throws IOException {
		Filereadwriteutil objectfile=new Filereadwriteutil();
	String[] sampleData= {"hello","how","fine"};
		objectfile.Filewrite("/Users/madhuri/git/test4/First/src/","Testdatasimple1.xls","Testdatasimple",sampleData);
}
}
