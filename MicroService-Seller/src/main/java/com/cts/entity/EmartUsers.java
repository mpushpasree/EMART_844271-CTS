package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EMART_USERS")
public class EmartUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="UID")
	private Integer id;
	
	@Column(name="UNM", nullable = false)
	private String userName;
	
	@Column(name="PWD", nullable = false)
	private String password;
	
	@Column(name="ROLE", nullable = false)
	private String role;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}

