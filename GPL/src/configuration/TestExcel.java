package configuration;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import jxl.read.biff.BiffException;

import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class TestExcel
{
   public static void main(String[] args) 
      throws BiffException, IOException, WriteException
   {
      WritableWorkbook wworkbook;
      wworkbook = Workbook.createWorkbook(new File("output.xls"));
      WritableSheet wsheet = wworkbook.createSheet("First Sheet", 0);
      
      for(int i=0;i<10;i++)
      {
    	  for(int j=0;j<1;j++)
    	  {
    		  Label label = new Label(j, i, "A label record"+i);  
    		  wsheet.addCell(label);
    	  }
    	  
      }
     /* Label label = new Label(0, 2, "A label record");
      wsheet.addCell(label);
      Number number = new Number(3, 4, 3.1459);
      wsheet.addCell(number);*/
      wworkbook.write();
      wworkbook.close();

      Workbook workbook = Workbook.getWorkbook(new File("output.xls"));
      Sheet sheet = workbook.getSheet(0);
      Cell cell1 = sheet.getCell(0, 2);
      System.out.println(cell1.getContents());
      Cell cell2 = sheet.getCell(3, 4);
      System.out.println(cell2.getContents());
      workbook.close();
   }
}
