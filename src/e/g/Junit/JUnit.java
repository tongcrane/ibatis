package e.g.Junit;

import e.g.dao.UserDao;
import e.g.dao.impl.UserDaoImpl;
import e.g.model.User;

public class JUnit {
	public static void main(String[] args) {
		UserDao userDao=new UserDaoImpl();
		//1、查询所有用户
		for (User u:userDao.selectAllUsers()) {
			System.out.println(u);
		}
		
		//2、查询指定ID
		//userDao.selectUserById("3");
		
		//3、模糊查询
		/*for(User u:userDao.selectUserByName("a")){
			System.out.println(u);
		}*/
		
		//4、插入数据
		/*User u=new User();
		u.setUserId("10");
		u.setUserName("bbb");
		u.setPassword("abcde");
		u.setEmail("anycrane@126.com");
		u.setPhone("12345678910");
		userDao.insert(u);*/
		
		//5、删除数据
		//userDao.delete("10");
		
		//6、修改数据
		/*User u=new User();
		u.setUserId("6");
		u.setUserName("abc");
		u.setPassword("123456");
		u.setEmail("fdkasjj12@126.com");
		u.setPhone(null);
		userDao.update(u);*/
		
		//7、序列插入
		/*User u=new User();
		u.setUserId(30);
		u.setUserName("ccc");
		u.setPassword("123456");
		u.setEmail("anycrane@126.com");
		u.setPhone("12345678910");
		userDao.insertBySeq(u);*/
	}

}
