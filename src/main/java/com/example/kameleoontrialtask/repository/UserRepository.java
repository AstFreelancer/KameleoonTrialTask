package com.example.kameleoontrialtask.repository;

import com.example.kameleoontrialtask.model.MyUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<MyUser, Integer> {
}