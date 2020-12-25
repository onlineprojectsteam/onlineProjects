package com.example.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.http.HttpStatus;

@Entity
public class UserModal {

	@Column(name = "User_Name")
	private String userName;
	
	@Id
	@Column(name = "user_Email")
	private String userEmail;
	
	@Column(name = "user_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userId;
	
	@Column(name = "Encrypted_Password")
	private String password;
	
	@Column(name = "user_Address")
	private String userAddress;
	
	private HttpStatus statuscode;
	private String statusDesc;
	
	
	public HttpStatus getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(HttpStatus statuscode) {
		this.statuscode = statuscode;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
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
