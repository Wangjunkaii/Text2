package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import beans.Public;

public abstract class BasePublic<T> {
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/sm";
	private static String user="root";
	private static String password="z";
	public Connection conn = null;
	public void getConnection()
	{
		try { //º”‘ÿ«˝∂Ø¿‡
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public abstract List<T> selectByCondtion(Public public2);
	public abstract boolean updateByCondtion(Public public2);
	public abstract boolean insertByCondtion(Public public2);
	public abstract boolean deleteByCondtion(Public public2);
	
	
}
