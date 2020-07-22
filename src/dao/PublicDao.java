package dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import base.BasePublic;
import beans.Die;
import beans.Public;

public class PublicDao extends BasePublic<Public> {
	@Override
	public boolean updateByCondtion(Public public2) {
		
		List<Public> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("update public set  ");
		
		try {

			if(public2 != null) {
				if(public2.getPname()!=null&&!"".equals(public2.getPname())) {
					sql.append(" name = ? ,ssex = ? ,height = ?,weight = ?,bloodpressure = ?,see = ?,vital = ? where id = ?");
				}
				
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(public2!=null) {
				stm.setInt(1, public2.getPid());
				stm.setString(2, public2.getPname());
				stm.setString(3, public2.getPssex());
				stm.setInt(4, public2.getPheight());
				stm.setInt(5, public2.getPweight());
				stm.setString(6, public2.getPbloodpressure());
				stm.setString(7, public2.getPsee());
				stm.setString(8, public2.getPvital());
				
			}
			
			
			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	

	@Override
	public List<Public> selectByCondtion(Public public2) {
		List<Public> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append(" select * from public where 1=1 ");
		
		try {
			List<Object> listP = new ArrayList<>();
			if(public2 != null) {
				if(public2.getPname()!=null&&!"".equals(public2.getPname())) {
					sql.append(" and name like ?");
					listP.add(public2.getPname());
				}
				if(public2.getPhouseid()!=null) {
					sql.append(" and houseid = ?");
					listP.add(public2.getPhouseid());
				}
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(public2!=null) {
				for (int i = 0; i < listP.size(); i++) {
					stm.setObject(i+1, listP.get(i));
				}
			}
			
			
			ResultSet set = stm.executeQuery();
		
			while(set.next())
			{
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String ssex = set.getString(3);
				int height = set.getInt(4);
				int weight = set.getInt(5);
				String bloodpressure = set.getString(6);
				String see =set.getString(7);
				String vital = set.getString(8);
				
				
				Public public1= new Public();
				
				public1.setPid(id);
				public1.setPname(name);
				public1.setPssex(ssex);
				public1.setPheight(height);
				public1.setPweight(weight);
				public1.setPbloodpressure(bloodpressure);
				public1.setPsee(see);
				public1.setPvital(vital);
				
				list.add(public1);
			}
			return list;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	
		return null;
	}


	@Override
	public boolean insertByCondtion(Public public2) {
		List<Public> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		//增加
		sql.append(" insert into public(id,name,ssex,height,weight,bloodpressure,see,vital) ");
		
		try {

			if(public2 != null) {
				if(public2.getPname()!=null&&!"".equals(public2.getPname())) {
					sql.append(" values(?,?,?,?,?,?,?,?)");
				}
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(public2!=null) {
				stm.setInt(1, public2.getPid());
				stm.setString(2, public2.getPname());
				stm.setString(3, public2.getPssex());
				stm.setInt(4, public2.getPheight());
				stm.setInt(5, public2.getPweight());
				stm.setString(6, public2.getPbloodpressure());
				stm.setString(7, public2.getPsee());
				stm.setString(8, public2.getPvital());
				
			}
			
			
			
			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
	}



	@Override
	public boolean deleteByCondtion(Public public2) {
		List<Public> list = new ArrayList<>();
		//创建链接
		getConnection();
		StringBuilder sql = new StringBuilder();
		//增加
		sql.append(" delete from public ");
		try {

			if(public2 != null) {
				if(public2.getPid()!=null) {
					sql.append(" where id = ?");
				}
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(public2!=null) {
				stm.setInt(1,public2.getPid());
				
			}
			

			stm.executeUpdate();
			
			
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
		return false;
	}

	
}
