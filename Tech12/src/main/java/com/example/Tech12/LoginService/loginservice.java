package com.example.Tech12.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tech12.Logindomain.login;
import com.example.Tech12.Loginrepository.loginRepository;

@Service

public class loginservice {
	@Autowired
	private loginRepository repo;

	   public login login(String username, String password) {
		   login user= repo.findlyUsernameAndPassword(username, password);
		    return user;

}
}
