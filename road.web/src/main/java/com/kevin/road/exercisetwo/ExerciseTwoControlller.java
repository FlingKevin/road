package com.kevin.road.exercisetwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Kevin
 * @Description:
 * @Date: 17/10/25
 */
@Controller
@RequestMapping("exerciseTwo")
public class ExerciseTwoControlller {

    @ResponseBody
    @RequestMapping("oneMethod")
    public Integer exerciseOneMethod(){
        System.out.println("这个controller的实际路径是exerciseTwo/oneMethod,输出值是2");
        return 2;
    }
}
