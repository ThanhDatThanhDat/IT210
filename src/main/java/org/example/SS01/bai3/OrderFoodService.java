package org.example.SS01.bai3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFoodService {
    @Autowired
    private InventoryRepository inventoryRepo;

    @Autowired
    private UserAccountRepository userRepo;

    public void placeOrder(String username, String foodItem, int quantity, double pricePerUnit) {
        double totalCost = pricePerUnit * quantity;

        // Bẫy dữ liệu 1: Kiểm tra kho
        if (!inventoryRepo.checkStock(foodItem, quantity)) {
            System.err.println("LỖI: Món " + foodItem + " đã hết hàng!");
            return;
        }

        // Bẫy dữ liệu 2: Kiểm tra số dư
        if (userRepo.getBalance(username) < totalCost) {
            System.err.println("LỖI: Tài khoản " + username + " không đủ tiền (Cần " + totalCost + " VNĐ)");
            return;
        }

        // Xử lý nếu mọi thứ hợp lệ
        inventoryRepo.reduceStock(foodItem, quantity);
        userRepo.deductMoney(username, totalCost);
        System.out.println("THÀNH CÔNG: Đã đặt " + quantity + " " + foodItem + " cho " + username);
    }
}