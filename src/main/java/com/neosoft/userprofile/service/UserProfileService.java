package com.neosoft.userprofile.service;

import java.util.List;

import com.neosoft.userprofile.entity.User;

public interface UserProfileService {
	
	User createUser(User user);
	User getUserById(Long userId);
	List<User> getAllUser();
	User updateUser(Long user);	
}
