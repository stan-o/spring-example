package com.so.sfdemo.component;

import com.so.sfdemo.service.MessageService;
import com.so.sfdemo.service.SimpleMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 *
 * @author Stan
 */
//@Component
public class MessagePrinter {
    private SimpleMessageService mService;
    
    public void setmService(SimpleMessageService mService) {
        this.mService = mService;
    }
    
    public void printMessage(String message){
        System.out.println(mService.resolveMessage(message));
    }
}
