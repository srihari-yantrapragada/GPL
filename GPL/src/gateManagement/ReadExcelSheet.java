package gateManagement;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcelSheet {

	/**
	 * @param args
	 */
	static String testCaseStatus="";
	public static String sendFormName(String formName)
	{
		String status=readMyExcelFileByPath();
		//System.out.println("==FORM NAME IS:::========="+formName);
		return status;
	}
	
	public static String readMyExcelFileByPath() {

		try {

			String execute = "DEFAULT";
			String scenarioName = "DEFAULT";
			String action = "DEFAULT";
			String testData = "DEFAULT";
			String objectRep="";
			String url="";

			FileInputStream fis = new FileInputStream(new File("C:\\Users\\envision\\Desktop\\iportman_selenium\\IportMan\\ExcelSheetFolder\\Data_Source.xls"));
			
			
			HSSFWorkbook hssfWorkBook = new HSSFWorkbook(fis);
			int noOfSheets = hssfWorkBook.getNumberOfSheets();
			int i = 0;
			while (noOfSheets - (noOfSheets - i) < noOfSheets) {
				
				HSSFSheet hssfSheet = hssfWorkBook.getSheetAt(noOfSheets
						- (noOfSheets - i));
				Iterator<Row> noOfRowsAvailable = hssfSheet.iterator();
				while (noOfRowsAvailable.hasNext()) {
					//System.out.println("From Next Row");
					Row rowReturned = noOfRowsAvailable.next();
					//System.out.println(rowReturned.getRowNum());
					Iterator<Cell> noOfCellsForSelectedRow = rowReturned
							.cellIterator();
					if (rowReturned.getRowNum() > 1) {
						while (noOfCellsForSelectedRow.hasNext()) {
							Cell cellObjReturned = noOfCellsForSelectedRow
									.next();

							switch (cellObjReturned.getCellType()) {

							case Cell.CELL_TYPE_NUMERIC:
								/*System.out.println("Numeric Value Returned :"
										+ cellObjReturned.getNumericCellValue()
										+ "**** Column Index Is Nume "
										+ cellObjReturned.getColumnIndex());
								*/break;
							case Cell.CELL_TYPE_STRING:
								/*System.out.println("String Value Returned :"
										+ cellObjReturned.getStringCellValue()
										+ "**** Column Index Is Stri "
										+ cellObjReturned.getColumnIndex());*/
								int columnIndex = cellObjReturned
										.getColumnIndex();

								if (columnIndex == 2) {
									scenarioName = cellObjReturned
											.getStringCellValue();
								} else if (columnIndex == 8) {
									execute = cellObjReturned
											.getStringCellValue();
								} else if (columnIndex == 4) {
									action = cellObjReturned
											.getStringCellValue();
								} else if (columnIndex == 7) {
									testData = cellObjReturned
											.getStringCellValue();
								}
								
								else if (columnIndex == 5) {
								 objectRep = cellObjReturned
											.getStringCellValue();
								} else if (columnIndex == 6) {
									url = cellObjReturned
											.getStringCellValue();
								}
								break;
							}
						}
					}
					if (scenarioName != "DEFAULT" && testData.equalsIgnoreCase("Yes")) {
						
						//testCaseStatus=ExportOrder.S_01(objectRep, url);
					
						return  testCaseStatus;
						
						//System.out.println("Final Test CAse Status For Corresponding form");
					}
					/*execute = "DEFAULT";
					scenarioName = "DEFAULT";
					action = "DEFAULT";
					testData = "DEFAULT";*/
				}
				i++;
			}
			fis.close();
		} catch (Exception e) {

			e.printStackTrace();

		}
		
		return testCaseStatus;
	}
}
