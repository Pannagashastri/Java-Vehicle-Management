package vehicle;
import java.sql.*;

public class DbConnection {
	
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		String dbDriver = "com.mysql.cj.jdbc.Driver";
//        String dbURL = "jdbc:mysql://localhost:3306/vehicle";
//        // Database name to access
//        String dbName = "vehicle";
//        String dbUsername = "root";
//        String dbPassword = "pannaga";
//  
        Class.forName(dbDriver);
//        Connection con = DriverManager.getConnection(dbURL + dbName,
//                                                     dbUsername, 
//                                                     dbPassword);
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","pannaga");
        return con;
	}
}
