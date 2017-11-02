package com.kevin.road.userinfo;

import com.kevin.road.entity.UserInfo;
import com.kevin.road.userservice.UserInfoService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Controller
@RequestMapping("userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping("userList")
    public List<UserInfo> queryUserList(){
        log.info("查询全部用户信息开始!");
        return userInfoService.queryUserList();
    }
}
