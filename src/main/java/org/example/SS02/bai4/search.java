package org.example.SS02.bai4;

public class search {
//    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
//<%-- Khai báo các thư viện JSTL cần thiết --%>
//<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
//<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
//<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
//
//<html>
//<head>
//    <title>Tìm kiếm sự kiện</title>
//    <style>
//        .out-of-stock { color: red; font-weight: bold; }
//        .low-stock { color: orange; }
//        .in-stock { color: green; }
//        .badge-free { background: #28a745; color: white; padding: 2px 5px; border-radius: 3px; }
//        .disabled-link { color: gray; pointer-events: none; text-decoration: none; }
//    </style>
//</head>
//<body>
//
//    <div class="header">
//        <%-- A. Hiển thị kết quả tìm kiếm an toàn --%>
//        <h1>Kết quả tìm kiếm cho: "<c:out value="${keyword}" />"</h1>
//        <p>Số ký tự từ khóa: ${fn:length(keyword)} ký tự.</p>
//
//        <c:choose>
//            <c:when test="${not empty events}">
//                <p>Tìm thấy <strong>${fn:length(events)}</strong> sự kiện.</p>
//            </c:when>
//            <c:otherwise>
//                <p style="color: red;">Không tìm thấy sự kiện nào phù hợp.</p>
//            </c:otherwise>
//        </c:choose>
//    </div>
//
//    <%-- B. Bảng kết quả --%>
//    <c:if test="${not empty events}">
//        <table border="1" width="100%" cellpadding="10" style="border-collapse: collapse;">
//            <thead>
//                <tr style="background: #f2f2f2;">
//                    <th>STT</th>
//                    <th>Tên sự kiện</th>
//                    <th>Ngày tổ chức</th>
//                    <th>Giá vé</th>
//                    <th>Vé còn lại</th>
//                    <th>Thao tác</th>
//                </tr>
//            </thead>
//            <tbody>
//                <c:forEach items="${events}" var="event" varStatus="status">
//                    <tr>
//                        <td>${status.count}</td>
//                        <%-- Chống XSS cho tên sự kiện --%>
//                        <td><c:out value="${event.name}" /></td>
//                        <td>${event.date}</td>
//                        <td>
//                            <c:choose>
//                                <c:when test="${event.price == 0}">
//                                    <span class="badge-free">MIỄN PHÍ</span>
//                                </c:when>
//                                <c:otherwise>
//                                    <fmt:formatNumber value="${event.price}" type="number" groupingUsed="true" /> VNĐ
//                                </c:otherwise>
//                            </c:choose>
//                        </td>
//                        <td>
//                            <c:choose>
//                                <c:when test="${event.remainingTickets == 0}">
//                                    <span class="out-of-stock">HẾT VÉ</span>
//                                </c:when>
//                                <c:when test="${event.remainingTickets < 10}">
//                                    <span class="low-stock">Sắp hết (còn ${event.remainingTickets} vé)</span>
//                                </c:when>
//                                <c:otherwise>
//                                    <span class="in-stock">Còn vé (${event.remainingTickets})</span>
//                                </c:otherwise>
//                            </c:choose>
//                        </td>
//                        <td>
//                            <c:url value="/events/${event.id}/book" var="bookUrl" />
//                            <c:choose>
//                                <c:when test="${event.remainingTickets == 0}">
//                                    <span class="disabled-link">Đặt vé (Hết vé)</span>
//                                </c:when>
//                                <c:otherwise>
//                                    <a href="${bookUrl}">Đặt vé ngay</a>
//                                </c:otherwise>
//                            </c:choose>
//                        </td>
//                    </tr>
//                </c:forEach>
//            </tbody>
//        </table>
//    </c:if>
//
//    <%-- C. Phần footer --%>
//    <div class="footer" style="margin-top: 20px; border-top: 1px solid #ccc; padding-top: 10px;">
//        <c:if test="${not empty events}">
//            <p>Sự kiện nổi bật nhất:
//                <strong>${fn:toUpperCase(events[0].name)}</strong>
//            </p>
//        </c:if>
//    </div>
//
//</body>
//</html>
}
