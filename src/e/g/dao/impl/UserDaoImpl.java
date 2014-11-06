package e.g.dao.impl;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import e.g.dao.UserDao;
import e.g.model.User;

public class UserDaoImpl implements UserDao {
	
	private static SqlMapClient sqlMapClient=null;
	static {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("e/g/sqlMapConfig.xml");
			sqlMapClient=SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@SuppressWarnings("unchecked")
	@Override
	//查询所有用户
	public List<User> selectAllUsers() {
		List<User> userList=null;;
		try {
			userList = sqlMapClient.queryForList("selectAllUser");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	//查询指定ID
	public void selectUserById(String userId) {
		try {
			System.out.println(sqlMapClient.queryForObject("selectUserById",userId));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	//模糊查询
	public List<User> selectUserByName(String userName) {
		List<User> userList=null;;
		try {
			userList = sqlMapClient.queryForList("selectUserByName",userName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	//插入数据
	public void insert(User user) {
		try {
			sqlMapClient.insert("insert",user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	//删除数据
	public void delete(String userId) {
		try {
			sqlMapClient.delete("delete",userId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	//修改数据
	public void update(User user) {
		// TODO Auto-generated method stub
		try {
			sqlMapClient.update("update",user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertBySeq(User user) {
		// TODO Auto-generated method stub
		try {
			sqlMapClient.insert("insertBySequence", user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
