package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modal.UserModal;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/getUserDetails")
	public String getAllUserDetails() {
		
		return "World";
	}
	
//	@PutMapping
//	public UserModal updateUserDetails(UserModal usermodal) {
//		
//		return new UserModal();
//	}
//	
//	@PostMapping
//	public String addUserDetails(UserModal usermodal) {
//		
//		return "";
//	}
//	
//	@DeleteMapping
//	public String deleteUserDetails(String userEmail) {
//		
//		return "";
//	}

}
