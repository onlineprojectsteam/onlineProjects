package com.example.business;

import java.util.List;

import com.example.modal.UserModal;

public interface UserBusiness{
	public List<UserModal> getAlldetails(String s);
	public String postUserDetails(UserModal usermodal1);
	public String updateUserDetails(UserModal usermodal2);
	public String delectUserDetails(String userEmail);

}
