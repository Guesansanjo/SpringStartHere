package com.example.demotracker.repositories;

import com.example.demotracker.domain.User;
import com.example.demotracker.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById (Integer userId);
}
