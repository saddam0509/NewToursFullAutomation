package com.sadi.newtours1.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sadi.newtours1.dto.Login;

public class ExcelUtils {

	private static FileInputStream inputStream=null;
	private static Workbook workbook=null;
	
	public static List<Login> getLoginData() throws IOException{
		List<Login> logins=new ArrayList<Login>();
		
		//login is the first sheet in excel so getSheet parameter set to 0
		Iterator<Row> iterator = ExcelUtils.getSheet(0).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            Login login=new Login();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					login.setUserName(cell.getStringCellValue());
					cellCounter++;
					break;
				case 1:
					login.setPassword(cell.getStringCellValue());
					break;
				default:
					break;
				}               
                 
            }
            logins.add(login);
        }
        close();
		return logins;
}

	private static void close() throws IOException{
				workbook.close();
				inputStream.close();
		
	}

	private static Sheet getSheet(int sheetNo) throws IOException{
		inputStream = new FileInputStream(new File("D://Testing/Java Codes/newtours1/newtours1.xlsx"));
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = (Sheet) workbook.getSheetAt(sheetNo);
		return sheet;
	}
	}

