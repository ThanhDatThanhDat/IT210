package org.example.SS01.bai2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CyberGameApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CyberGameApp.class);

        PlaySession session1 = context.getBean(PlaySession.class);
        session1.addTime(60); // Máy 1 chơi 60 phút
        System.out.println("Thời gian Máy 01: " + session1.getPlayTime());

        PlaySession session2 = context.getBean(PlaySession.class);
        session2.addTime(30); // Máy 2 chơi 30 phút

        System.out.println("Thời gian Máy 02: " + session2.getPlayTime());
        System.out.println("Máy 01 vẫn là: " + session1.getPlayTime());
    }
}