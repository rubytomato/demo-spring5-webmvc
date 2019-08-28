package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Value("${application.name}")
    private String appName;

    @GetMapping(value = "/")
    public String hello(HttpServletRequest req, Model model) {
    	LOG.debug("call hello - UA : {}", req.getHeader("User-Agent"));
        model.addAttribute("message", "Hello World");
        model.addAttribute("now", LocalDateTime.now());
        model.addAttribute("appName", appName);
        List<String> fruits = List.of("apple", "banana", "cherry");
        model.addAttribute("fruits", fruits);
        return "hello";
    }

}
