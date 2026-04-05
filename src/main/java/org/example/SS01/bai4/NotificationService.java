package org.example.SS01.bai4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

interface MessageSender {
    void send(String message);
}

@Component
class EmailSender implements MessageSender {
    public void send(String msg) { System.out.println("Email: " + msg); }
}

@Component
class SmsSender implements MessageSender {
    public void send(String msg) {
        throw new RuntimeException("Lỗi kết nối mạng SMS!");
    }
}

@Service
public class NotificationService {
    private final MessageSender emailSender;
    private final MessageSender smsSender;

    @Autowired
    public NotificationService(EmailSender emailSender, SmsSender smsSender) {
        this.emailSender = emailSender;
        this.smsSender = smsSender;
    }

    public void notifyUser(double amount) {
        try {
            smsSender.send("Nạp thành công " + amount);
        } catch (Exception e) {
            System.out.println("Sms lỗi, đang dùng Email dự phòng...");
            emailSender.send("Thông báo nạp tiền: " + amount);
        }
    }
}