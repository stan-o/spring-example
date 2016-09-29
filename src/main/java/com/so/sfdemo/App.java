package com.so.sfdemo;

import com.so.sfdemo.component.MessagePrinter;
import com.so.sfdemo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Stan
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MessagePrinter p = ctx.getBean(MessagePrinter.class);
        p.printMessage("hello spring");
    }
}
