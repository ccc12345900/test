package com.example.happybir.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class birthdayController {

    @RequestMapping("/flh")
    public String flh()
    {
        return "index";
    }

    @RequestMapping("/input")
    public String birth()
    {
        return "input";
    }

    @RequestMapping("/heart")
    public String heart()
    {
        return "test";
    }

}
