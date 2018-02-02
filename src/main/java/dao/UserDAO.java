package dao;

import pojo.User;
import util.DBHelper;

public class UserDAO extends BaseDAO<User>{
	public void add(User user){
		String sql = "insert into user(username,password,mobilephone) values(?,?,?)";
		super.update(sql, new Object[]{
				user.getUsername(),
				user.getPassword(),
				user.getMobilephone()
		}, DBHelper.getConn());
	}
	
}
