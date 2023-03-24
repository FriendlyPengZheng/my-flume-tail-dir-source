package com.cn.taildir.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/job")
public class JobController {

    @RequestMapping("/start")
    public String start(){
        //todo 完成开启任务
        return "ok";
    }
}
