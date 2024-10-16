package com.vw.core.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collation = "user")
public class User {

    @Id
    @Field(name = "id")
    private Integer id;

    @Field(name = "userId")
    private String userId;

    @Field(name = "firstName")
    private String firstName;

    @Field(name = "lastName")
    private String lastName;

    @Field(name = "fullName")
    private String fullName;

    @Field(name = "gender")
    private char gender;

    @DocumentReference
    @Field(name = "contactDetailsId")
    private UserContactDetails contactDetailsId;

    @DocumentReference
    @Field(name = "addressId")
    private UserAddress addressId;
}
