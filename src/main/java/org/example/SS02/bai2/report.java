package org.example.SS02.bai2;

public class report {
//    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
//<%-- Khai báo thư viện JSTL Core --%>
//<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
//
//<html>
//<head>
//    <title>Báo cáo kết quả học tập</title>
//    <style>
//        .weak { color: red; font-weight: bold; }
//        .good { color: green; }
//    </style>
//</head>
//<body>
//    <%-- Ghi chú nội bộ: Hiển thị tên người dùng an toàn với c:out để chống XSS --%>
//    <h2>Báo cáo của: <c:out value="${param.user}" default="Khách" /></h2>
//
//    <table border="1" cellpadding="10">
//        <thead>
//            <tr>
//                <th>STT</th>
//                <th>Tên sinh viên</th>
//                <th>Điểm số</th>
//                <th>Xếp loại</th>
//            </tr>
//        </thead>
//        <tbody>
//            <%-- Dùng c:forEach thay thế vòng lặp for Scriptlet --%>
//            <c:forEach items="${studentList}" var="student" varStatus="loop">
//                <tr>
//                    <td>${loop.index + 1}</td>
//                    <td><c:out value="${student.name}" /></td>
//                    <td>${student.score}</td>
//                    <td>
//                        <%-- Tái cấu trúc logic hiển thị bằng c:choose (thay cho if/else) --%>
//                        <c:choose>
//                            <c:when test="${student.score < 5}">
//                                <span class="weak">Yếu</span>
//                            </c:when>
//                            <c:when test="${student.score >= 8}">
//                                <span class="good">Giỏi</span>
//                            </c:when>
//                            <c:otherwise>
//                                <span>Trung bình/Khá</span>
//                            </c:otherwise>
//                        </c:choose>
//                    </td>
//                </tr>
//            </c:forEach>
//        </tbody>
//    </table>
//
//    <%-- Thông báo nếu danh sách trống --%>
//    <c:if test="${empty studentList}">
//        <p>Không có dữ liệu sinh viên để hiển thị.</p>
//    </c:if>
//</body>
//</html>
}
