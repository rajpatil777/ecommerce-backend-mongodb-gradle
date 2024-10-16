package com.vw.core.dto;

import com.vw.core.entity.UserAddress;
import com.vw.core.entity.UserContactDetails;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

public class UserDto {

    private Integer id;

    private String userId;

    private String firstName;

    private String lastName;

    private String fullName;

    private char gender;

    private UserContactDetails contactDetailsId;

    private UserAddress addressId;
}
