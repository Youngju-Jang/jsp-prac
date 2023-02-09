package com.example.mvcjsp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class HomeController {
     
     @GetMapping ("/home")
     public String home() {
          return "home";
//          return "/WEB-INF/views/home.jsp";
     }
}
