package com.shtarev.FullApp.service;

import com.shtarev.FullApp.Entity.security.UserEntity;
import com.shtarev.FullApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.lang.String.format;

@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> userOpt = userRepository.getByUsername(username);
        return userOpt.orElseThrow(() -> new UsernameNotFoundException(format("User: %s, not found", username)));
    }
}
