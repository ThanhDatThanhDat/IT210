package org.example.SS02.bai1;

public class p1 {
//    PHẦN 1 — PHÂN TÍCH LOGIC
//Câu 1: Lỗi trong MyWebAppInitializer.java (Servlet Mapping)
//
//Giải thích: Khi cấu hình getServletMappings() trả về "/api/*", DispatcherServlet chỉ tiếp nhận và xử lý các Request có đường dẫn bắt đầu bằng /api/.
//
//Hậu quả: Khi bạn truy cập /welcome, nó không khớp với pattern /api/*. Do đó, Tomcat không gửi request này vào Spring MVC mà tìm kiếm một tài nguyên tĩnh hoặc servlet khác, dẫn đến lỗi 404 Not Found.
//
//Đúng ra: Phải để / để DispatcherServlet làm "Front Controller" đón tất cả các request.
//
//Câu 2: Lỗi trong WebConfig.java (ComponentScan)
//
//Giải thích: @ComponentScan(basePackages = "com.demo.service") chỉ định cho Spring quét các Bean (như @Service) trong package service.
//
//Hậu quả: Spring sẽ không tìm thấy các class được đánh dấu @Controller nằm ở package com.demo.controller. Vì Controller không được đăng ký vào Spring Container, HandlerMapping sẽ không có dữ liệu để ánh xạ URL /welcome tới phương thức xử lý tương ứng.
//
//Vị trí tìm thấy: com.demo.service. Vị trí không tìm thấy: com.demo.controller.
//
//Câu 3: Tổng hợp
//
//Trả lời: Ứng dụng KHÔNG chạy được.
//
//Tại sao: Ngay cả khi bạn sửa lỗi 1 để Request đi vào được Spring MVC, thì ở lỗi 2, Spring vẫn không tìm thấy Controller nào xử lý URL /welcome. Spring sẽ tiếp tục trả về 404 (hoặc báo lỗi nếu không tìm thấy Handler phù hợp) vì không có Bean Controller nào tồn tại trong Context để thực thi logic.
}
