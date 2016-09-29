package com.so.sfdemo.component;

import com.so.sfdemo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Stan
 */
@Component
public class MessagePrinter {
    
    @Autowired
    private MessageService mService;

    public void printMessage(String message){
        System.out.println(mService.resolveMessage(message));
    }
}
