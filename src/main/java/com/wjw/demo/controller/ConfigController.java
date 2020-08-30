package com.wjw.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WJW
 * @date 2020-08-30 10:40
 */
@Controller
@RequestMapping("config")
public class ConfigController {
    @NacosValue(value = "${hello.name.world}", autoRefreshed = true)
    private String helloName;

    @GetMapping(value = "/get")
    @ResponseBody
    public String get() {
        return helloName;
    }
}