package T01_0716;

import java.io.*;
import java.sql.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile02 {
	
	public static void main(String[] args) throws IOException{
		String path = new File("c://test").getAbsolutePath();

		String fileName = path + "/num.xlsx";

		// Order class lists 
		List<Number> numList = new ArrayList<>();

		// Initial needed values
		XSSFWorkbook inputWorkbook = null;
		XSSFRow incurRow;
		XSSFCell incurCell;
		XSSFSheet incurSheet;

		int rowCount = 0;

		// Open file & get file data
		FileInputStream fis = new FileInputStream(fileName);
		inputWorkbook = new XSSFWorkbook(fis);
		fis.close();

		// Process sheet data

		// Get 1ST sheet
		incurSheet = inputWorkbook.getSheetAt(0);

		// Get 1ST sheet number of rows
		rowCount = incurSheet.getPhysicalNumberOfRows();

		for (int rowIndex = 1; rowIndex < rowCount; rowIndex++) {
		// Get row
		incurRow = incurSheet.getRow(rowIndex);

		String invalue[] = new String[5];

		int cellCount = incurRow.getPhysicalNumberOfCells();
		for (int cellIndex = 0; cellIndex < cellCount; cellIndex++) {
		// Get every cell data	
			incurCell = incurRow.getCell(cellIndex);

			switch (incurCell.getCellTypeEnum()) {

			case STRING:
				invalue[cellIndex] = incurCell.getStringCellValue() + "";
				break;

			case NUMERIC:
				invalue[cellIndex] = incurCell.getNumericCellValue() + "";
				break;

			default:
				System.out.println(incurCell.getCellTypeEnum());
				}
			}

			Number numb = new Number();
			numb.setNumber((int)Float.parseFloat(invalue[0]));
			numb.setName(invalue[1]);
			//numb.printOut();
			
			
			Connection conn;
			Statement stmt = null;		
		
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaClass","root","tjd963");
				System.out.println("DB연결 완료");
				stmt = conn.createStatement();
				stmt.executeUpdate("insert into ordermenu(tableNum, orderedMenu) values ("+(int)Float.parseFloat(invalue[0])+",'"+invalue[1]+"');");
			
			} catch(ClassNotFoundException e){
				e.printStackTrace();
				System.out.println("JDBC 드라이버 로드 에러");
			} catch(SQLException e){
				e.printStackTrace();
				System.out.println("DB연결 오류");
			} 
			
		}
		
		inputWorkbook.close();
	}
}
