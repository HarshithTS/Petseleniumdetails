package commonlibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingData {
	String projectDirectory = System.getProperty("user.dir");
	String testDataFilePath = projectDirectory + "\\TestData\\testdata.xlsx";

	public String getexceldata(String SheetName, int rowNum, int colNum)
			throws Exception {
		FileInputStream fis = new FileInputStream(testDataFilePath);
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		String data = cell.getStringCellValue();
		return data;
	}

	public static void main(String[] args) throws Exception {
		ReadingData rd = new ReadingData();
		System.out.println(rd.getexceldata("Sheet1", 0,1));
	}
	public static void writeDataToExcel(String SheetName, int rowNum, int colNum) throws Exception{
		String projectDirectory = System.getProperty("user.dir");
		String testDataFilePath = projectDirectory + "\\WriteData\\WriteData.xlsx";
		FileInputStream fis = new FileInputStream(testDataFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row  =sh.createRow(rowNum);
		Cell cell =row.createCell(colNum);
		cell.setCellValue("");
		FileOutputStream fos =new FileOutputStream("");
		wb.write(fos);
		fos.flush();
		fis.close();
		fos.close();
	}
}
   