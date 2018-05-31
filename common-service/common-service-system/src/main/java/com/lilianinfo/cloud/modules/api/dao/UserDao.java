package com.lilianinfo.cloud.modules.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.api.entity.UserEntity;
import com.lilianinfo.cloud.modules.sys.dao.BaseDao;

/**
 * 用户
 * 
 * @author kaka
 *  
 * @date 2017-03-23 15:22:06
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
