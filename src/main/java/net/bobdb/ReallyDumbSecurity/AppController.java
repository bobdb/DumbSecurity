package net.bobdb.ReallyDumbSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

    @Autowired
    TokenService tokenService;

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

    @GetMapping("/authorizedHello")
    public String authorizedhello() {
        DumbToken token = new DumbToken("dafsdfasdfasdf"); //TODO, get from interceptor
        if (tokenService.isOk(token)) //TODO this always returns true;
            return "authorizedhello";
        else
            return "error-badtoken";
    }


}
