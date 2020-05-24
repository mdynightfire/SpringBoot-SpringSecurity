package com.mdynightfire.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mdynightfire
 */
@Controller
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
