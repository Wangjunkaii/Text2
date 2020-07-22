package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import base.BaseUser;
import beans.User;
import util.DButil;
public class UserDao implements IUserDao {

	@Override
	public User getLogin(String username, String password) {
	//	System.out.println(username+" "+password);
		Connection coon =null;
		PreparedStatement stm=null;
		ResultSet rs=null;
		User user=null;
		try {
			coon=DButil.getConnection();
			String sql ="select * from userinfo where username=? and password = ?";
			stm = coon.prepareStatement(sql);
			stm.setString(1, username);
			stm.setString(2, password);
			rs = stm.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setNote(rs.getString("note"));
				user.setRolename(rs.getString("rolename"));
			//	System.out.println("biao jin");
			}
			
			return user;
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println("yi 1");
		}finally {
			DButil.close(coon, stm, rs);
		
		}
		
		
		return null;
	}

			
}
