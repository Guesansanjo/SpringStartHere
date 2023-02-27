package com.example.demotracker.services;

import com.example.demotracker.domain.User;
import com.example.demotracker.exceptions.EtAuthException;

public class UserServiceImpl implements UserService {
    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }
}
