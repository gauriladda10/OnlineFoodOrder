package com.example.foodorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodorder.model.UserRegister;
import com.example.foodorder.repo.UserRegisterRepo;



@RestController
@CrossOrigin("http://localhost:4200/")
public class UserRegisterController {
  
	 @Autowired
     private UserRegisterRepo repo;
	 
     @PostMapping("/user")
     public ResponseEntity<UserRegister> registerUser(@RequestBody UserRegister user){
   	  System.out.println("Controlled is called");
   	  return ResponseEntity.ok(repo.save(user));
     }
}
