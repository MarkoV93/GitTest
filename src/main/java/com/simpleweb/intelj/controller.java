package com.simpleweb.intelj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Marko on 17.11.2016.
 */
@Controller
public class controller {

    @RequestMapping(value="/")
    public String home(){
        System.out.println("aaaaaassssssssss");
        return "hello";
    }

    @RequestMapping(value="/action")
    public String action(){
        System.out.println("aaaaaassssssssss");
        return "action";
    }

}
