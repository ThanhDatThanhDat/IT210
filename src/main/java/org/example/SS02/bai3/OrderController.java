package org.example.SS02.bai3;

import org.example.SS02.bai3.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private ServletContext application; // Application Scope

    @GetMapping("/orders")
    public String viewOrders(HttpSession session, Model model) {
        // 1. Kiểm tra session bảo mật
        if (session.getAttribute("loggedUser") == null) {
            return "redirect:/login";
        }

        // 2. Dữ liệu giả định (Request Scope)
        List<Order> list = Arrays.asList(
                new Order("ORD01", "Bàn phím cơ", 1500000.0, new Date()),
                new Order("ORD02", "Chuột không dây", 850000.0, new Date()),
                new Order("ORD03", "Tai nghe Gaming", 2100000.0, new Date())
        );
        model.addAttribute("orders", list);

        // 3. Cập nhật totalViewCount (Xử lý Race Condition)
        synchronized (application) {
            Integer count = (Integer) application.getAttribute("totalViewCount");
            if (count == null) count = 0;
            application.setAttribute("totalViewCount", count + 1);
        }

        return "orders";
    }
}