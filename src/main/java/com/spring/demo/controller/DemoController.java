package com.spring.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/isNumeric/{val}")
    public String validate(@PathVariable(value = "val")String val) {
        try {
            Double.parseDouble(val);
            return val + " is numeric";
        } catch (NumberFormatException e) {
            return val + " is not numeric";
        }
    }
}
