package readWriteExel;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {
	/*
	 *1. tao 1 object class File, truyen duong dan vao ham new File() de mo file
	 *2. tao 1 object class fileInputStream de doc file, truyen file can doc vao ham new
	 *3. tao object Workbook, kiem tra duoi file, dua duoi file ma tao workbook tuong ung
	 *4. tao object sheet de doc noi dung, tim so dong, so cot roi doc noi dung (nho vong for)
	 */
	public void readExcelFile(String filePath,String fileName,String sheetName) throws IOException{

	    //tao 1 object class File de mo file

	    File file =    new File(filePath+"\\"+fileName);

	    //tao object FileInputStream class de doc file exel

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook book1 = null;

	    //lay extension cua file

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    

	    if(fileExtensionName.equals(".xlsx")){
	    	    book1 = new XSSFWorkbook(inputStream);

	    }

	    else if(fileExtensionName.equals(".xls")){
	        book1 = new HSSFWorkbook(inputStream);

	    }
	    //doc sheet
	    Sheet bookSheet = book1.getSheet(sheetName);
	    //tim so dong
	    int rowCount = bookSheet.getLastRowNum()-bookSheet.getFirstRowNum();
	    //doc file
	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = bookSheet.getRow(i);

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            System.out.print(row.getCell(j).getStringCellValue()+" || ");

	        }

	        System.out.println();
	    } 
	    inputStream.close();

		}  

	   
	    public static void main(String...strings) throws IOException{


	    ReadExcel objExcelFile= new ReadExcel();

	    //String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";

	    objExcelFile.readExcelFile("C:\\Users\\PC\\Documents","Book1.xlsx","Sheet1");

	    }
	
}
