package test_springboots.example.spring_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AllTaskList {

    @GetMapping("/task1")
    public String task1() {
        return "task1";
    }

    @GetMapping("/task2")
    public String task2() {
        return "task2";
    }

    @GetMapping("/task3")
    public String task3() {
        return "task3";
    }

    @GetMapping("/task4")
    public String task4() {
        return "task4";
    }

    @GetMapping("/task5")
    public String task5Login() {
        return "task2";
    }

    // Handle form submission
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {
        // Validate login
        if ("chansuvannet".equals(username) && "123456".equals(password)) {
            return "redirect:/dashbord";
        } else {
            model.addAttribute("error", "Invalid username or password.");
            return "task2";
        }
    }

    // Serve the dashboard
    @GetMapping("/dashbord")
    public String task5() {
        return "task5";
    }

}
