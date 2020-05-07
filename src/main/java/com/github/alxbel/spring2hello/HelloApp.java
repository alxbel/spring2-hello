package com.github.alxbel.spring2hello;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloApp {
    public static void main(String[] args) throws Exception {
        //BeanFactory factory =
        //        new XmlBeanFactory(new FileSystemResource("hello.xml"));


        ClassPathResource resource = new ClassPathResource("hello.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        GreetingService greetingService =
                (GreetingService) factory.getBean("greetingService");

        greetingService.sayGreeting();
    }
}