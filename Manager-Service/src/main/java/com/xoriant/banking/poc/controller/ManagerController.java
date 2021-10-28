package com.xoriant.banking.poc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ManagerController {
    @Value("${spring.application.name}")
    
    
    String appName;

    
//    @RequestMapping
//    public String index(Model model) {
//        model.addAttribute("appName", appName);
//        return "Welcome Page..!";
//    }
    
    @RequestMapping(value="/home",method=RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
        
    }
        @GetMapping("/greeting")
        public String greetingForm(Model model) {
          model.addAttribute("greeting", new Greeting());
          return "greeting";
        }

        @PostMapping("/greeting")
        public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
          model.addAttribute("greeting", greeting);
          return "result";
        }
        
    
}