package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {
    
    @GetMapping("output")
    public String getOutput() {
        // output.htmlに画面遷移
        return "output";
    }
    
    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("val", val);
        // output.htmlに画面遷移
        return "output";
    }
    
    @PostMapping("/input{val}/")
    public String postInput(@RequestParam("val") String val, Model model) {
        model.addAttribute("val", val);
        return "input{val}";
    }
    
}

