package com.springApp.springIoC;

/**
 * This class is parent in xml configuration
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Message {
    private String message;

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
