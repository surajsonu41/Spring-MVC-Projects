package example.connection;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MySqlConnection {
	private static MySqlConnection mySqlConnection = new MySqlConnection();
	private Connection connection;
	//default constructor to load the connection
	private MySqlConnection() {
		try {

			Properties pr = new Properties();
			File file = new File("H:/Projects/Maven/ApachePOI ORG/apachePOI/ReadExcel/src/sql.properties");
					
			FileInputStream fis = new FileInputStream(file);
			pr.load(fis);
			Class.forName(pr.getProperty("Driver"));
			connection = DriverManager.getConnection(pr.getProperty("url"), pr.getProperty("username"),
					pr.getProperty("password"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getInstance() {
		return mySqlConnection.connection;
	}

}
