package org.example.SS01.bai3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CyberOrderApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(CyberOrderApp.class);
        var orderService = context.getBean(OrderFoodService.class);

        System.out.println("--- Test 1: Đặt Mì xào bò ---");
        orderService.placeOrder("datptit", "Mì xào bò", 1, 30000);

        System.out.println("\n--- Test 2: Đặt món không có sẵn ---");
        orderService.placeOrder("datptit", "Cơm rang", 1, 40000);

        System.out.println("\n--- Test 3: Đặt số lượng lớn (Thiếu tiền) ---");
        orderService.placeOrder("datptit", "Mì xào bò", 3, 30000);
    }
}