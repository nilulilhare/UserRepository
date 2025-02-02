package com.secular.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.secular.main.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
