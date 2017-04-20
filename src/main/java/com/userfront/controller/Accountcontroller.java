package com.userfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 이민규 on 2017-04-20.
 */
@Controller
@RequestMapping("/account")
public class Accountcontroller {

    @RequestMapping("/primaryAccount")
    public String primaryAccount() {
        return "primaryAccount";
    }

    @RequestMapping("/savingsAccount")
    public String savingsAccount() {
        return "savingsAccount";
    }

}
