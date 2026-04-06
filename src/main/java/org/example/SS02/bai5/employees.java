package org.example.SS02.bai5;

public class employees {
//    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
//<%@ taglib prefix="c" uri="jakarta.tags.core" %>
//<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
//
//<html>
//<head><title>Mini Portal Nhân sự</title></head>
//<body style="font-family: Arial;">
//    <div style="background: #eee; padding: 10px;">
//        Chào <b><c:out value="${sessionScope.loggedUser}"/></b> (${sessionScope.role}) |
//        <a href="<c:url value='/logout'/>">Đăng xuất</a>
//    </div>
//
//    <h2>Danh sách nhân viên</h2>
//    <table border="1" width="100%" cellpadding="8" style="border-collapse: collapse;">
//        <tr style="background: #ddd;">
//            <th>STT</th><th>Mã NV</th><th>Họ tên</th><th>Phòng</th><th>Lương</th><th>Ngày vào</th><th>Trạng thái</th><th>Hành động</th>
//        </tr>
//        <c:forEach items="${employeeList}" var="e" varStatus="s">
//            <tr>
//                <td>${s.count}</td>
//                <td><c:out value="${e.code}"/></td>
//                <td><c:out value="${e.name}"/></td>
//                <td>${e.dept}</td>
//                <td><fmt:formatNumber value="${e.salary}" type="currency" currencyCode="VND"/></td>
//                <td><fmt:formatDate value="${e.date}" pattern="dd/MM/yyyy"/></td>
//                <td>
//                    <c:if test="${e.status == 'Đang làm'}"><span style="color:green">${e.status}</span></c:if>
//                    <c:if test="${e.status == 'Nghỉ phép'}"><span style="color:orange">${e.status}</span></c:if>
//                    <c:if test="${e.status == 'Thử việc'}"><span style="color:blue">${e.status}</span></c:if>
//                </td>
//                <td><a href="<c:url value='/employees/${e.code}'/>">Xem chi tiết</a></td>
//            </tr>
//        </c:forEach>
//    </table>
//
//    <p>Tổng lương phòng Kỹ thuật: <b><fmt:formatNumber value="${totalTech}" type="currency" currencyCode="VND"/></b></p>
//</body>
//</html>
}
