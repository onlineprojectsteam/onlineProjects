package com.example.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.business.UserBusiness;
import com.example.dao.UserDao;
import com.example.modal.UserModal;

@Service
public class UserBusinessImpl implements UserBusiness {
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserModal> getAlldetails(String s) {
		
		List<UserModal> response = new ArrayList<>();

		response = userDao.findAll();
		if(Objects.nonNull(response)) {
			return response;
		}
		else {
			UserModal userError = new UserModal();
			userError.setStatuscode(HttpStatus.INTERNAL_SERVER_ERROR);
			userError.setStatusDesc("error fetching the user details");
			response.add(userError);
		}
		return response;
	}

	@Override
	public String postUserDetails(UserModal usermodal) {
		try{
			userDao.save(usermodal);
		}catch(IllegalArgumentException e) {
			return " Exception in post userDetails: " + e;
		}
		catch(Exception e) {
			return " Exception in post userDetails: " + e;
		}
		
		return "Successfully posted the details";
	}

	@Override
	public String updateUserDetails(UserModal usermodal2) {
		try {
			userDao.save(usermodal2);
		}catch(IllegalArgumentException e) {
			return "Exception while updating the user details: " +e;
		}
		return "Successfully updated";
	}

	@Override
	public String delectUserDetails(String userEmail) {
		
		try{
			userDao.deleteById(userEmail);
		}catch(IllegalArgumentException e) {
			return "action cannot be completed" + e;
		}

		return "successfully record has been deleted";
	}


}
