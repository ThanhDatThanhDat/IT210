package org.example.SS01.bai3;

import org.springframework.stereotype.Repository;

@Repository
public class InventoryRepository {
    public boolean checkStock(String foodItem, int quantity) {
        if (foodItem.equals("Mì xào bò")) return 5 >= quantity;
        return false;
    }

    public void reduceStock(String foodItem, int quantity) {
        System.out.println("Đã trừ " + quantity + " " + foodItem + " trong kho.");
    }
}