package com.zhang.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhang.provider.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @program: dubbo测试服务接口
 * @description:
 * @author: 寻。
 **/
@Component
@Service(group = "dubbo-demo", version = "2.0.0")
public class DemoServiceImpl implements DemoService{

    /**
     * sayHello
     * @param hello
     * @return
     */
    @Override
    public String sayHello(String hello) {
        return hello+"：dubbo服务接口调用成功。。。";
    }
}
