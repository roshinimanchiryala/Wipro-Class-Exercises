package com.gl.security.Security.with.in.my.sql;
import java.util.Set;

import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String password;
	
	@ManyToMany
	@JoinTable(name = "user_role", joinColumns= @JoinColumn(name= "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role>roles;
	public User() {
		
	}
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
		
	}
	

}
