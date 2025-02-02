package com.secular.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secular.main.model.User;
import com.secular.main.repository.UserRepository;
import com.secular.mainserviceinterface.UserServiceInterface;

@Service
public class UserServiceImpl implements UserServiceInterface  {
	@Autowired
	private UserRepository ur;

	@Override
	public User SaveUserData(User u) {
	
		return ur.save(u);
	}

	@Override
	public User getSingelUserData(int id) {
		Optional<User> ud=ur.findById(id);
		return ud.get();
	}

	@Override
	public List<User> getAllUserData() {
		List<User> ud=(List<User>) ur.findAll();
		return ud;
	}

	@Override
	public void deleteData(int id) {
		Optional<User> op=ur.findById(id);
		if(op.isPresent())
		{
			ur.deleteById(id);
		}
		else
		{
			throw new RuntimeException("User not found on this id"+id);
		}
		
	}

	@Override
	public User updateData(User u, int id) {
		Optional<User> op=ur.findById(id);
		if(op.isPresent())
		{
			User original=op.get();
			u.setId(original.getId());
			return ur.save(u);
		}
		else
		{
			throw new RuntimeException("User not found on this id"+id);
		}
		
		
	}

}
