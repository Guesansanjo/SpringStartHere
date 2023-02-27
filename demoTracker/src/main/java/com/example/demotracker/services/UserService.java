package com.example.demotracker.services;

import com.example.demotracker.domain.User;
import com.example.demotracker.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;



}
