import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataExtraction {

	public ArrayList<String> getData(String testCaseName) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Lokesh\\Selenium\\TestData\\ExcelDrivenTestData.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		int countSheets = wbook.getNumberOfSheets();

		// Find the desired sheet"TestData"
		for (int i = 0; i < countSheets; i++) {
			if (wbook.getSheetName(i).equalsIgnoreCase("TestData")) {
				// the desired sheet"TestData" found
				XSSFSheet wsheet = wbook.getSheetAt(i);
				Iterator<Row> rows = wsheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> firstRowCells = firstRow.iterator();
				int k = 0;
				int desiredCol = 0;
				// Find The desired index of column "TestCase"
				while (firstRowCells.hasNext()) {
					Cell ce = firstRowCells.next();
					if (ce.getStringCellValue().equalsIgnoreCase("TestCase")) {
						// The desired column of "TestCase" found
						desiredCol = k;
					}
					k++;
				}

				// Find the row of Column value"Purchase"

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(desiredCol).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						// the row of Column value"Purchase" found
						Iterator<Cell> citr = r.cellIterator();

						// Display all the data valure of that row
						while (citr.hasNext()) {
							Cell c = citr.next();
							if (c.getCellType().equals(CellType.STRING))
								alist.add(c.getStringCellValue());
							else
								alist.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						}
					}
				}
			}
		}
		return alist;

	}

}
