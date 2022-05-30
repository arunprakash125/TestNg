package org.newframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Frame2 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\java\\FrameWork2\\Excelsheet\\Table.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Table");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		if (data.equals("Address")) {
			cell.setCellValue("java");
			
		}
		
	FileOutputStream o = new FileOutputStream(file);
	workbook.write(o);
	System.out.println("completed");
		
		
		
	}

}
