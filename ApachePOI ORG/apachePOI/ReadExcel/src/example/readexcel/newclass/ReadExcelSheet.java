package example.readexcel.newclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import example.connection.MySqlConnection;

public class ReadExcelSheet {
	
	public static void storeInDB() throws FileNotFoundException, IOException, InterruptedException, SQLException {
		HSSFWorkbook workbook = null;
		FileInputStream file = null;
		Connection sqlConnection = MySqlConnection.getInstance();
		PreparedStatement pStatement = null;

		int i = 0;
		try {
			
			pStatement = sqlConnection.prepareStatement("insert into us_zip values(?,?,?,?)");
			System.out.println(java.time.LocalTime.now());
			file = new FileInputStream(
					new File("H:/Projects/Maven/ApachePOI ORG/apachePOI/ReadExcel/zip_code_database.xls"));
			workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> row = sheet.iterator();
			row.next();

			while (row.hasNext()) {
				Row row1 = row.next();
				int zip = (int) row1.getCell(0).getNumericCellValue();
				String state = null;
				String country = null;
				String prim_city = null;
				try {
					state = row1.getCell(5).getStringCellValue();
				} catch (NullPointerException ne) {
					state = "";
				}
				try {
					country = row1.getCell(6).getStringCellValue();
				} catch (NullPointerException ne) {
					country = "";
				}

				try {
					prim_city = row1.getCell(2).getStringCellValue();
				} catch (NullPointerException ne) {
					prim_city = null;
				}

				pStatement.setInt(1, zip);
				pStatement.setString(2, prim_city);
				pStatement.setString(3, state);
				pStatement.setString(4, country);
			

				pStatement.executeUpdate();
				i++;
				System.out.println("Row inserted in to table " +i);

			}
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			// workbook.close();
			System.out.println(java.time.LocalTime.now());   
			file.close();
			pStatement.close();
			sqlConnection.close();

		}

	}
	
	public static void main(String[] args) {
		try {
			storeInDB();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
