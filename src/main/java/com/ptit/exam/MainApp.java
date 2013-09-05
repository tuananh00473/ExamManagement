package com.ptit.exam;

import com.ptit.exam.ui.control.MainController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
    public static void main(String... args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        MainController mainController = context.getBean(MainController.class);
        mainController.showMainGui();
    }
}
