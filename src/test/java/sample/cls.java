package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cls {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ANAND\\eclipse-workspace\\vasanthi\\ExcelRead\\target\\Book2.xlsx");
		FileOutputStream f1 = new FileOutputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("NOV");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("vasanthi");
		
		XSSFRow row1 = sheet.createRow(0);
		XSSFCell cell1 = row1.createCell(1);
		cell.setCellValue("shivani");
		
		XSSFRow row2 = sheet.createRow(0);
		XSSFCell cell2 = row2.createCell(2);
		cell.setCellValue("anand");
	
		book.write(f1);
	}

}
