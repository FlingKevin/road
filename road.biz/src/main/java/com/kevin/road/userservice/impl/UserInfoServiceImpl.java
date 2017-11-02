package com.kevin.road.userservice.impl;

import com.kevin.road.dao.user.UserInfoMapper;
import com.kevin.road.entity.UserInfo;
import com.kevin.road.userservice.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Kevin
 * @Description:
 * @Date: 17/10/27
 */
@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    @Transactional
    public Integer addUser() {
        return null;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<UserInfo> queryUserList() {
        log.info("开始查询用户全部信息,没有参数!");
        return userInfoMapper.selectUserList();
    }
}
