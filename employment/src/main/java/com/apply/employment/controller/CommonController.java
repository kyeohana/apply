package com.apply.employment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CommonController {

    @GetMapping("/main")
    public String japanHtml() {
        return "main/main";
    }

}
