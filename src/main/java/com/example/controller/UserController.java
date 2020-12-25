package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.UserBusinessImpl;
import com.example.modal.UserModal;

@RestController
@RequestMapping("/details")
public class UserController {
	
	@Autowired
	private UserBusinessImpl userBusnImpl;
	
	@GetMapping("/getDetails")
	public List<UserModal> getAllUserDetails(@RequestParam String userEmail) {
		List<UserModal> response = new ArrayList<UserModal>();
		response = userBusnImpl.getAlldetails(userEmail);
		
		return response;
	}
	
	@PutMapping("/updateDetails")
	public String updateUserDetails(@RequestBody UserModal usermodal) {
		
		String response = userBusnImpl.updateUserDetails(usermodal);
		return response;
	}
	
	@PostMapping("/addDetails")
	public String addUserDetails(@RequestBody UserModal usermodal) {
		String response = userBusnImpl.postUserDetails(usermodal);
		return response;
	}
	
	@DeleteMapping("/deleteDetails")
	public String deleteUserDetails(@RequestParam String userEmail) {
		String response = userBusnImpl.delectUserDetails(userEmail);
		return response;
	}

}
