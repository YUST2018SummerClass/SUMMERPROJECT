import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testEx {

private static void printData(ResultSet rs, String col1, String col2) throws SQLException { 
	while (rs.next()) {
		int Number = rs.getInt(col1);
		String Name = rs.getString(col2);
		System.out.printf("DB Number = %d \tDB Name = %s \n", Number, Name);
		} 
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = new File("src").getAbsolutePath();
	    
		String fileName = path + "/dbtest.xlsx";
		List<testDb> List = new ArrayList<>();

		// Initial needed values
		XSSFWorkbook inputWorkbook = null;
		XSSFRow incurRow;
		XSSFCell incurCell;
		XSSFSheet incurSheet;

		int rowCount = 0;
		
		FileInputStream fis = new FileInputStream(fileName);
		inputWorkbook = new XSSFWorkbook(fis);
		fis.close();
		
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
			Connection conn; 
			Statement stmt = null;
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaClass?useSSL=false&serverTimezone=Asia/Seoul", "root","Kim0087816!");
				System.out.println("DB 연결 완료"); 
				stmt = conn.createStatement();
				stmt.executeUpdate("insert into TestDb(Number, Name) values(" + (int) Float.parseFloat(invalue[0]) + ", '" + invalue[1] + "');");
				ResultSet rs = stmt.executeQuery("select * from TestDb");
				printData(rs, "Number", "Name");
				} catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러"); 
					} catch (SQLException e) {
						System.out.println("SQL 실행 에러"); 
						}
			
			testDb test = new testDb();
			test.setNumber((int) Float.parseFloat(invalue[0]));
			test.setName(invalue[1]);
			test.print();
			
			List.add(test);
		}

		inputWorkbook.close();
		
	}
}
