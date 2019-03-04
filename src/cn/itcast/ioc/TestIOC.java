package cn.itcast.ioc;
import java.util.Set;

import org.junit.Test;
import cn.itcast.bean.Bean3;
import cn.itcast.property.Book;
import cn.itcast.property.Person;
import cn.itcast.property.PropertyDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.bean.Bean2;

public class TestIOC {
	@Test
	public void testUser() {
		//加载spring配置文件，根据创建对象
				ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
//				实例方法（最常用）
				//得到配置创建对象
//				User user = (User)context.getBean("user");
//				User user2 = (User)context.getBean("user");
//				System.out.println(user);
//				System.out.println(user2);
//				user.add();
				
//				静态工厂
//				//得到配置创建对象
//				Bean2 bean2 = (Bean2)context.getBean("bean2");
//				System.out.println(bean2);
//				bean2.add();
		
//				使用实例工厂
		//得到配置创建对象
//		Bean3 bean3 = (Bean3)context.getBean("bean3");
//		System.out.println(bean3);
//		bean3.add();
				
				
//				使用有参数的构造注入属性
//				PropertyDemo1 demo1 = (PropertyDemo1)context.getBean("demo");
//				demo1.test1();
				
//				Set方法注入属性值
//				Book book = (Book)context.getBean("book");
//				book.demoBook();
				
				
//				注入对象属性
//				UserService service = (UserService)context.getBean("userService");
//				service.add();
		
				Person person = (Person)context.getBean("person");
				person.test1();
				
	}
}
