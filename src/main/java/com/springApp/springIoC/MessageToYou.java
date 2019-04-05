package com.springApp.springIoC;

/**
 * This class is successor of Message in xml configuration
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MessageToYou {
    private String message;
    private String messageToYou;

    public String getMessage() {
        return "This is simple message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageToYou() {
        return "And this message is special for You: " + messageToYou;

    }

    public void setMessageToYou(String messageToYou) {
        this.messageToYou = messageToYou;
    }
}
