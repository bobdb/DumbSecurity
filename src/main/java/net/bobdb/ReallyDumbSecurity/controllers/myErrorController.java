package net.bobdb.ReallyDumbSecurity.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class myErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return "error-404";
            }

            if(statusCode == HttpStatus.METHOD_NOT_ALLOWED.value()) {
                return "error-405";
            }

            if(statusCode == HttpStatus.UNAUTHORIZED.value()) {
                return "error-badtoken"; // TODO needs to actually get caught
            }

//            if(statusCode == HttpStatus.NOT_FOUND.value()) {
//                return "error-404";
//            }

        }
        return "error";
    }

}
