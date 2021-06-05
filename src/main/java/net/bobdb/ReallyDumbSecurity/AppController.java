package net.bobdb.ReallyDumbSecurity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {
    @Value("${spring.application.name}")
    String appName2;

    @GetMapping("/")
    public String root(Model model) {
        model.addAttribute("appName", appName2);
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
