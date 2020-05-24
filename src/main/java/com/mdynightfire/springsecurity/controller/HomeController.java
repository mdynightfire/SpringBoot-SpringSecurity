package com.mdynightfire.springsecurity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mdynightfire
 */
@Slf4j
@Controller
public class HomeController {

    @GetMapping("/login")
    public String login() {
        log.info("login");
        return "login";
    }

}
