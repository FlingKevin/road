package com.kevin.road.userinfo;

import com.kevin.road.entity.UserInfo;
import com.kevin.road.userservice.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Kevin
 * @Description:
 * @Date: 17/10/27
 */
@Controller
@RequestMapping("userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping("userList")
    public List<UserInfo> queryUserList(){
        return userInfoService.queryUserList();
    }
}
