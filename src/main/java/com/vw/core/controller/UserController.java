package com.vw.core.controller;


import com.vw.core.dto.UserDto;
import com.vw.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/user")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto user){
        userService.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
