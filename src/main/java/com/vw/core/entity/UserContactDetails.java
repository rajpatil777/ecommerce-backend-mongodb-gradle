package com.vw.core.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collation = "userContactDetails")
public class UserContactDetails {

    @Id
    @Field(name = "id")
    private Integer id;

    @Field(name = "mobileNumber")
    private Long mobileNumber;

    @Field(name = "email")
    private String email;
}
