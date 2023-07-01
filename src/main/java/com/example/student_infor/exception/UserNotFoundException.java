package com.example.student_infor.exception;

import java.security.PublicKey;

public class UserNotFoundException extends  RuntimeException{
    public  UserNotFoundException(Long id){
        super("Could not find the user with Id "+ id);
    }
}
