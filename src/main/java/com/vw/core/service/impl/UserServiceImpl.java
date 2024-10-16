package com.vw.core.service.impl;

import com.vw.core.dto.UserDto;
import com.vw.core.entity.User;
import com.vw.core.repository.UserRepository;
import com.vw.core.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    ModelMapper modelMapper;

    @Override
    public User saveUser(@NotNull UserDto user) {
        return userRepository.save(modelMapper.map(user, User.class));
    }
}
