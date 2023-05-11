package com.example.Tech12.Loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Tech12.Logindomain.login;

@Repository
public interface loginRepository extends JpaRepository<login, Integer>{

	login findlyUsernameAndPassword(String username, String password);

}
