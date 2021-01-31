package com.neosoft.userprofile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.userprofile.entity.User;
import com.neosoft.userprofile.repository.UserRepository;

@Service
public class UserProfileServiceImpl implements UserProfileService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long userId) {
		Optional<User> userOpt = userRepository.findById(userId);
		if (userOpt.isPresent()) {
			return userOpt.get();
		}
		return null;
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(Long userId,User user) {
		Optional<User> userOpt = userRepository.findById(userId);
		return userRepository.save();
	}

}
