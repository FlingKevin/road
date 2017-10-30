package com.kevin.road.dao.user;

import com.kevin.road.dao.common.MyBatisRepository;
import com.kevin.road.entity.UserInfo;

import java.util.List;

/**
 * @Author: Kevin
 * @Description:
 * @Date: 17/10/27
 */
@MyBatisRepository
public interface UserInfoMapper {

    List<UserInfo> selectUserList();

    int insert(UserInfo userInfo);
}
