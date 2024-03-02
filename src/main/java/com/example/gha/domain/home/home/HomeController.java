package com.example.gha.domain.home.home;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class HomeController {


    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "55a";
    }



}
