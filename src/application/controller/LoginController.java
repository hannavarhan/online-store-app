package application.controller;
import database.LoginDAO;
import application.Forms.LoginForm;

/**
 * @author User-PC
 * @version 1.0
 * @created 05-���-2021 7:31:26
 */
public class LoginController {

	public LoginDAO loginDAO;
	public LoginForm loginForm;

	public LoginController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param password
	 * @param username
	 */
	public boolean login(String password, String username){
		return false;
	}

	public void showLoginForm(){

	}

}