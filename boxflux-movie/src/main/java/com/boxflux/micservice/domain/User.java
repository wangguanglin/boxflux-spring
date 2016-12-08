package com.boxflux.micservice.domain;

import java.math.BigDecimal;


public class User {
	private Long id;
	
	
	private String userName;
	
	
	private String sex;
	
	
	private Short age;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Short getAge() {
		return age;
	}


	public void setAge(Short age) {
		this.age = age;
	}


	public BigDecimal getBalance() {
		return balance;
	}


	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}


	private BigDecimal balance;
}
