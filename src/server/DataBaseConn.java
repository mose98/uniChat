package server;

import java.sql.*;
import java.util.Properties;

public class DataBaseConn {
	public DataBaseConn() {
		try {
			Class.forName("org.postgresql.Driver");

			String url = "jdbc:postgresql://localhost/postgres";
			Properties props = new Properties();

			props.setProperty("user","postgres");
			props.setProperty("password","database");
//			props.setProperty("ssl","true");
			Connection conn = DriverManager.getConnection(url, props);

		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}



}
