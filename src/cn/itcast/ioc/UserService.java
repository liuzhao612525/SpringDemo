package cn.itcast.ioc;

public class UserService {
	
	private UserDao userDao;
	
	public void add() {
		System.out.println("UserService..........");
		System.out.println("userDao....." + userDao);
		userDao.add();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
