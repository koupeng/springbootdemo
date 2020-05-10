package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/5/10.
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "SpringBootDemo for test";
    }
}
