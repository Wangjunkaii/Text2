package dao;

import beans.User;

public interface IUserDao {
       public User getLogin(String username,String password);
       
}
