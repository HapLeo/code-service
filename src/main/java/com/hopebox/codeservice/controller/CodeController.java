package com.hopebox.codeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code")
public class CodeController {

    public Object getSimpleMethodCode(String methodName,String ... params){

        return "getSimpleMethodCode";
    }

}
