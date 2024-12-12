package com.edubridge.maven_project1;

public class AuthService {
	String userName = "admin";
	String userPassword = "admin123";
        public boolean authenticate(String userName, String userPassword) {
			if(this.userName.equals(userName) && this.userPassword.equals(userPassword)) {
				return true;
			}else
        	return false;
        	
        }
}
