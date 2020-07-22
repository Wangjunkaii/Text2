package dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import base.BaseHealth;
import beans.Die;
import beans.Health;

public  class HealthDao extends BaseHealth<Health> {
	@Override
	public boolean updateByCondtion(Health health) {
		List<Health> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("update record set  ");
		
		try {

			if(health != null) {
				if(health.getHname()!=null&&!"".equals(health.getHname())) {
					sql.append(" name = ? ,ssex = ? ,address = ? ,birthday = ?,number = ?,blood = ?,RH = ?,jibing = ?,guomin = ?,jiwang = ? where id = ?");
				}
				
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(health!=null) {
				stm.setInt(1, health.getHid());
				stm.setString(2, health.getHname());
				stm.setString(3, health.getHssex());
				stm.setString(4, health.getHaddress());
				stm.setString(5, health.getHbirthday());
				stm.setInt(6, health.getHnumber());
				stm.setString(7, health.getHblood());
				stm.setString(8, health.getHRH());
				stm.setString(9, health.getHjibing());
				stm.setString(10, health.getHguomin());
				stm.setString(11, health.getHjiwang());
				
			}
			
			
			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	

	@Override
	public List<Health> selectByCondtion(Health health) {
		List<Health> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append(" select * from record where 1=1 ");
		String tmp = null;
		try {
			
			if(health != null) {
				if(health.getHname()!=null&&!"".equals(health.getHname())) {
					sql.append(" and name like ?");
					tmp = health.getHname();
				}
				
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(health!=null) {
				stm.setString(1, tmp);
			}
			
			
			ResultSet set = stm.executeQuery();
		
			while(set.next())
			{
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String ssex = set.getString(3);
				String address = set.getString(4);
				String birthday = set.getString(5);
				int number = set.getInt(6);
				String blood = set.getString(7);
				String RH= set.getString(8);
				String jibing = set.getString(9);
				String guomin = set.getString(10);
				String jiwang = set.getString(11);
				
				Health health1= new Health();
				
				health1.setHid(id);
				health1.setHname(name);
				health1.setHssex(ssex);
				health1.setHaddress(address);
				health1.setHbirthday(birthday);
				health1.setHblood(blood);
				health1.setHnumber(number);
				health1.setHRH(RH);
				health1.setHjibing(jibing);
				health1.setHguomin(guomin);
				health1.setHjiwang(jiwang);
				list.add(health1);
			}
			return list;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	
		return null;
	}



	@Override
	public boolean insertByCondtion(Health health) {
		List<Die> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		//增加
		sql.append(" insert into record(id,name,ssex,address,birthday,number,blood,RH,jibing,guomin,jiwang) ");
		
		try {

			if(health != null) {
				if(health.getHname()!=null&&!"".equals(health.getHname())) {
					sql.append(" values(?,?,?,?,?,?,?,?,?,?,?)");
				}
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(health!=null) {
				stm.setInt(1, health.getHid());
				stm.setString(2, health.getHname());
				stm.setString(3, health.getHssex());
				stm.setString(4, health.getHaddress());
				
				stm.setString(5, health.getHbirthday());
				stm.setInt(6, health.getHnumber());
				stm.setString(7, health.getHblood());
				stm.setString(8, health.getHRH());
				
				stm.setString(9, health.getHjibing());
				stm.setString(10, health.getHguomin());
				stm.setString(11, health.getHjiwang());
				
				
				
				
				
				
			}
			
			
			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
	}



	@Override
	public boolean deleteByCondtion(Health health) {
		List<Health> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		//增加
		sql.append(" delete from died ");
		try {

			if(health != null) {
				if(health.getHid()!=null) {
					sql.append(" where id = ?");
				}
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(health!=null) {
				stm.setInt(1,health.getHid());
				
			}
			

			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
		return false;
	
	}

	
}
