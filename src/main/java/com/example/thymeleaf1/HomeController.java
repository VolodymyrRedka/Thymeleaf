package com.example.thymeleaf1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public String home(Model model) {
        model.addAttribute("message", "Привіт, світ!");
        return "home";
    }

}
