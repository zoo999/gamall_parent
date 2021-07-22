package com.atguigu.gmall.logger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController=@Controller+@ResponseBody
//@Controller
@RestController
public class LoggerController {
//    @RequestMapping("/applog")
//    @ResponseBody
//    public String log(){
//        System.out.println("123");
//        return "abc";
//    }

//@RequestMapping("/applog")
//    public String log() {
//        System.out.println("123");
//        return "abc";
//    }

    //浏览器传入参数访问
//    @RequestMapping("/applog")
//    public String log(@RequestParam("log") String log) {
//        System.out.println(log);
//        return log;
//    }

    //传入请求体，浏览器是传入不了的，只能通过写代码发送
    @RequestMapping("/applog")
    public String log(@RequestBody String log) {
        System.out.println(log);
        return log;
    }
}
