package com.bbubbush.convert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovePageController {

    @GetMapping("main")
    public String goMain() {
        return "index";
    }

}
