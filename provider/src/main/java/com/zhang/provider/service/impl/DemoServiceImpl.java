package com.zhang.provider.service.impl;

import com.zhang.provider.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @program: dubbo测试服务接口
 * @description:
 * @author: 寻。
 * @create: 2018-05-19 23:25
 **/
@Service
public class DemoServiceImpl implements DemoService{

    /**
     * 测试方法
     * @return
     */
    @Override
    public String demo() {
        return "恭喜：dubbo服务接口调用成功。。。";
    }
}
