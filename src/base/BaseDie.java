package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDie<Die> {
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
	
	public abstract List<Die> selectByCondtion(Die die);
	public abstract boolean updateByCondtion(Die die);
	public abstract boolean insertByCondtion(Die die);
	public abstract boolean deleteByCondtion(Die die);
	
}
