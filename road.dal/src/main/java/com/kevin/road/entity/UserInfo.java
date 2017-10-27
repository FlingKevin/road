package com.kevin.road.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: Kevin
 * @Description:
 * @Date: 17/10/27
 */
@Setter
@Getter
@ToString
public class UserInfo {
    private Integer id; //主键;

    private Integer creatorId;// 创建人id';

    private Date gmtCreate;//创建时间';

    private Integer modifierId;//修改人id',

    private Date gmtModified;//'修改时间';

    private String isDeleted;//是否删除';

    private String userName;//用户名称';

    private String nickName;//昵称';

    private String userQq;//qq';

    private String mobilePhone;//手机号码';

    private String userGender;//性别：A:未知，M:男，F:女';

    private String userBirthday;//生日';

    private Integer provinceId;//省';

    private Integer cityId;//市';

    private Integer districtId;//区'

    private Integer streetId;//街道';

    private String addressInfo;//详细地址';

    private String jobTitle;//职位';

    private String personalEmail;//个人邮箱';
}
