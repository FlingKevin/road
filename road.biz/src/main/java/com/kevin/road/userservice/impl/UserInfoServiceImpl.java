package com.kevin.road.userservice.impl;

import com.kevin.road.dao.user.UserInfoMapper;
import com.kevin.road.entity.UserInfo;
import com.kevin.road.userservice.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Kevin
 * @Description:
 * @Date: 17/10/27
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> queryUserList() {
        return userInfoMapper.selectUserList();
    }
}
