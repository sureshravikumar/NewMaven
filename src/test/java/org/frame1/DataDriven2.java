package org.frame1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven2 {
	public static void main(String[] args) throws IOException {
		// to create and write in excel
		// File f = new
		// File("C:\\Users\\Suresh\\eclipse-workspace\\MavenEx\\Excels\\createXcl.xlsx");
		// Workbook book = new XSSFWorkbook();
		// Sheet sh = book.createSheet("xcelCreate");
		// Row r = sh.createRow(0);
		// Cell c = r.createCell(0);
		// c.setCellValue("Anand");
		// FileOutputStream fout = new FileOutputStream(f);
		// book.write(fout);
		// System.out.println("done");

		// to update or overwrite in excel
		File f = new File("C:\\Users\\Suresh\\eclipse-workspace\\MavenEx\\Excels\\createXcl.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("xcelCreate");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		String name = c.getStringCellValue();
		if (name.startsWith("An")) {
			c.setCellValue("Ashok");
		} else {
			c.setCellValue("Apple");
		}
		FileOutputStream fout = new FileOutputStream(f);
		book.write(fout);
		System.out.println("done");
	}
}
