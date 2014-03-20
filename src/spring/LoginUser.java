/**
 * 
 */
package spring;

/**
 * @author vivek.mishra
 *
 */
public class LoginUser implements LoginInterface{
	
	String userName="";
	String password="";
	
	public LoginUser(String userName,String password)
	{
		this.userName = userName;
		this.password = password;
	}
	
	public boolean validateLogin()
	{
		if(userName.equalsIgnoreCase("Spring") && password.equalsIgnoreCase("Spring")){
			System.out.println("Welcome to spring world");
			return true; 
		}
		else{
			System.out.println("Sorry!!!!!!!!");
			return false;
		}
	}
}