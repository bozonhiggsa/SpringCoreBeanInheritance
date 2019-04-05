package com.springApp.springIoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MessageInheritanceRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inheritance-message-config.xml");

        Message message = (Message) context.getBean("message");

        System.out.println("First Bean:");
        System.out.println(message.getMessage());

        System.out.println("=====================================");
        MessageToYou messageToYou = (MessageToYou) context.getBean("messageToYou");
        System.out.println("Second Bean:");
        System.out.println(messageToYou.getMessage());
        System.out.println(messageToYou.getMessageToYou());
    }
}
