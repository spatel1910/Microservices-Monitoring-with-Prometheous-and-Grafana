package com.deutschebank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/emp")
    public String getEmpName(){
        return "Sandeep Kumar Patel";
    }
}
