package com.InMemoryDB.H2DB.error;

public class DeptNotFound extends Exception{
    public DeptNotFound(String message){
        super(message);
    }
}
