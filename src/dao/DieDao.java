package dao;


import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import base.BaseDie;
import beans.Die;
import beans.User;
import comr.MainFrame;
import swing.MainUser;

public class DieDao extends BaseDie<Die>{

	@Override
	public List<Die> selectByCondtion(Die die) {
		getConnection();
		List<Die> list = new ArrayList<>();
		//创建链接
		StringBuilder sql = new StringBuilder();
		sql.append(" select * from died where 1=1 ");
		
		try {
			String tmp = null;
			if(die != null) {
				if(die.getDname()!=null&&!"".equals(die.getDname())) {
					sql.append(" and name like ?");
					tmp = die.getDname();
				}
				
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(die!=null) {
				stm.setString(1, tmp);
			}
			
			
			ResultSet set = stm.executeQuery();
		
			while(set.next())
			{
				
				int id = set.getInt(1);
				String name = set.getString(2);
				int age = set.getInt(3);
				String ssex = set.getString(4);
				String address = set.getString(5);
				Die die1 = new Die();
				die1.setDid(id);
				die1.setDname(name);
				die1.setDage(age);
				die1.setSsex(ssex);
				die1.setDaddress(address);
				list.add(die1);
			}
			return list;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public boolean updateByCondtion(Die die) {
		List<Die> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("update died set  ");
		
		try {

			if(die != null) {
				if(die.getDname()!=null&&!"".equals(die.getDname())) {
					sql.append(" name = ? ,age = ? ,ssex = ? ,address = ? where id = ?");
				}
				
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(die!=null) {
				stm.setString(1, die.getDname());
				stm.setInt(2, die.getDage());
				stm.setString(3, die.getSsex());
				stm.setString(4, die.getDaddress());
				stm.setInt(5, die.getDid());
			}
			
			
			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean insertByCondtion(Die die) {
		List<Die> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		//增加
		sql.append(" insert into died(id,name,age,ssex,address) ");
		
		try {

			if(die != null) {
				if(die.getDname()!=null&&!"".equals(die.getDname())) {
					sql.append(" values(?,?,?,?,?)");
				}
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(die!=null) {
				stm.setInt(1, die.getDid());
				stm.setString(2, die.getDname());
				stm.setInt(3, die.getDage());
				stm.setString(4, die.getSsex());
				stm.setString(5, die.getDaddress());
				
			}
			
			
			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean deleteByCondtion(Die die) {
		List<Die> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		//增加
		sql.append(" delete from died ");
		try {

			if(die != null) {
				if(die.getDid()!=null) {
					sql.append(" where id = ?");
				}
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(die!=null) {
				stm.setInt(1,die.getDid());
				
			}
			

			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
		return false;
	
	}
	
	
	
	public static void main(String[] args) {
		//DieDao dieD = new DieDao();
//		List<Die> list = dieD.selectByCondtion(null);
//		Iterator<Die> it = list.iterator();
//		while(it.hasNext()) {
//			Die tmp = it.next();
//			System.out.println(tmp.getDid()+" "+tmp.getDname());
		
//		}
//		
//		Die tmp = new Die();
//		tmp.setDid(6);
//		tmp.setDname("张5");
//		tmp.setDage(95);
//		tmp.setSsex("女");
//		tmp.setDtime("2020-7-18 18:45:36");
//		tmp.setDlocale("大庆七场");
//		tmp.setDaddress("瞎买不");
//		boolean insertByCondtion = dieD.insertByCondtion(tmp);
//		System.out.println(insertByCondtion);
	}

	
	
	
}
