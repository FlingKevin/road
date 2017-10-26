package com.kevin.road.exerciseone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Kevin
 * @Description: spring mvc 多个module测试controller
 * @Date: 17/10/25
 */
@Controller
@RequestMapping("exerciseOne")
public class ExerciseOneController {


    @ResponseBody
    @RequestMapping("oneMethod")
    public String exerciseOneMethod(){
        System.out.println("这个controller的实际路径是exerciseOne/oneMethod");
        return "这个controller的实际路径是exerciseOne/oneMethod";
    }
}
