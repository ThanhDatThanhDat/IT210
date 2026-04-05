package org.example.SS01.bai1;

public class InternalPaymentGateway implements PaymentGateway{
    @Override
    public void pay(double amount) {
        System.out.println("Đang xử lý thanh toán nội bộ: " + amount + " VNĐ");
    }
}
