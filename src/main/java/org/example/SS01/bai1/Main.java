package org.example.SS01.bai1;

public class Main {
    public static void main(String[] args) {
        // 1. Nếu muốn dùng cổng nội bộ:
        PaymentGateway internal = new InternalPaymentGateway();
        RechargeService service = new RechargeService(internal);
        service.processRecharge("datptit", 50000);

        System.out.println("---");

        // 2. Nếu sau này có thêm Momo, bạn chỉ cần tạo class Momo và truyền vào đây:
        // PaymentGateway momo = new MomoPaymentGateway();
        // RechargeService service2 = new RechargeService(momo);
        // service2.processRecharge("datptit", 100000);
    }
}
