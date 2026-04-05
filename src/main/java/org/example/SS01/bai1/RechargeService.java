package org.example.SS01.bai1;

public class RechargeService {
    private PaymentGateway gateway;

    public RechargeService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processRecharge(String username, double amount) {
        gateway.pay(amount);
        System.out.println("Giao dịch thành công cho tài khoản: " + username);
    }
}
