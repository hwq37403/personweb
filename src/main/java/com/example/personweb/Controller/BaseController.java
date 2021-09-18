package com.example.personweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @Author 黄万强
 * @Date 2021/8/18 10:19
 * @注释
 */
@Controller
public class BaseController {
    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/singleblog")
    public String singleblog(){
        return "single-blog-3";
    }




    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
