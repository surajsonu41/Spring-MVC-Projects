package example.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import bean.ZipBean;

public class ReadExcel {

	public Connection getConnection(String sqlPathName) {
		Connection con = null;
		try {

			Properties pr = new Properties();
			FileInputStream fis = new FileInputStream(sqlPathName);
			pr.load(fis);
			Class.forName(pr.getProperty("Driver"));
			con = DriverManager.getConnection(pr.getProperty("url"), pr.getProperty("username"),
					pr.getProperty("password"));

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return con;
	}

	public static void storeInDB() throws FileNotFoundException, IOException, InterruptedException, SQLException {
		HSSFWorkbook workbook = null;
		FileInputStream file = null;
		Connection sqlConnection = null;
		PreparedStatement pStatement = null;
		
		
		int i = 0;
		try {

			ReadExcel rxl = new ReadExcel();
			sqlConnection = rxl.getConnection("E:/Personal/vtalent_Kiran/ReadExcelFile/ReadExcel/src/sql.properties");
			pStatement = sqlConnection.prepareStatement("insert into us_zip values(?,?,?,?)");
			file = new FileInputStream(new File("E:/Personal/vtalent_Kiran/ReadExcelFile/ReadExcel/zip_code_database.xls"));
			workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> row = sheet.iterator();
			row.next();

			while (row.hasNext()) {
				Row row1 = row.next();
				int zip = (int) row1.getCell(0).getNumericCellValue();
				String state=null;
				String country=null;
				String prim_city=null;
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
				System.out.println(i);

			}
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			// workbook.close();
			file.close();
			pStatement.close();
			sqlConnection.close();

		}

	}

	public static void main(String[] args)
			throws FileNotFoundException, IOException, InterruptedException, SQLException {
		storeInDB();

	}

}
