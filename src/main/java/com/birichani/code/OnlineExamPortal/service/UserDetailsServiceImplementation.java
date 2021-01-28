package com.birichani.code.OnlineExamPortal.service;

import com.birichani.code.OnlineExamPortal.models.Users;
import com.birichani.code.OnlineExamPortal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException {
        Users users = userRepository.getUserByUsername(username);

        if (users == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        return new UsersDetails(users);
    }


}
