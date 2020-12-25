package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.modal.UserModal;
@Repository
public interface UserDao extends JpaRepository<UserModal, String>{

}
