package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("input")
    public String getInput(Model model) {
        // input.htmlに画面遷移
        return "input";
    }
    
    @PostMapping("/input{val}/")
    public String postInput(@RequestParam("val") String val, Model model) {
        model.addAttribute("val", val);
        return "input{val}";
    }
    
}
