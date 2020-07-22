package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import base.BaseLocal;
import beans.Local;


public  class LocalDao extends BaseLocal<Local>{

	@Override
	public List<Local> selectByCondtion(Local local) {
		getConnection();
		List<Local> list = new ArrayList<>();
		//创建链接
		StringBuilder sql = new StringBuilder();
		sql.append(" select * from localdie where 1=1 ");
		
		try {
			List<String> listP = new ArrayList<>();
			if(local != null) {
				if(local.getLname()!=null&&!"".equals(local.getLname())) {
					sql.append(" and name like ?");
					
					listP.add(local.getLname());
				}
				
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(local!=null) {
				stm.setString(1,listP.get(0) );
			}
			
			
			ResultSet set = stm.executeQuery();
		
			while(set.next())
			{
				
				int id = set.getInt(1);
				String name = set.getString(2);
				int age = set.getInt(3);
				String ssex = set.getString(4);
				String time = set.getString(5);
				String dielocal = set.getString(6);
				String address = set.getString(7);
				
				Local local1 = new Local();
				local1.setLid(id);
				local1.setLname(name);
				local1.setLage(age);
				local1.setSsex(ssex);
				local1.setLtime(time);
				local1.setLdielocal(dielocal);
				local1.setLaddress(address);
				list.add(local1);
			}
			return list;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public boolean updateByCondtion(Local local) {
		List<Local> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("update localdie set  ");
		
		try {

			if(local != null) {
				if(local.getLname()!=null&&!"".equals(local.getLname())) {
					sql.append(" name = ? ,age = ? ,ssex = ? ,time = ?,dielocal = ?,address = ? where id = ?");
				}
				
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(local!=null) {
				stm.setString(1, local.getLname());
				stm.setInt(2,local.getLage());
				stm.setString(3, local.getSsex());
				stm.setString(4, local.getLaddress());
				stm.setString(5, local.getLtime());
				stm.setString(6, local.getLdielocal());
				stm.setInt(7,local.getLid());
			}
			
			
			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean insertByCondtion(Local local) {
		List<Local> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		//增加
		sql.append(" insert into localdie(id,name,age,ssex,time,dielocal,address) ");
		
		try {

			if(local != null) {
				if(local.getLname()!=null&&!"".equals(local.getLname())) {
					sql.append(" values(?,?,?,?,?,?,?)");
				}
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(local!=null) {
				stm.setInt(1, local.getLid());
				stm.setString(2, local.getLname());
				stm.setInt(3, local.getLage());
				stm.setString(4, local.getSsex());
				stm.setString(5, local.getLtime());
				stm.setString(6, local.getLdielocal());
				stm.setString(7, local.getLaddress());
				
			}
			
			
			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean deleteByCondtion(Local local) {
		List<Local> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		//增加
		sql.append(" delete from localdie ");
		try {

			if(local != null) {
				if(local.getLid()!=null) {
					sql.append(" where id = ?");
				}
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(local!=null) {
				stm.setInt(1,local.getLid());
				
			}
			

			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
		return false;
	
	}
	
	
	
	public static void main(String[] args) {
	
	}

	
}

