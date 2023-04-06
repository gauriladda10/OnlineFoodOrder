package com.example.foodorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.foodorder.model.UserRegister;

@Repository
public interface UserRegisterRepo extends JpaRepository<UserRegister,String>{

}
