package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modal.UserModal;

public interface UserDao extends JpaRepository<UserModal, String>{

}
