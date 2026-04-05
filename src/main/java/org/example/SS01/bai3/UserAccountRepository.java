package org.example.SS01.bai3;

import org.springframework.stereotype.Repository;

@Repository
public class UserAccountRepository {
    public double getBalance(String username) {
        return 50000;
    }

    public void deductMoney(String username, double amount) {
        System.out.println("Đã trừ " + amount + " VNĐ từ tài khoản " + username);
    }
}