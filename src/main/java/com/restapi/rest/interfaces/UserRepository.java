package com.restapi.rest.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.rest.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
