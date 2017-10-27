package com.kevin.road.userservice;

import com.kevin.road.entity.UserInfo;

import java.util.List;

/**
 * @Author: Kevin
 * @Description:
 * @Date: 17/10/27
 */
public interface UserInfoService {

    List<UserInfo> queryUserList();
}
