package spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author vivek.mishra
 *
 */

public class loginDB {

	private String dbms=null;
	private String url=null;
	private String driver=null;
	private String dbName=null;
	private String userName=null;
	private String password=null;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDbms() {
		return dbms;
	}

	public void setDbms(String dbms) {
		this.dbms = dbms;
	}

	public Connection getDBConnection() throws SQLException {
	    Connection conn = null;
	    
	    if (dbms.equals("mysql")) {	    	
//			String url = "jdbc:mysql://localhost:3306/";
//			String dbName = "prepaid2";
//			String driver = "com.mysql.jdbc.Driver";
//			String userName = "prepaid2"; 
//			String password = "prepaid2";
			try {
				Class.forName(driver).newInstance();
				conn = DriverManager.getConnection(url+dbName,userName,password);
				System.out.println("Connected to the database");
				conn.close();
				System.out.println("Disconnected from database");
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	    System.out.println("Connected to database");
	    return conn;
	  }


}
