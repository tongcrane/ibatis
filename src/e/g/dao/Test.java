package e.g.dao;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import e.g.model.User;

public class Test {
	
	
	public List<User> selectAllUsers() {
		SqlMapClient sqlMapClient=null;
		List<User> userList=null;
		Reader reader;
			try {
				reader = Resources.getResourceAsReader("e/g/sqlMapConfig.xml");
				sqlMapClient=SqlMapClientBuilder.buildSqlMapClient(reader);
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}				
		try {
			userList = sqlMapClient.queryForList("selectAllUser");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
}
