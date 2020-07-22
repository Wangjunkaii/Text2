package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import base.BaseHouse;
import base.BaseLocal;
import beans.House;
import beans.Local;

public class HouseDao  extends BaseHouse<House>{

	@Override
	public List<House> selectByCondtion(House house) {
		getConnection();
		List<House> list = new ArrayList<>();
		//创建链接
		StringBuilder sql = new StringBuilder();
		sql.append(" select * from house where 1=1 ");
		
		try {
			List<String> listP = new ArrayList<>();
			if(house != null) {
				if(house.getHname()!=null&&!"".equals(house.getHname())) {
					sql.append(" and name like ?");
					
					listP.add(house.getHname());
				}
				
				
			}	
			//创建Statement 对象
			PreparedStatement stm = conn.prepareStatement(sql.toString());
			if(house!=null) {
				stm.setString(1,listP.get(0) );
			}
			
			
			ResultSet set = stm.executeQuery();
		
			while(set.next())
			{
				
				int houseid = set.getInt(1);
				String name = set.getString(2);
				String address = set.getString(3);
				String number = set.getString(4);
				int mecd = set.getInt(5);
				int meid = set.getInt(6);
				int zip = set.getInt(7);
				
				House house1 = new House();
				house1.setHhouseid(houseid);
				house1.setHname(name);
				house1.setHaddress(address);
				house1.setHnumber(number);
				house1.setHmecd(mecd);
				house1.setHmeid(meid);
				house1.setHzip(zip);
				list.add(house1);
			}
			return list;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return null;
	}

}
