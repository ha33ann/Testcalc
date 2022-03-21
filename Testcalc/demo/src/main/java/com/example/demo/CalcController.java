package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalcController{
     //example: http://localhost:8080/math/?operation=multiplication&value1=10&value2=20
    @RequestMapping("/math/")
    public String math(String operation, float value1, float value2) {
        float result = 0;
        switch(operation) {
            case "addition":
                result = value1 + value2;
                break;
            case "subtraction":
                result = value1 - value2;
                break;
            case "multiplication":
                result = value1*value2;
                break;
            case "division":
                result = value1/value2;
                break;
        }
        String returnValue = String.valueOf(result);
        return returnValue;


    }

}