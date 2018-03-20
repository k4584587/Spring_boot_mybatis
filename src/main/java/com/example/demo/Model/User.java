package com.example.demo.Model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private String username;
    private String password;
    private String nickname;
    private String email;
    private Date date;

}
