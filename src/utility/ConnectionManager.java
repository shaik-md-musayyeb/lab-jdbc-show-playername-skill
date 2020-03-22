package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	public static Properties loadPropertiesFile() throws IOException {
		Properties p = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		p.load(in);
		in.close();
		return p;
	}
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		Connection conn = null;
		Properties p = loadPropertiesFile();
		String driver = p.getProperty("driver");
		String url = p.getProperty("url");
		Class.forName(driver);
		conn = DriverManager.getConnection(url);
//		if(conn != null)
//			System.out.println("sucess");
		return conn;
	}
}

