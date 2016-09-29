package com.so.sfdemo.config;

import com.so.sfdemo.component.MessagePrinter;
import com.so.sfdemo.service.MessageService;
import com.so.sfdemo.service.SimpleMessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Stan
 */
@Configuration
@ComponentScan("com.so")
public class AppConfig {
    
    
    @Bean
    public MessagePrinter messagePrinter(){
        return new MessagePrinter();
    }
    @Bean
    public MessageService messageService(){
        return new SimpleMessageService();
    }
    

    
}
