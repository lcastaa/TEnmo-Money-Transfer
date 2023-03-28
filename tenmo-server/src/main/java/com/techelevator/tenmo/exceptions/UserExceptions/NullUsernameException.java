package com.techelevator.tenmo.exceptions.UserExceptions;

public class NullUsernameException extends Exception{

    public NullUsernameException(){
        super("Username Cannot Be Null");
    }


}
