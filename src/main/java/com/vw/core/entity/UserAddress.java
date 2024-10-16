package com.vw.core.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collation = "userAddress")
public class UserAddress {

    @Id
    @Field(name = "id")
    private Integer id;

    @Field(name = "firstLine")
    private String firstLine;

    @Field(name = "secondLine")
    private String secondLine;

    @Field(name = "taluka")
    private String taluka;

    @Field(name = "district")
    private String district;

    @Field(name = "state")
    private String state;

    @Field(name = "pinCode")
    private Integer pinCode;
}
