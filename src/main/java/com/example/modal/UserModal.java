package com.example.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModal {

	private String userName;
	@Id
	private String userEmail;
	@Id
	private String userId;
	private String password;
	private String userAddress;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	@Override
	public String toString() {
		return "UserModal [userName=" + userName + ", userEmail=" + userEmail + ", userId=" + userId + ", password="
				+ password + ", userAddress=" + userAddress + "]";
	}
	
}
