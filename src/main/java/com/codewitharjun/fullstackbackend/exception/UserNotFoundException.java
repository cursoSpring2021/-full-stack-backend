package com.codewitharjun.fullstackbackend.exception;

public class UserNotFoundException  extends  RuntimeException{

    public UserNotFoundException (Long id){
        super("Could no find user: " + id);
    }
}
