package e.g.dao;

import java.util.List;

import e.g.model.User;

public interface UserDao {
	//查询所有用户
	public List<User> selectAllUsers();
	//查询指定ID
	public void selectUserById(String userId);
	//模糊查询
	public List<User> selectUserByName(String userName);
	//插入数据
	public void insert(User user);
	
	public void insertBySeq(User user);
	//删除数据
	public void delete(String userId);
	//修改数据
	public void update(User user);
}
