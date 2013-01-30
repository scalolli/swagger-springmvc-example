package com.mangofactory.swagger.springmvc.example;

import com.wordnik.swagger.core.ApiProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Integer userStatus;
    private String password;
}
