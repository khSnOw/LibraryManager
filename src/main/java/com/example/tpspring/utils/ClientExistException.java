package com.example.tpspring.utils;

public class ClientExistException extends Exception {

    private Long id;

    public ClientExistException(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return String.format(" Client with Id : %d Already Exist on database",id);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
