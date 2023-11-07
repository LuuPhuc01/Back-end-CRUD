package com.codewithLP.BackendCRUD.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Can not find user with id "+id);
    }
}
