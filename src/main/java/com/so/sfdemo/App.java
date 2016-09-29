package com.so.sfdemo;

import com.so.sfdemo.component.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Stan
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        MessagePrinter p = ctx.getBean(MessagePrinter.class);
        p.printMessage("hello spring");
    }
}
