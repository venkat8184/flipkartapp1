package com.flipkart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="flips")
public class Flipkart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name="user_name",nullable=false,unique=true)
private String userName;
	@Column(name="password",nullable=false,unique=true)
private String password;
	public void setId(long id) {
		this.id=id;
	}
	public long getId() {
		return id;
	}
	public void setName(String id) {
		this.userName=id;
	}
	public String getName() {
		return userName;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
}
