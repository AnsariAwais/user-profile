package com.neosoft.userprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.userprofile.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
