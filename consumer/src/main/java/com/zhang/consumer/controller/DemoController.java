package com.zhang.consumer.controller;

import com.zhang.provider.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program:
 * @description:
 * @author: 寻。
 * @create: 2018-05-19 23:44
 **/
@Controller
@RequestMapping("/dubbo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/")
    @ResponseBody
    public String demo(){
       return demoService.demo();
    }
}
