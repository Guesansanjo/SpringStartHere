package com.example.demotracker.services;

import com.example.demotracker.domain.User;
import com.example.demotracker.exceptions.EtAuthException;
import com.example.demotracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;




    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {

        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if (email !=null) email = email.toLowerCase();
        if(!pattern.matcher(email).matches())
            throw new EtAuthException("Invalid email format");
        Integer count = userRepository.getCountByEmail(email);
        if (count > 0)
            throw new EtAuthException("Email already in use");
        Integer userId= userRepository.create(firstName,lastName,email,password);
        return userRepository.findById(userId);
    }
}
