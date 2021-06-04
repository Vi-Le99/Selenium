package readWriteExel;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public void writeExcel(String filePath, String fileName, String sheetName, String[] dataToWrite)
			throws IOException {
		/*viet noi dung vao 1 file co san
		 * 
		 * 1. tao 1 object class File, truyen duong dan vao ham new File() de mo file 
		 * 2. tao 1 object class fileInputStream de doc file, truyen file can doc vao ham new 
		 * 3. tao object Workbook, kiem tra duoi file, dua duoi file ma tao workbook tuong ung
		 * 4. dem so row da co, tao 1 row moi, truyen du lieu vao row do
		 * 5. dong input, output stream
		 * 
		 */
		File file = new File(filePath + "\\" + fileName);
		FileInputStream inputStream = new FileInputStream(file);

		Workbook book2 = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		if (fileExtensionName.equals(".xlsx")) {
			book2 = new XSSFWorkbook(inputStream);

		}

		else if (fileExtensionName.equals(".xls")) {
			book2 = new HSSFWorkbook(inputStream);

		}

		Sheet sheetBook = book2.getSheet(sheetName);

		int rowCount = sheetBook.getLastRowNum() - sheetBook.getFirstRowNum();

		//Row row = sheetBook.getRow(0);

		Row newRow = sheetBook.createRow(rowCount + 1);

//		for (int j = 0; j < row.getLastCellNum(); j++) {
//
//			Cell cell = newRow.createCell(j);
//
//			cell.setCellValue(dataToWrite[j]);
//
//		}
		int j = 0;
		int a = dataToWrite.length;
		while (j < a) {
			Cell cell = newRow.createCell(j);
			cell.setCellValue(dataToWrite[j]);
			j++;
		}
		// Close input stream

		inputStream.close();

		FileOutputStream outputStream = new FileOutputStream(file);

		book2.write(outputStream);

		outputStream.close();

	}

	public static void main(String... strings) throws IOException {

		String[] valueToWrite = { "emmme", "chao", "hello" };

		WriteExcel objExcelFile = new WriteExcel();

		objExcelFile.writeExcel("C:\\Users\\PC\\Documents", "Book1.xlsx", "Sheet1", valueToWrite);

	}

}
