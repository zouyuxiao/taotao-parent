package com.yuxiao.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ${邹} on 2019/2/3.
 * 描述：
 */
@Controller
@RequestMapping("/api/main")
public class MainController {
    @RequestMapping("/backstage/{page}")
    public String home(@PathVariable String page){
        return page;
    }
    @RequestMapping("/backstage/index")
    public String home2(){
        return "index";
    }
}
