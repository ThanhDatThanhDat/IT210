package org.example.SS02.bai5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() { return "login"; }

    @PostMapping("/login")
    public String doLogin(@RequestParam String username, @RequestParam String password,
                          HttpSession session, Model model) {
        // Tài khoản Hardcode
        boolean isAdmin = "hr_manager".equals(username) && "hr123".equals(password);
        boolean isStaff = "hr_staff".equals(username) && "staff456".equals(password);

        if (isAdmin || isStaff) {
            session.setAttribute("loggedUser", username);
            session.setAttribute("role", isAdmin ? "hr_manager" : "hr_staff");
            return "redirect:/employees";
        }

        model.addAttribute("errorMessage", "Sai tài khoản hoặc mật khẩu!");
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}