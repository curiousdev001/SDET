package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelReader {
	    
	    public static Object[][] readTestData(String filePath, String sheetName) {
	        Object[][] testData = null;
	        try {
	            FileInputStream file = new FileInputStream(new File(filePath));
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	            XSSFSheet sheet = workbook.getSheet(sheetName);
	            int rowCount = sheet.getLastRowNum();
	            int colCount = sheet.getRow(0).getLastCellNum();
	            testData = new Object[rowCount][colCount];
	            for (int i = 1; i <= rowCount; i++) {
	                Row row = sheet.getRow(i);
	                for (int j = 0; j < colCount; j++) {
	                    Cell cell = row.getCell(j);
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            testData[i - 1][j] = cell.getStringCellValue();
	                            break;
	                        case NUMERIC:
	                            testData[i - 1][j] = cell.getNumericCellValue();
	                            break;
	                        case BOOLEAN:
	                            testData[i - 1][j] = cell.getBooleanCellValue();
	                            break;
	                        default:
	                            testData[i - 1][j] = null;
	                    }
	                }
	            }
	            workbook.close();
	            file.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return testData;
	    }
	}



