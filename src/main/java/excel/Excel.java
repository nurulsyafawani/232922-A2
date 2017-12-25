/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 232922
 * Name: #NurulSyafawani
 */

package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Excel {

	private static final String FILE_NAME = "result.xlsx";

	public void WriteExcel(String[]result1,String[]result2) {
    	File f = new File(FILE_NAME);
    	if(!(f.exists() && !f.isDirectory())) {     	 
    	try {
			OutputStream file = new FileOutputStream(new File("result.xlsx"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
    	}
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Java Code Info");
        Object[][] datatypes = {
                {"Semester", result1[0]},
                {"Course", result1[1]},
                {"Group", result1[2]},
                {"Task", result1[3]},
                {""},
                {"", "", "","","","Java keyword"},
                {"Matrik", "LOC", "Blank","Comment","ActualLOC","package","class","extends","public","void","static","new","total"},
                {result1[4], result1[5], result1[6], result1[7], result1[8], result1[9], result1[10], result1[11], result1[12] 
                		, result1[13], result1[14], result1[15], result1[16]},
                {result2[4], result2[5], result2[6], result2[7], result2[8], result2[9], result2[10], result2[11], result2[12] 
                		, result2[13], result2[14], result2[15], result2[16]},
        };

        int rowNum = 0;
        System.out.println("Updating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
            Runtime.getRuntime().exec("cmd /c start " + FILE_NAME + "");
        } catch (FileNotFoundException e) {
           // System.out.println("Error in writing Excel file");
           // e.printStackTrace();
        } catch (IOException e) {
           // e.printStackTrace();
        }

        System.out.println("Done");
    }
}