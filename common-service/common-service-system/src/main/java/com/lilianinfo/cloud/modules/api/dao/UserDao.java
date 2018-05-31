package com.lilianinfo.cloud.modules.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.api.entity.UserEntity;
import com.lilianinfo.cloud.modules.sys.dao.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * 用户
 * 
 * @author kaka
 *  
 * @date 2017-03-23 15:22:06
 */
@Repository
@Mapper
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
