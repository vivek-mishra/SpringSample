package spring;

import java.sql.SQLException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
/**
 * @author vivek.mishra
 *
 */
public class LoginClient {
	
	public static void main(String args[]){

		BeanFactory obj = new XmlBeanFactory(new FileSystemResource("src/spring/login.xml"));
		LoginInterface login = (LoginUser)obj.getBean("login");
		login.validateLogin();
		
		//getting the object of connection
		loginDB db = (loginDB)obj.getBean("dao");
		try{
			db.getDBConnection();
		}catch(SQLException e){
			e.printStackTrace();
		}
}
}
