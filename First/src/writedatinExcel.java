import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;			

public class writedatinExcel {
	
	public void writedatainExcel(String filePath,String fileName,String sheetName,String[] sampledata) throws IOException {
		//create an object to open a Excel file
		File file=new File("/Users/madhuri/eclipsewk/First/src/Testdatasimple1.xls");
		//creat an object to read
		FileInputStream inputStream= new FileInputStream(file);
		Workbook newworkbook=null;
		//find the file is xlsx or xlx
		String FileExtension=fileName.substring(fileName.indexOf("."));
		if(FileExtension.equals("xlsx")){
			newworkbook=new XSSFWorkbook(inputStream);
		    }
			else if(FileExtension.equals("xls")) {
				newworkbook=new HSSFWorkbook(inputStream);
		
		      }
		
	Sheet Firstsheet = newworkbook.getSheet(sheetName);
		//get row count
		int rowCount = Firstsheet.getLastRowNum()-Firstsheet.getFirstRowNum();
		//create a new row
		Row newrow=Firstsheet.createRow(rowCount+1);
		  for(int j = 0; j < newrow.getLastCellNum(); j++){

		        //Fill data in row

		        Cell cell = newrow.createCell(j);

		        cell.setCellValue(sampledata[j]);

		    }

		    //Close input stream

		  inputStream.close();
		  //Create an object of FileOutputStream class to create write data in excel file

		    FileOutputStream outputStream = new FileOutputStream(file);

		    //write data in the excel file

		    newworkbook.write(outputStream);

		    //close output stream

		    outputStream.close();
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    //Create an array with the data in the same order in which you expect to be filled in excel file

        String[] valueToWrite ={"Naresh","Madhuri","Sindhu","Balaji"};
        //String fielPath="/Users/madhuri/eclipsewk/First/src/Testdatasimple1.xls";
        //Create an object of current class
        String filePath=System.getProperty("user.dir"+"/First/src/");
        writedatinExcel objExcelFile = new writedatinExcel();

            //Write the file using file name, sheet name and the data to be filled
        objExcelFile.writedatainExcel(filePath,"Testdatasimple1.xls", "Firstsheet", valueToWrite);
	}

}
