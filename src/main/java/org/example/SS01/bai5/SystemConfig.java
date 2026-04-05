package org.example.SS01.bai5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemConfig {

    @Value("Cyber Center - Chi nhánh PTIT")
    private String branchName;

    @Value("08:00")
    private String openingHour;

    public void displayConfig() {
        System.out.println("=== CẤU HÌNH HỆ THỐNG ===");
        System.out.println("Chi nhánh: " + branchName);
        System.out.println("Giờ mở cửa: " + openingHour);
    }
}