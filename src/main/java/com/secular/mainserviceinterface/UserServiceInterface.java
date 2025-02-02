package com.secular.mainserviceinterface;

import java.util.List;

import com.secular.main.model.User;

public interface UserServiceInterface {

	User SaveUserData(User u);

	User getSingelUserData(int id);

	List<User> getAllUserData();

	void deleteData(int id);

	User updateData(User u, int id);

	

}
