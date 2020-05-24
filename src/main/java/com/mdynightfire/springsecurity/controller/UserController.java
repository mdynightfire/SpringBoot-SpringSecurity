package com.mdynightfire.springsecurity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

/**
 * @author mdynightfire
 */
@Slf4j
@Controller
public class UserController {

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal Principal principal, Model model) {
        log.info("UserController.user");
        model.addAttribute("username", principal.getName());
        return "user/user";
    }

}
