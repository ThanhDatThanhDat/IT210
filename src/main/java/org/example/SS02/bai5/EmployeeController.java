package org.example.SS02.bai5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    // Dữ liệu mẫu (Thay cho Service để gọn file)
    private List<Map<String, Object>> getMockEmployees() {
        List<Map<String, Object>> list = new ArrayList<>();
        list.add(createEmp("NV001", "Nguyễn Thị Lan", "Kế toán", 15000000, "Đang làm"));
        list.add(createEmp("NV002", "Trần Văn Hùng", "Kỹ thuật", 25000000, "Đang làm"));
        list.add(createEmp("NV003", "Lê Minh Đức", "Kinh doanh", 18500000, "Nghỉ phép"));
        list.add(createEmp("NV004", "Phạm Thu Hương", "Kỹ thuật", 22000000, "Đang làm"));
        list.add(createEmp("NV005", "Hoàng Văn Nam", "Kế toán", 12000000, "Thử việc"));
        return list;
    }

    private Map<String, Object> createEmp(String code, String name, String dept, double sal, String status) {
        Map<String, Object> emp = new HashMap<>();
        emp.put("code", code); emp.put("name", name); emp.put("dept", dept);
        emp.put("salary", sal); emp.put("status", status); emp.put("date", new Date());
        return emp;
    }

    @GetMapping
    public String list(HttpSession session, Model model) {
        if (session.getAttribute("loggedUser") == null) return "redirect:/login";

        List<Map<String, Object>> emps = getMockEmployees();
        double totalTech = emps.stream()
                .filter(e -> "Kỹ thuật".equals(e.get("dept")))
                .mapToDouble(e -> (double) e.get("salary")).sum();

        model.addAttribute("employeeList", emps);
        model.addAttribute("totalTech", totalTech);
        return "employees";
    }

    @GetMapping("/{code}")
    public String detail(@PathVariable String code, HttpSession session, Model model) {
        if (session.getAttribute("loggedUser") == null) return "redirect:/login";

        Map<String, Object> emp = getMockEmployees().stream()
                .filter(e -> e.get("code").equals(code)).findFirst().orElse(null);

        if (emp == null) throw new RuntimeException("Nhân viên " + code + " không tồn tại!");

        model.addAttribute("emp", emp);
        return "detail";
    }
}