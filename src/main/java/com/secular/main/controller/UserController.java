package com.secular.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.secular.main.model.User;
import com.secular.mainserviceinterface.UserServiceInterface;

@RestController
public class UserController {
	@Autowired
	private UserServiceInterface usi;
	
	@PostMapping("/saveUserData")
	public ResponseEntity<User> SaveData(@RequestBody User u)
	{
		User UData=usi.SaveUserData(u);
		return new ResponseEntity<User>(UData,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getSingleData/{id}")
	public ResponseEntity<User> getSingleData(@PathVariable int id)
	{
		User UData=usi.getSingelUserData(id);
		return new ResponseEntity<User>(UData,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAllData")
	public ResponseEntity<List<User>> getAllData()
	{
		List<User> UData=usi.getAllUserData();
		return new ResponseEntity<List<User>>(UData,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteData/{id}")
	public void DeletData(@PathVariable int id)
	{
		usi.deleteData(id);
	}
	@PatchMapping("/updateData/{id}")
	public ResponseEntity<User> UpdateData(@RequestBody User u, @PathVariable int id)
	{
		User UData=usi.updateData(u,id);
		return new ResponseEntity<User>(UData,HttpStatus.OK);
		
	}

}
