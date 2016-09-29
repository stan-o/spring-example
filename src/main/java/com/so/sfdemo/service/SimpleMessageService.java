package com.so.sfdemo.service;


/**
 *
 * @author Stan
 */
public class SimpleMessageService implements MessageService{

    @Override
    public String resolveMessage(String message) {
        return "resolved message: \""+message+"\"";
    }
    
}
