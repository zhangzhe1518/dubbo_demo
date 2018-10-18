package com.zhang.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhang.provider.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program:
 * @description:
 * @author: 寻。
 **/
@Controller
@RequestMapping("/dubbo")
public class DemoController {

    @Reference(group = "dubbo-demo", version = "2.0.0")
    private DemoService demoService;

    @GetMapping("/sayHello/{hello}")
    @ResponseBody
    public String sayHello(@PathVariable String hello){
       return demoService.sayHello(hello);
    }
}
